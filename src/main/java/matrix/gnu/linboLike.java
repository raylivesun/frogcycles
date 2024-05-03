/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package matrix.gnu;

import sun.jvm.hotspot.oops.Array;
import sun.jvm.hotspot.runtime.BasicType;

/**
 *
 * @author admin
 */
public interface linboLike {
    
    // linbo like perform static
    public static void Like(String[] among) {
        Array.alignObjectSize(2245);
        Array.baseOffsetInBytes(BasicType.T_BYTE);
        Array.getHeaderSize();
    }
    
    // rmn static version to attributes
    public static void RMN(String[] attr) {
        Array.alignObjectOffset(2245);
        Array.alignObjectSize(2245);
        Array.baseOffsetInBytes(BasicType.T_BYTE);
        Array.getHeaderSize();
    }
    
    // Crossing values of rates version
    public static void Rates(String[] version) {
        version.getClass();
    }
    
}
