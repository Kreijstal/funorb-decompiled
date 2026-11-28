/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends IntrusiveNode {
    int field_l;
    int field_f;
    static String field_g;
    int field_h;
    int field_k;
    int field_i;
    int field_n;
    static int field_j;
    static int field_m;

    final static String a(String param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        var5 = CrazyCrystals.field_B;
        var4 = param2.indexOf(param3);
        if (param1 != 0) {
          field_m = -105;
        }
        while (true) {
          if (var4 == -1) {
            return param2;
          }
          param2 = param2.substring(0, var4) + param0 + param2.substring(var4 + param3.length());
          stackIn_6_0 = (String) (param2);
          if (var5 != 0) {
            return stackIn_6_0;
          }
          var4 = ((String) (Object) stackIn_6_0).indexOf(param3, param0.length() + var4);
        }
    }

    public static void resetStaticState(int param0) {
        if (param0 != 0) {
          field_m = 115;
          field_g = null;
          return;
        }
        field_g = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = CrazyCrystals.field_B;
        try {
          SoftwareRasterizer.drawHorizontalLine(param1, param2, 1 + param4, 10000536);
          var5_int = 70 / ((param0 + 78) / 42);
          SoftwareRasterizer.drawHorizontalLine(param1, param2 + param3, 1 + param4, 12105912);
          var6 = 1;
          if (SoftwareRasterizer.field_b > param2 + var6) {
            var6 = -param2 + SoftwareRasterizer.field_b;
          }
          var7 = param3;
          if (SoftwareRasterizer.field_j < param2 + var7) {
            var7 = -param2 + SoftwareRasterizer.field_j;
          }
          var8 = var6;
          while (true) {
            if (var7 <= var8) {
              return;
            }
            var9 = var8 * 48 / param3 + 152;
            var10 = var9 | (var9 << 8 | var9 << 16);
            SoftwareRasterizer.field_i[param1 + SoftwareRasterizer.field_l * (var8 + param2)] = var10;
            SoftwareRasterizer.field_i[param4 + param1 + SoftwareRasterizer.field_l * (var8 + param2)] = var10;
            var8++;
            if (var11 != 0) {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dn.wrapClientException((Throwable) ((Object) var5), "ca.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        int stackIn_5_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_45_0 = 0;
        int var6;
        int var7;
        rc.field_b[SecondaryNodeDeque.field_c] = param3;
        wp.field_d[SecondaryNodeDeque.field_c] = SecondaryNodeDeque.field_c;
        mh.field_l[SecondaryNodeDeque.field_c] = param2;
        if (param2 >= ae.field_F) {
          if (param2 <= uo.field_m) {
            dk.field_l[SecondaryNodeDeque.field_c] = param0;
            BufferedSocket.field_i[SecondaryNodeDeque.field_c] = param1;
            cd.field_u[SecondaryNodeDeque.field_c] = param5;
            var6 = param5 + param1 + param0;
            if (var6 == 0) {
              stackIn_45_0 = 0;
            } else {
              stackIn_45_0 = 1000 * param0 / var6;
            }
            var7 = stackIn_45_0;
            jk.field_g[SecondaryNodeDeque.field_c] = var7;
            SecondaryNodeDeque.field_c = SecondaryNodeDeque.field_c + 1;
            if (ResourceArchive.field_i > var7) {
              ResourceArchive.field_i = var7;
            }
            if (em.field_i < var7) {
              em.field_i = var7;
            }
            if (param4) {
              return;
            }
            ca.a((byte) 11, -117, 22, 53, 16);
            return;
          }
          em.field_i = param2;
          dk.field_l[SecondaryNodeDeque.field_c] = param0;
          BufferedSocket.field_i[SecondaryNodeDeque.field_c] = param1;
          cd.field_u[SecondaryNodeDeque.field_c] = param5;
          var6 = param5 + param1 + param0;
          if (var6 == 0) {
            stackIn_32_0 = 0;
          } else {
            stackIn_32_0 = 1000 * param0 / var6;
          }
          var7 = stackIn_32_0;
        } else {
          ResourceArchive.field_i = param2;
          if (param2 <= uo.field_m) {
            dk.field_l[SecondaryNodeDeque.field_c] = param0;
            BufferedSocket.field_i[SecondaryNodeDeque.field_c] = param1;
            cd.field_u[SecondaryNodeDeque.field_c] = param5;
            var6 = param5 + param1 + param0;
            if (var6 == 0) {
              stackIn_5_0 = 0;
            } else {
              stackIn_5_0 = 1000 * param0 / var6;
            }
            var7 = stackIn_5_0;
          } else {
            em.field_i = param2;
            dk.field_l[SecondaryNodeDeque.field_c] = param0;
            BufferedSocket.field_i[SecondaryNodeDeque.field_c] = param1;
            cd.field_u[SecondaryNodeDeque.field_c] = param5;
            var6 = param5 + param1 + param0;
            if (var6 == 0) {
              stackIn_18_0 = 0;
            } else {
              stackIn_18_0 = 1000 * param0 / var6;
            }
            var7 = stackIn_18_0;
          }
        }
        jk.field_g[SecondaryNodeDeque.field_c] = var7;
        SecondaryNodeDeque.field_c = SecondaryNodeDeque.field_c + 1;
        if (ResourceArchive.field_i > var7) {
          ResourceArchive.field_i = var7;
        }
        if (em.field_i < var7) {
          em.field_i = var7;
        }
        if (param4) {
          return;
        }
        ca.a((byte) 11, -117, 22, 53, 16);
    }

    ca(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_n = param2;
        this.field_i = param0;
        this.field_f = param4;
        this.field_h = param3;
        this.field_l = param5;
        this.field_k = param1;
    }

    final static boolean a(byte param0) {
        if (param0 <= 3) {
          field_j = -8;
          return true;
        }
        return true;
    }

    static {
        field_g = "to return to the normal view.";
    }
}
