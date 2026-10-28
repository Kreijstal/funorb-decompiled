/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static String[] field_e;
    int field_d;
    int field_f;
    static fk field_a;
    int field_c;
    int field_g;
    static String field_b;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 113) {
          field_b = (String) null;
        }
        field_e = null;
    }

    final static void a(byte param0) {
        int var3 = 0;
        int var26 = EscapeVector.obfuscationControl;
        try {
          CipherPacketBuffer var28 = om.field_g;
          int var2 = var28.readUnsignedByte(0);
          if (var2 == 0) {
            var3 = var28.readUnsignedShort(1952);
            ij var4 = (ij) (qd.field_n.first(false));
            while (var4 != null) {
              if (~var4.field_n != ~var3) {
                var4 = (ij) (qd.field_n.next((byte) 70));
                continue;
              }
              break;
            }
            if (var4 == null) {
              nm.a(16);
              return;
            }
            int var5 = var28.readUnsignedByte(0);
            if (var5 != 0) {
              int var6 = var4.field_h;
              int var7 = var4.field_j;
              bg.field_a[0].field_h = ck.field_r;
              bg.field_a[0].field_e = false;
              bg.field_a[0].field_a = null;
              for (int var8_int = 1; var5 > var8_int; var8_int++) {
                bg.field_a[var8_int].field_h = var28.c(false);
                bg.field_a[var8_int].field_e = false;
                if (var28.readUnsignedByte(0) != 1) {
                  bg.field_a[var8_int].field_a = null;
                } else {
                  bg.field_a[var8_int].field_a = var28.c(false);
                }
              }
              String[][] dupTemp$0 = new String[3][var6];
              var4.field_m = dupTemp$0;
              String[][] var8 = dupTemp$0;
              String[][] var9 = new String[3][var6];
              long[][] dupTemp$1 = new long[3][var6];
              var4.field_k = dupTemp$1;
              long[][] var10 = dupTemp$1;
              int[][] dupTemp$2 = new int[3][var7 * var6];
              var4.field_o = dupTemp$2;
              int[][] var11 = dupTemp$2;
              int var12 = 0;
              int var13 = 0;
              int var14 = 0;
              int var15 = 0;
              int var16 = 0;
              int var17 = 0;
              int var18 = var28.readUnsignedByte(0);
              if (var18 > 0) {
                for (int var19 = 0; var18 > var19; var19++) {
                  int var20 = var28.readUnsignedByte(0);
                  String var21 = bg.field_a[var20].field_h;
                  long var22 = var28.i(-800509813);
                  int var24 = var28.position;
                  if (var6 > var19) {
                    var8[0][var12] = var21;
                    var9[0][var12] = bg.field_a[var20].field_a;
                    var10[0][var12] = var22;
                    for (int var25 = 0; var7 > var25; var25++) {
                      int incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var28.readInt(-5053);
                    }
                    var12++;
                  }
                  if (var21 != null &&
                    SeekerMine.a(var21, (byte) 112)) {
                    var8[1][var13] = ck.field_r;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var28.position = var24;
                    var13++;
                    for (int var25Lifetime1 = 0; var25Lifetime1 < var7; var25Lifetime1++) {
                      int incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var28.readInt(-5053);
                    }
                  }
                  if (var14 < var6 &&
                    !bg.field_a[var20].field_e) {
                    bg.field_a[var20].field_e = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = bg.field_a[var20].field_a;
                    var10[2][var14] = var22;
                    var28.position = var24;
                    var14++;
                    for (int var25Lifetime2 = 0; var25Lifetime2 < var7; var25Lifetime2++) {
                      int incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var28.readInt(-5053);
                    }
                  }
                }
              }
            }
            var4.field_l = true;
            var4.unlink((byte) -90);
          } else if (var2 == 1) {
            var3 = var28.readUnsignedShort(1952);
            long var4_long = var28.i(-800509813);
            ik var6_ref_ik = (ik) (vj.field_d.first(false));
            while (var6_ref_ik != null) {
              if (var6_ref_ik.field_i != var3) {
                var6_ref_ik = (ik) (vj.field_d.next((byte) 70));
                continue;
              }
              break;
            }
            if (var6_ref_ik == null) {
              nm.a(16);
              return;
            }
            var6_ref_ik.field_l = var4_long;
            var6_ref_ik.unlink((byte) -85);
          } else {
            pf.a(false, "HS1: " + hf.b((byte) 115), (Throwable) null);
            nm.a(16);
          }
          int var3Lifetime1 = -111 / ((-41 - param0) / 43);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "ja.C(" + param0 + ')');
        }
    }

    final static d a(String param0, boolean param1) {
        String stackIn_12_2 = null;
        try {
          if (di.field_g.b(0) &&
            !param0.equals(di.field_g.a(-100))) {
            di.field_g = RasterBuffer.a((byte) 83, param0);
          }
          if (param1) {
            d stackIn_8_0 = di.field_g;
            return stackIn_8_0;
          }
          d stackIn_6_0 = (d) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var2;
          StringBuilder stackIn_11_1 = new StringBuilder().append("ja.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    static {
        field_e = new String[]{"original", "classic", "retribution", "simulator"};
        field_b = "Previous";
        field_a = new fk(2);
    }
}
