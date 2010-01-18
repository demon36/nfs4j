/*
 * Automatically generated by jrpcgen 1.0.7 on 2/21/09 1:22 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package org.dcache.chimera.nfs.v4.xdr;
import org.dcache.xdr.*;
import java.io.IOException;

public class layoutreturn_file4 implements XdrAble {
    public offset4 lrf_offset;
    public length4 lrf_length;
    public stateid4 lrf_stateid;
    public byte [] lrf_body;

    public layoutreturn_file4() {
    }

    public layoutreturn_file4(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        lrf_offset.xdrEncode(xdr);
        lrf_length.xdrEncode(xdr);
        lrf_stateid.xdrEncode(xdr);
        xdr.xdrEncodeDynamicOpaque(lrf_body);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        lrf_offset = new offset4(xdr);
        lrf_length = new length4(xdr);
        lrf_stateid = new stateid4(xdr);
        lrf_body = xdr.xdrDecodeDynamicOpaque();
    }

}
// End of layoutreturn_file4.java