/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends gb {
    static String field_v;
    static String field_o;
    static bc field_u;
    int[] field_r;
    static char[] field_q;
    private int[][] field_t;
    private String[] field_s;
    static String field_w;
    static String field_x;
    private int[] field_p;

    private final void a(be param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        aa var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 1) {
                ((ob) this).field_s = te.a(param0.g(0), '<', (byte) -94);
                ob.h(-53);
                break L1;
              } else {
                if (2 != param1) {
                  if (param1 == 3) {
                    var4_int = param0.h(16383);
                    ((ob) this).field_p = new int[var4_int];
                    ((ob) this).field_t = new int[var4_int][];
                    var5 = 0;
                    L2: while (true) {
                      if (var4_int <= var5) {
                        ob.h(-53);
                        break L1;
                      } else {
                        L3: {
                          var6 = param0.d((byte) -79);
                          var7 = dk.a(var6, (byte) 25);
                          if (var7 == null) {
                            break L3;
                          } else {
                            ((ob) this).field_p[var5] = var6;
                            ((ob) this).field_t[var5] = new int[var7.field_b];
                            var8 = 0;
                            L4: while (true) {
                              if (var7.field_b <= var8) {
                                break L3;
                              } else {
                                ((ob) this).field_t[var5][var8] = param0.d((byte) -78);
                                var8++;
                                continue L4;
                              }
                            }
                          }
                        }
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    if (param1 != 4) {
                      ob.h(-53);
                      break L1;
                    } else {
                      ob.h(-53);
                      break L1;
                    }
                  }
                } else {
                  var4_int = param0.h(16383);
                  ((ob) this).field_r = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var5 >= var4_int) {
                      ob.h(-53);
                      break L1;
                    } else {
                      ((ob) this).field_r[var5] = param0.d((byte) -66);
                      var5++;
                      continue L5;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4;
            stackOut_23_1 = new StringBuilder().append("ob.H(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ',' + false + ')');
        }
    }

    public static void c(byte param0) {
        field_x = null;
        field_w = null;
        field_u = null;
        field_o = null;
        field_q = null;
        field_v = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            wd.field_R = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            dh.a(var3, var4, param1, var2, 1000);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "ob.C(" + 209 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(byte param0) {
        int var3 = 0;
        int var4 = TrackController.field_F ? 1 : 0;
        if (param0 != 2) {
            String discarded$0 = ((ob) this).a((byte) 10);
        }
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (((ob) this).field_s == null) {
            return "";
        }
        StringBuilder discarded$1 = var5.append(((ob) this).field_s[0]);
        for (var3 = 1; var3 < ((ob) this).field_s.length; var3++) {
            StringBuilder discarded$2 = var2.append("...");
            StringBuilder discarded$3 = var5.append(((ob) this).field_s[var3]);
        }
        return var2.toString();
    }

    final void a(boolean param0, be param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_x = null;
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param1.h(16383);
              if (var3_int != 0) {
                this.a(param1, var3_int, false);
                continue L2;
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ob.D(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final static void a(boolean param0, int param1, float param2, String param3) {
        try {
            if (null == ib.field_e) {
                ib.field_e = new rk(gl.field_E, tk.field_r);
                gl.field_E.d((byte) -97, (al) (Object) ib.field_e);
            }
            ib.field_e.a(param3, (byte) 88, param0, param2);
            ll.a();
            lh.a(true, 66);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "ob.K(" + param0 + ',' + 209 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = TrackController.field_F ? 1 : 0;
        if (param0 != 32768) {
            field_u = null;
        }
        if (!(null == ((ob) this).field_r)) {
            for (var2 = 0; var2 < ((ob) this).field_r.length; var2++) {
                ((ob) this).field_r[var2] = ok.a(((ob) this).field_r[var2], 32768);
            }
        }
    }

    final static ve a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        ve var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        ve stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        ve stackOut_15_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          if (null != ag.field_d) {
            if (param1 != null) {
              if (param1.length() != 0) {
                var2_int = -100 % ((-10 - param0) / 50);
                var7 = (CharSequence) (Object) param1;
                var3 = r.a(var7, -11133);
                if (var3 != null) {
                  var4 = (ve) (Object) ag.field_d.a(-1, (long)var3.hashCode());
                  L0: while (true) {
                    if (var4 != null) {
                      var8 = (CharSequence) (Object) var4.field_jb;
                      var5 = r.a(var8, -11133);
                      if (!var5.equals((Object) (Object) var3)) {
                        var4 = (ve) (Object) ag.field_d.a(-1);
                        continue L0;
                      } else {
                        stackOut_15_0 = (ve) var4;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_9_0 = null;
                  stackIn_10_0 = stackOut_9_0;
                  return (ve) (Object) stackIn_10_0;
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (ve) (Object) stackIn_7_0;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("ob.B(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L1;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    final static boolean g(int param0) {
        ka.field_a = true;
        rk.field_eb = qg.a(false) - -15000L;
        return rl.field_N == 11 ? true : false;
    }

    final static void h(int param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var1 = (Object) (Object) cj.field_o;
            synchronized (var1) {
              L1: {
                L2: {
                  mb.field_f = mb.field_f + 1;
                  lj.field_d = fc.field_d;
                  if (mg.field_f >= 0) {
                    L3: while (true) {
                      if (hb.field_f == mg.field_f) {
                        break L2;
                      } else {
                        var2 = md.field_b[hb.field_f];
                        hb.field_f = hb.field_f - -1 & 127;
                        if (var2 < 0) {
                          ni.field_m[~var2] = false;
                          continue L3;
                        } else {
                          ni.field_m[var2] = true;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 112) {
                        mg.field_f = hb.field_f;
                        break L2;
                      } else {
                        ni.field_m[var2] = false;
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
                fc.field_d = ri.field_V;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1_ref, "ob.F(" + 16473 + ')');
        }
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var2 = ue.a(vh.a((byte) -127, param1), (byte) 76);
              if (var2 != null) {
                break L1;
              } else {
                var2 = "";
                break L1;
              }
            }
            stackOut_4_0 = (String) var2;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("ob.G(").append(100).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    ob() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Please check if address is correct";
        field_o = "Level value <%0> + Time bonus <%1> = <%2>";
        field_x = "You have 1 unread message!";
        field_q = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
        field_w = "Waiting for music";
    }
}
