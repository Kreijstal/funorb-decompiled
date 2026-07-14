/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class vd {
    private int field_h;
    static String[] field_i;
    private BitSet field_b;
    static String field_c;
    static ed[] field_f;
    static String[] field_d;
    private boolean field_k;
    private ei field_a;
    private BitSet field_e;
    static hh field_g;
    private int field_j;

    final boolean a(int param0, int param1) {
        if (param0 != 1) {
            ((vd) this).field_e = null;
        }
        return this.a(param1, ((vd) this).field_h, -32, ((vd) this).field_e);
    }

    private final BitSet a(int param0, BitSet param1, int param2, BitSet param3) {
        if (param0 != 0) {
            ((vd) this).a(44, 44, true);
        }
        BitSet var5 = param1;
        if (param1 != null) {
            if (!(param3 == null)) {
                var5.or(param3);
            }
        }
        if (param1 == null) {
            if (!(param3 == null)) {
                var5 = param3;
            }
        }
        if (param1 == null) {
            if (!(param3 != null)) {
                var5 = new BitSet(param2);
            }
        }
        return var5;
    }

    private final void e(byte param0) {
        if (param0 > -33) {
            field_d = null;
        }
        byte[] var4 = this.a(false);
        byte[] var2 = var4;
        if (var4 == null) {
            return;
        }
        bd var3 = new bd(var4);
        ca.a(1, 6, var3);
    }

    public static void c(byte param0) {
        field_g = null;
        field_d = null;
        field_f = null;
        field_c = null;
        field_i = null;
        if (param0 < 5) {
            field_d = null;
        }
    }

    private final BitSet a(DataInputStream param0, int param1, BitSet param2, int param3) throws IOException {
        if (param1 != 3) {
            return null;
        }
        int var5 = param0.readUnsignedByte();
        int var6 = 8 * var5;
        if (!(param3 >= var6)) {
            return param2;
        }
        BitSet var7 = this.a(param3, param0, var5, 0);
        BitSet var8 = this.a(0, param2, param3, var7);
        return var8;
    }

    final static ed[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 1317) {
            return null;
        }
        return ge.a(1, param0, 1, 1, param1, (byte) 33, param2, param3, 3);
    }

    private final BitSet a(int param0, DataInputStream param1, int param2, int param3) throws IOException {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = EscapeVector.field_A;
        BitSet var5 = new BitSet(param0);
        for (var6 = param3; var6 < param2; var6++) {
            var7 = param1.readByte();
            var8 = var6 * 8;
            var5 = this.a((byte) var7, param3 ^ -98, var5, param0, var8);
        }
        return var5;
    }

    private final void b(byte param0) {
        if (param0 != -106) {
            return;
        }
        ((vd) this).field_j = pc.a(2513, 2);
        ((vd) this).field_b = new BitSet(((vd) this).field_j);
    }

    final void a(int param0, int param1, boolean param2) {
        if (-2 == (param0 ^ -1)) {
            this.a(-1, param1, ((vd) this).field_e, ((vd) this).field_h);
        }
        if (!param2) {
            ((vd) this).field_k = false;
        }
        if (!(-1 != (param0 ^ -1))) {
            this.a(-1, param1, ((vd) this).field_b, ((vd) this).field_j);
        }
    }

    private final boolean a(int param0, int param1, int param2, BitSet param3) {
        if (!((vd) this).field_k) {
            return false;
        }
        if (param3 == null) {
            return false;
        }
        if (param2 >= -22) {
            return true;
        }
        if (0 > param0) {
            return false;
        }
        if (param1 <= param0) {
            return false;
        }
        if (param0 >= param3.size()) {
            return false;
        }
        return param3.get(param0);
    }

    private final byte a(boolean param0, int param1, int param2, BitSet param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = EscapeVector.field_A;
          var5 = param3.size();
          var6 = 0;
          var7 = 0;
          if (param0) {
            break L0;
          } else {
            ((vd) this).field_j = 35;
            break L0;
          }
        }
        L1: while (true) {
          if (8 <= var7) {
            return (byte)var6;
          } else {
            var8 = param1 - -var7;
            if (var5 <= var8) {
              return (byte)var6;
            } else {
              if (param3.get(var8)) {
                var10 = 1 << var7;
                var6 = var6 | var10;
                var7++;
                continue L1;
              } else {
                var7++;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(byte param0) {
        int var1 = -124 % ((param0 - -86) / 37);
        dl.field_a = false;
        int discarded$0 = om.field_g.e(0);
    }

    private final BitSet a(byte param0, int param1, BitSet param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          var11 = EscapeVector.field_A;
          if (param2 != null) {
            break L0;
          } else {
            param2 = new BitSet(param3);
            break L0;
          }
        }
        var6 = param0;
        if (param1 <= -14) {
          var7 = 0;
          L1: while (true) {
            if (-9 >= var7) {
              return param2;
            } else {
              L2: {
                var8 = 1 << var7;
                if (-1 == (var6 & var8)) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              var9 = stackIn_9_0;
              var10 = param4 - -var7;
              if (var9 == 0) {
                param2.clear(var10);
                var7++;
                continue L1;
              } else {
                param2.set(var10);
                var7++;
                continue L1;
              }
            }
          }
        } else {
          return null;
        }
    }

    private final byte[] a(int param0, int param1, BitSet param2) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = EscapeVector.field_A;
        if (param2 == null) {
            return null;
        }
        int var4 = this.a(-106, param2);
        if (param0 <= 21) {
            ((vd) this).field_e = null;
        }
        if (var4 >= param1) {
            return null;
        }
        int var5 = 1 + var4;
        if (-1 < (var5 ^ -1)) {
            return null;
        }
        int var6 = this.b(-1, var5);
        byte[] var7 = new byte[var6 - -1];
        var7[0] = (byte)var6;
        if (-1 <= (var6 ^ -1)) {
            return var7;
        }
        for (var8 = 0; var6 > var8; var8++) {
            var9 = 8 * var8;
            var10 = this.a(true, var9, param1, param2);
            var7[var8 - -1] = (byte)var10;
        }
        return var7;
    }

    private final byte[] a(boolean param0) {
        byte[] var4 = this.a(49, ((vd) this).field_j, ((vd) this).field_b);
        byte[] var2 = var4;
        if (var4 == null) {
            return this.a(1, (byte[]) null, (byte[]) null);
        }
        byte[] var3 = this.a(64, ((vd) this).field_h, ((vd) this).field_e);
        if (var3 == null) {
            return this.a(1, (byte[]) null, (byte[]) null);
        }
        if (param0) {
            return null;
        }
        return this.a(1, var4, var3);
    }

    private final void a(int param0, int param1, BitSet param2, int param3) {
        if (!(((vd) this).field_k)) {
            return;
        }
        if (!(param0 >= (param1 ^ -1))) {
            return;
        }
        if (!(param1 < param3)) {
            return;
        }
        if (!(param2 != null)) {
            return;
        }
        param2.set(param1);
        this.e((byte) -61);
    }

    final boolean d(byte param0) {
        if (param0 != -83) {
            ((vd) this).field_k = true;
        }
        return ((vd) this).field_k;
    }

    private final int a(int param0, BitSet param1) {
        int var4 = 0;
        int var6 = EscapeVector.field_A;
        if (!(param1 != null)) {
            return -1;
        }
        if (param0 > -22) {
            ((vd) this).field_j = -38;
        }
        int var3 = param1.size();
        if (-1 <= var3) {
            return -1;
        }
        for (var4 = -1 + var3; -1 <= var4; var4--) {
            if (!(!param1.get(var4))) {
                return var4;
            }
        }
        return -1;
    }

    final void b(int param0) {
        try {
            if (((vd) this).field_k) {
                return;
            }
            int var2 = -98 % ((-61 - param0) / 62);
            if (!(bj.e((byte) 112))) {
                ((vd) this).field_k = true;
                return;
            }
            if (!(((vd) this).field_a != null)) {
                ((vd) this).field_a = bc.a(6, 86);
            }
            ((vd) this).field_k = ((vd) this).field_a.field_g;
            if (((vd) this).field_k) {
                try {
                    this.a(-16331, ((vd) this).field_a.field_h);
                } catch (IOException iOException) {
                    System.out.println("Error reading game data");
                }
                ((vd) this).field_a = null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, byte[] param1) throws IOException {
        if (param1 == null) {
            return;
        }
        DataInputStream var3 = new DataInputStream((InputStream) (Object) new ByteArrayInputStream(param1));
        if (param0 != -16331) {
            field_g = null;
        }
        int var4 = var3.readUnsignedByte();
        if (-2 != (var4 ^ -1)) {
            return;
        }
        ((vd) this).field_b = this.a(var3, param0 ^ -16330, ((vd) this).field_b, ((vd) this).field_j);
        ((vd) this).field_e = this.a(var3, 3, ((vd) this).field_e, ((vd) this).field_h);
    }

    private final void a(int param0) {
        if (param0 < 103) {
            ((vd) this).field_h = -109;
        }
        ((vd) this).field_h = pc.a(2513, 3);
        ((vd) this).field_e = new BitSet(((vd) this).field_h);
    }

    private final byte[] a(int param0, byte[] param1, byte[] param2) {
        int var4 = param0;
        if (!(param1 == null)) {
            var4 = var4 + param1.length;
        }
        if (param2 != null) {
            var4 = var4 + param2.length;
        }
        byte[] var5 = new byte[var4];
        int var6 = 0;
        var6++;
        var5[var6] = (byte) 1;
        if (!(param1 == null)) {
            qg.a(param1, 0, var5, var6, param1.length);
            var6 = var6 + param1.length;
        }
        if (!(param2 == null)) {
            qg.a(param2, 0, var5, var6, param2.length);
            var6 = var6 + param2.length;
        }
        return var5;
    }

    final boolean a(int param0, byte param1) {
        int var3 = 55 / ((-51 - param1) / 61);
        return this.a(param0, ((vd) this).field_j, -107, ((vd) this).field_b);
    }

    vd() {
        this.b((byte) -106);
        this.a(127);
        ((vd) this).field_k = false;
    }

    private final int b(int param0, int param1) {
        if (!((param1 ^ -1) < param0)) {
            return 0;
        }
        int var3 = param1 / 8;
        if (0 != param1 % 8) {
            var3++;
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"Fuel Storage Unit 531", "Outlying Fuel Depot", "Fuel Production Caverns", "Cannister Elimination Run", "Mine Shafts", "Fortified Mine", "Mine Field", "Auto Destruct", "Drive Research Facility", "Engine Research Station", "Cold Fusion Laboratory", "High-security Research Cavern", "Growth Pod Caverns", "Mined Cloning Facility", "Genetic Research Laboratory", "Secluded Cloning Pods"};
        field_c = "Lives: ";
        field_i = new String[]{"The President sends his highest regards. Given your success so far we have one final mission for you. Your ultimate battle lies ahead, with the ultimate prize for the victor.", "The aliens have perfected cloning technology and are busy growing an unstoppable army of genetically enhanced soldiers. Destroy their growth pods before they can breed their army."};
    }
}
