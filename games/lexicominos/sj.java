/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends kd {
    long[][] field_i;
    boolean field_k;
    int[][] field_n;
    String[][] field_j;
    int field_m;
    static String field_l;
    int field_h;
    int field_o;

    final static void a(int param0, String param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          ug.field_m = ug.field_m + 1;
          if (~ch.field_e == param0 &&
            fk.field_e == -1) {
            ch.field_e = bk.field_b;
            fk.field_e = sh.field_e;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 != null) {
            decompiledFrameRemainder0 = !(param1.equals(nc.field_p));
          } else {
            decompiledFrameRemainder0 = (nc.field_p == null);
          }
          if (decompiledFrameRemainder0) {
            if (!af.field_b) {
              if (ug.field_m >= dj.field_b) {
                stackIn_16_0 = (dj.field_b + ik.field_j > ug.field_m) ? 1 : 0;
              } else {
                stackIn_16_0 = 0;
              }
            } else {
              stackIn_16_0 = 0;
            }
            var2_int = stackIn_16_0;
            if (param1 == null) {
              ug.field_m = 0;
            } else {
              if (af.field_b) {
                ug.field_m = dj.field_b;
              } else {
                if (var2_int == 0) {
                  ug.field_m = 0;
                } else {
                  ug.field_m = dj.field_b;
                }
              }
            }
            vf.field_r = fk.field_e;
            if (param1 == null) {
              if (var2_int != 0) {
                af.field_b = true;
              }
            } else {
              af.field_b = false;
            }
            bf.field_g = ch.field_e;
          }
          if (!af.field_b &&
            dj.field_b > ug.field_m &&
            ob.field_c) {
            ug.field_m = 0;
            vf.field_r = fk.field_e;
            bf.field_g = ch.field_e;
          }
          nc.field_p = param1;
          fk.field_e = -1;
          if (af.field_b &&
            ug.field_m == v.field_u) {
            af.field_b = false;
            ug.field_m = 0;
          }
          ch.field_e = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_43_0 = var2;
          stackIn_43_1 = new StringBuilder().append("sj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 <= 3) {
          sj.a((byte) -96);
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        if (!param5) {
          return false;
        }
        if (param4 < param6) {
          return false;
        }
        if (param6 + param3 <= param4) {
          return false;
        }
        if (param0 < param2) {
          return false;
        }
        if (param1 + param2 > param0) {
          return true;
        }
        return false;
    }

    sj() {
    }

    static {
        field_l = "END";
    }
}
