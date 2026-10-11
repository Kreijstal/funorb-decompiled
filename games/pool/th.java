/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static String field_d;
    static byte[][] field_j;
    static String field_e;
    static int field_a;
    static String field_k;
    static String field_i;
    static boolean field_h;
    static String field_g;
    static String field_f;
    static p[] field_l;
    static int field_b;
    static String field_c;

    final static void a(byte param0, int param1) {
        kg.field_q = kc.field_g[param1];
        ir.field_b = kj.field_i[param1];
        if (param0 < -55) {
          ud.field_F = cb.field_f[param1];
          return;
        }
        field_j = (byte[][]) null;
        ud.field_F = cb.field_f[param1];
    }

    final static boolean a(int param0, int param1, int param2) {
        StringBuilder discarded$1 = null;
        int var3;
        int var4;
        String var5_ref_String;
        int var5;
        int var6;
        String var8;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var65;
        String var66;
        String var67;
        String var68;
        String var69;
        String var70;
        String var71;
        String var72;
        String var73;
        String var74;
        String var75;
        String var76;
        String var77;
        String var78;
        String var79;
        Object var80;
        Object var81;
        Object var82;
        Object var83;
        Object var84;
        CharSequence var89;
        int var6Lifetime1;
        String var8Lifetime1;
        String var8Lifetime2;
        var80 = null;
        var81 = null;
        var82 = null;
        var83 = null;
        var84 = null;
        var3 = 1 / ((param1 - 10) / 61);
        var4 = 1;
        if (!gd.field_b &&
          uq.field_D == null) {
          var4 = 0;
        }
        if (hn.field_b == 0 &&
          null != tp.field_e) {
          var4 = 0;
        }
        if (hn.field_b == 2 &&
          !hp.a(false)) {
          var4 = 0;
        }
        if (qi.field_a == 84) {
          if (var4 == 0) {
            if (hn.field_b == 0) {
              return true;
            }
          } else {
            if (td.field_c.length() > 0) {
              var5_ref_String = td.field_c.toString();
              var8 = var5_ref_String;
              var8Lifetime2 = var5_ref_String;
              if (ei.a((byte) -71, var5_ref_String)) {
                var13 = (String) null;
                var12 = (String) null;
                jh.a(0, hj.field_h, (String) null, 2, (String) null, true);
                var15 = (String) null;
                var14 = (String) null;
                jh.a(0, ci.field_m, (String) null, 2, (String) null, true);
              } else {
                var6 = hn.field_b;
                if (var6 == 0 &&
                  null != em.field_L) {
                  var6 = 1;
                }
                if (f.a(5, var6) == 2) {
                  om.a(1, var6, param0, (byte) -4);
                }
                ub.a((byte) -116, var5_ref_String, param2, fm.field_I, hn.field_b, -1);
              }
            }
          }
          cl.a(14851);
          return true;
        }
        if (qi.field_a == 85) {
          if (var4 != 0 &&
            td.field_c.length() > 0) {
            cj.a(' ', -1 + td.field_c.length(), -2790, td.field_c);
            return true;
          }
          return true;
        }
        var5 = ml.field_b;
        if (!nq.a((char) var5, (byte) -125)) {
          return false;
        }
        if (var4 == 0) {
          return true;
        }
        if (80 > td.field_c.length()) {
          discarded$1 = td.field_c.append((char) var5);
          var6Lifetime1 = 485;
          var65 = di.field_j;
          var16 = bm.a(524288, var65);
          var66 = var16;
          if (hn.field_b != 2) {
            var8Lifetime1 = "";
            boolean decompiledFrameRemainder1 = true;
            if (hn.field_b != 0) {
              var67 = var8Lifetime1 + var66 + ": ";
              var6Lifetime1 = var6Lifetime1 - m.field_c.b(var67);
            } else {
              if (null == em.field_L) {
                if (!ej.field_l) {
                  boolean decompiledFrameRemainder0 = true;
                  if (em.field_L != null) {
                    if (!sa.field_c) {
                      var70 = "[" + nr.a(new String[]{em.field_L.field_Ob}, -1, field_c) + "] ";
                      var71 = var70 + var66 + ": ";
                      var6Lifetime1 = var6Lifetime1 - m.field_c.b(var71);
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (kn.field_g == null) {
                        var68 = "[" + nr.a(new String[]{em.field_L.field_Ob}, -1, field_c) + "] ";
                        var69 = var68 + var66 + ": ";
                        var6Lifetime1 = var6Lifetime1 - m.field_c.b(var69);
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        var8Lifetime1 = "[" + kn.field_g + "] ";
                      }
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    var72 = var8Lifetime1 + var66 + ": ";
                    var6Lifetime1 = var6Lifetime1 - m.field_c.b(var72);
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var8Lifetime1 = "[" + sn.field_l + "] ";
                }
              }
              if (decompiledFrameRemainder1) {
                if (em.field_L != null) {
                  if (!sa.field_c) {
                    var75 = "[" + nr.a(new String[]{em.field_L.field_Ob}, -1, field_c) + "] ";
                    var76 = var75 + var66 + ": ";
                    var6Lifetime1 = var6Lifetime1 - m.field_c.b(var76);
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (kn.field_g == null) {
                      var73 = "[" + nr.a(new String[]{em.field_L.field_Ob}, -1, field_c) + "] ";
                      var74 = var73 + var66 + ": ";
                      var6Lifetime1 = var6Lifetime1 - m.field_c.b(var74);
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      var8Lifetime1 = "[" + kn.field_g + "] ";
                    }
                  }
                }
                if (decompiledFrameRemainder1) {
                  var77 = var8Lifetime1 + var66 + ": ";
                  var6Lifetime1 = var6Lifetime1 - m.field_c.b(var77);
                }
              }
            }
            if (m.field_c.b(td.field_c.toString()) > var6Lifetime1) {
              cj.a(' ', -1 + td.field_c.length(), -2790, td.field_c);
            }
            return true;
          }
          var89 = (CharSequence) ((Object) fm.field_I);
          var78 = nr.a(new String[]{ch.a(false, var89)}, -1, jl.field_a);
          var79 = nr.a(new String[]{var16}, -1, vh.field_S);
          var10 = m.field_c.b(var78);
          var11 = m.field_c.b(var79);
          if (var10 <= var11) {
            var6Lifetime1 = var6Lifetime1 - var11;
            if (m.field_c.b(td.field_c.toString()) > var6Lifetime1) {
              cj.a(' ', -1 + td.field_c.length(), -2790, td.field_c);
            }
            return true;
          }
          var6Lifetime1 = var6Lifetime1 - var10;
          if (m.field_c.b(td.field_c.toString()) <= var6Lifetime1) {
            return true;
          }
          cj.a(' ', -1 + td.field_c.length(), -2790, td.field_c);
        }
        return true;
    }

    public static void a(int param0) {
        field_k = null;
        field_j = (byte[][]) null;
        field_g = null;
        field_e = null;
        field_l = null;
        if (param0 == 15059) {
          field_i = null;
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        }
        field_c = (String) null;
        field_i = null;
        field_f = null;
        field_d = null;
        field_c = null;
    }

    final static void a(int param0, int param1, int[] param2, int[] param3, int param4) {
        int var10 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
          if (param4 > param0) {
            var5_int = (param4 + param0) / 2;
            var6 = param0;
            var7 = param2[var5_int];
            param2[var5_int] = param2[param4];
            param2[param4] = var7;
            var8 = param3[var5_int];
            param3[var5_int] = param3[param4];
            param3[param4] = var8;
            stackIn_4_0 = (var7 == 2147483647) ? 0 : 1;
            var9 = stackIn_4_0;
            for (var10 = param0; param4 > var10; var10++) {
              if (param2[var10] < (var10 & var9) + var7) {
                var11 = param2[var10];
                param2[var10] = param2[var6];
                param2[var6] = var11;
                var12 = param3[var10];
                param3[var10] = param3[var6];
                param3[var6++] = var12;
              }
            }
            param2[param4] = param2[var6];
            param2[var6] = var7;
            param3[param4] = param3[var6];
            param3[var6] = var8;
            th.a(param0, -30916, param2, param3, var6 - 1);
            th.a(var6 + 1, param1 + 0, param2, param3, param4);
          }
          if (param1 != -30916) {
            th.a(-19, 83, -97);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("th.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (param0 == -1) {
          if (fm.field_H) {
            lq.i(param0 + 15976);
          }
          return;
        }
        th.a((byte) -3, 101);
        if (fm.field_H) {
          lq.i(param0 + 15976);
        }
    }

    static {
        field_i = "Kick <%0> from this game";
        field_j = new byte[250][];
        field_d = "To report a player, right-click on their name and select the option to report abuse.";
        field_e = "RuneScape clan";
        field_b = 1;
        field_f = "Close";
        field_k = "<%0> has entered a game.";
        field_h = false;
        field_g = null;
        field_c = "<%0>'s game";
    }
}
