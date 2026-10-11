/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class js {
    static ld field_c;
    static int field_d;
    static int field_g;
    static gh field_i;
    static String field_h;
    static ke field_a;
    static sl field_f;
    static int field_j;
    static sq[] field_b;
    static int field_e;

    final static void a(int param0, int param1) {
        gm var2 = null;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        gm var2Lifetime1;
        try {
          tf.field_p = param0;
          if (param1 != 197126152) {
            js.b((byte) -92);
          }
          var2 = (gm) (eo.field_ab.d(0));
          while (var2 != null) {
            if (var2.field_n.c(param1 - 197124104)) {
              var2.field_p.e(var2.field_h * tf.field_p + 128 >> 8);
            } else {
              var2.b((byte) -75);
            }
            var2 = (gm) (eo.field_ab.a((byte) -71));
          }
          if (nc.field_v != null) {
            var2Lifetime1 = (gm) (nc.field_v.d(0));
            while (var2Lifetime1 != null) {
              if (!var2Lifetime1.field_n.c(param1 - 197124104)) {
                var2Lifetime1.b((byte) -69);
              } else {
                var2Lifetime1.field_p.e(128 + tf.field_p * var2Lifetime1.field_h >> 8);
              }
              var2Lifetime1 = (gm) (nc.field_v.a((byte) -71));
            }
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "js.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        fb var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = 0;
          if (param2 < 3) {
            var5 = (fb) null;
            js.a(-8, 21, (fb) null, -124, 16, false, 64, -69);
          }
          while (param1 > 0) {
            var3_int = var3_int << 1 | 1 & param0;
            param1--;
            param0 = param0 >>> 1;
          }
          stackIn_6_0 = var3_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3), "js.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
          int var6 = 0;
          int var2_int = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          boolean stackIn_16_0 = false;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2 = null;
          Throwable var3_ref = null;
          var8 = ShatteredPlansClient.field_F ? 1 : 0;
          try {
            var2_int = -84 / ((param0 + 5) / 55);
            if (sq.field_o) {
              return true;
            }
            try {
              var3 = "tuhstatbut";
              var4 = (String) (ll.a("getcookies", param1, (byte) 127));
              var5 = so.a(var4, ';', 116);
              for (var6 = 0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_16_0 = (param1.getParameter("tuhstatbut") != null);
            return stackIn_16_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2;
            stackIn_19_1 = new StringBuilder().append("js.G(").append(param0).append(',');
            if (param1 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static qr b(byte param0) {
        if (param0 != 121) {
          return (qr) null;
        }
        return d.field_a.field_Eb;
    }

    final static int a(int param0, byte param1) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        if (param1 != 122) {
          js.c((byte) -124);
        }
        return param0 + 1;
    }

    public static void c(byte param0) {
        field_a = null;
        field_h = null;
        field_c = null;
        if (param0 <= 58) {
          return;
        }
        field_f = null;
        field_b = null;
        field_i = null;
    }

    final static void a(int param0, int param1, fb param2, int param3, int param4, boolean param5, int param6, int param7) {
        sg[][] stackIn_6_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_106_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        sg[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        sg var13_ref_sg = null;
        int var14 = 0;
        int var15 = 0;
        sg[] var16 = null;
        sg[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int var10_intLifetime1;
        int var13Lifetime1;
        int var10_intLifetime2;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 != 1) {
            js.a(106, 32);
          }
          if (param3 <= param0) {
            var8_int = 1;
            var9 = 0;
            while (true) {
              if (pe.field_D.length <= var9) {
                if (var8_int == 0) {
                  return;
                }
                wg.field_d = true;
                return;
              }
              var19 = pe.field_D[var9];
              var18 = var19;
              var10 = var18;
              var11 = 0;
              var12 = 0;
              L5: while (true) {
                if (var12 >= var19.length) {
                  if (var11 == 0 &&
                    em.field_k != param0) {
                    break L5;
                  }
                  for (var12 = 0; var19.length > var12; var12 += 2) {
                    var13 = var19[var12];
                    if (var13 == -1) {
                      qd.field_h = true;
                    } else {
                      if (var13 < param0) {
                        ek.field_F[var13] = true;
                      }
                    }
                  }
                  var8_int = 0;
                  break L5;
                }
                var13Lifetime1 = var19[var12];
                var14 = var10[1 + var12];
                if (var13Lifetime1 != -1) {
                  if (var13Lifetime1 == param0 &&
                    param6 == var14) {
                    var11 = 1;
                  } else {
                    if (param0 <= var13Lifetime1) {
                      break L5;
                    }
                    if ((lr.field_c[var13Lifetime1] & 255) != var14) {
                      break L5;
                    }
                  }
                } else {
                  if (nl.field_a[param7] != var14) {
                    break L5;
                  }
                }
                var12 += 2;
                continue;

              }
              var9++;
            }
          }
          stackIn_6_0 = fk.field_p;
          if (-1 == param0) {
            stackIn_7_1 = 1;
          } else {
            stackIn_7_1 = 4 + param0;
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          var16 = stackIn_6_0[stackIn_7_1];
          var17 = var16;
          var8 = var17;
          var9 = 1;
          if (param5) {
            if (-1 == param0) {
              for (var10_int = 0; nl.field_a.length > var10_int; var10_int++) {
                if ((id.field_c[var10_int / 8] & 1 << (var10_int & 7)) != 0) {
                  var9 = 0;
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0)) {
              for (var10_intLifetime2 = 0; var16.length - 1 > var10_intLifetime2; var10_intLifetime2++) {
                if ((qj.field_f[(var10_intLifetime2 + param4) / 8] & 1 << (7 & param4 + var10_intLifetime2)) == 0) {
                  continue;
                }
                var9 = 0;
                break;
              }
              param4 = param4 + (ks.field_e[param0] & 255);
            }
          }
          var10_intLifetime1 = 0;
          var11 = 0;
          while (true) {
            if (-1 != param0) {
              stackIn_25_0 = var17.length - 1;
            } else {
              stackIn_25_0 = nl.field_a.length;
            }
            if (stackIn_25_0 <= var11) {
              if (var10_intLifetime1 != 0) {
                return;
              }
              for (var11 = 0; var11 < var17.length - 1; var11++) {
                if (param0 == -1) {
                  param7 = var11;
                } else {
                  lr.field_c[param0] = (byte)var11;
                }
                js.a(param0 + 1, param1 ^ 0, param2, param3, param4, param5, param6, param7);
                if (wg.field_d) {
                  return;
                }
              }
              break;
            }
            if (param0 != -1) {
              lr.field_c[param0] = (byte)var11;
            } else {
              param7 = var11;
            }
            if (param0 == -1 &&
              nl.field_a.length == 1) {
              var12 = 1;
            } else {
              var13_ref_sg = var8[1 + var11];
              if (!param5) {
                if (param0 == -1) {
                  stackIn_49_0 = (nl.field_a[var11] != np.field_a.field_Eb) ? 0 : 1;
                } else {
                  stackIn_49_0 = ((255 & np.field_a.field_dc[param0]) != var11) ? 0 : 1;
                }
                var12 = stackIn_49_0;
              } else {
                if (!var13_ref_sg.field_bb) {
                  if (var9 != 0) {
                    stackIn_41_0 = (var13_ref_sg.field_s) ? 1 : 0;
                  } else {
                    stackIn_41_0 = 0;
                  }
                } else {
                  stackIn_41_0 = 1;
                }
                var12 = stackIn_41_0;
              }
            }
            if (var12 != 0) {
              js.a(1 + param0, 1, param2, param3, param4, param5, param6, param7);
              var10_intLifetime1 = 1;
            }
            if (wg.field_d) {
              return;
            }
            var11++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_105_0 = var8_ref;
          stackIn_105_1 = new StringBuilder().append("js.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        String[] var1 = null;
        String var3 = null;
        int var4 = 0;
        String[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          be.field_h = oi.field_a;
          kp.field_j = jb.field_d;
          ph.field_g = false;
          er.field_g = false;
          pc.field_q = tp.field_b;
          ol.field_g = hm.field_q;
          jc.field_r = fe.field_B;
          me.field_j = false;
          td.field_L = false;
          se.field_k = false;
          if (param0 != -10) {
            js.a((byte) 43);
          }
          tl.field_u = false;
          ej.field_m = 0;
          if (null != ol.field_g.field_m) {
            var5 = ol.field_g.field_m;
            var1 = var5;
            for (var2 = 0; var2 < var5.length; var2++) {
              var3 = var5[var2];
              kq.b(var3, param0 ^ -15);
            }
          }
          if (ol.field_g.field_h) {
            ge.field_i = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "js.A(" + param0 + ')');
        }
    }

    static {
        field_c = null;
        field_d = 0;
        field_h = "Please select an option in the '<%0>' row.";
    }
}
