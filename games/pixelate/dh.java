/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    static int[] field_d;
    static bb field_a;
    static String[] field_c;
    static ak[] field_b;

    final static void a(byte param0, boolean param1) {
        if (param0 != 58) {
          dh.a(true);
          if (oo.field_b <= 0) {
            if (0 < vn.field_g) {
              if (bm.field_o) {
                t.a(0, 0, t.field_j, ui.field_i.field_gb);
                ra.field_e.a(param1, 0);
                return;
              }
              return;
            }
            if (h.field_W <= 0) {
              return;
            }
            if (bm.field_o) {
              t.a(0, 0, t.field_j, ui.field_i.field_gb);
              ra.field_e.a(param1, 0);
              return;
            }
            return;
          }
          if (!uj.field_Wb) {
            if (0 < vn.field_g) {
              if (!bm.field_o) {
                return;
              }
              t.a(0, 0, t.field_j, ui.field_i.field_gb);
              ra.field_e.a(param1, 0);
              return;
            }
            if (h.field_W > 0) {
              if (!bm.field_o) {
                return;
              }
              t.a(0, 0, t.field_j, ui.field_i.field_gb);
              ra.field_e.a(param1, 0);
              return;
            }
            return;
          }
          t.a(0, 0, t.field_j, ui.field_i.field_gb);
          nc.field_e.a(param1, 0);
          if (0 >= vn.field_g &&
            h.field_W <= 0) {
            return;
          }
          if (!bm.field_o) {
            return;
          }
          t.a(0, 0, t.field_j, ui.field_i.field_gb);
          ra.field_e.a(param1, 0);
          return;
        }
        if (oo.field_b > 0 &&
          uj.field_Wb) {
          t.a(0, 0, t.field_j, ui.field_i.field_gb);
          nc.field_e.a(param1, 0);
          if (0 >= vn.field_g &&
            h.field_W <= 0) {
            return;
          }
          if (!bm.field_o) {
            return;
          }
          t.a(0, 0, t.field_j, ui.field_i.field_gb);
          ra.field_e.a(param1, 0);
          return;
        }
        if (0 >= vn.field_g &&
          h.field_W <= 0) {
          return;
        }
        if (!bm.field_o) {
          return;
        }
        t.a(0, 0, t.field_j, ui.field_i.field_gb);
        ra.field_e.a(param1, 0);
    }

    final static void a(int param0) {
        hb.field_jb = null;
        uk.field_r = null;
        df.field_r = null;
        if (param0 == 0) {
          sm.field_l = false;
          jk.field_d = null;
          return;
        }
        dh.a(false);
        sm.field_l = false;
        jk.field_d = null;
    }

    public static void a(boolean param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        if (!param0) {
          dh.a((byte) 60, true);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static String a(CharSequence param0, byte param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 == null) {
            stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          var2_int = 0;
          var3 = param0.length();
          while (var3 > var2_int) {
            if (ii.a((byte) 116, param0.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int < var3) {
            if (ii.a((byte) 121, param0.charAt(var3 - 1))) {
              var3--;
              continue;
            }
            break;
          }
          var4 = var3 - var2_int;
          if (var4 < 1) {
            return null;
          }
          if (var4 > 12) {
            return null;
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var3 > var6; var6++) {
            var7 = param0.charAt(var6);
            if (vf.a((byte) -3, (char) var7)) {
              var8 = ae.a(124, (char) var7);
              if (0 != var8) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (param1 < 24) {
            field_c = (String[]) null;
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("dh.A(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = new bb();
        field_c = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
