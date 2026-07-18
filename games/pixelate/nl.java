/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    private fa field_f;
    private fa field_i;
    private fa[] field_g;
    static String field_d;
    static sb field_c;
    private int field_e;
    static String field_h;
    private int field_a;
    static String field_b;

    final fa a(int param0, long param1) {
        fa var5 = null;
        int var6 = Pixelate.field_H ? 1 : 0;
        if (param0 != -25484) {
            Object var7 = null;
            byte[] discarded$0 = nl.a((pc) null, (byte[]) null, -80, 17);
        }
        fa var4 = ((nl) this).field_g[(int)(param1 & (long)(((nl) this).field_a + -1))];
        ((nl) this).field_i = var4.field_a;
        while (var4 != ((nl) this).field_i) {
            if (~((nl) this).field_i.field_e == ~param1) {
                var5 = ((nl) this).field_i;
                ((nl) this).field_i = ((nl) this).field_i.field_a;
                return var5;
            }
            ((nl) this).field_i = ((nl) this).field_i.field_a;
        }
        ((nl) this).field_i = null;
        return null;
    }

    final fa a(byte param0) {
        if (param0 > -95) {
            return null;
        }
        ((nl) this).field_e = 0;
        return ((nl) this).a(54);
    }

    final static void a(boolean param0, int param1) {
        nd.field_b = param0 ? new wo(ch.field_H, an.field_a) : new wo(fb.field_Gb, vd.field_a);
        ff.field_h = new ak(0L, (ak) null);
        if (param1 >= -68) {
            nl.b(-102);
        }
        ff.field_h.a((ak) (Object) nd.field_b.field_g, (byte) 26);
        ff.field_h.a(gk.field_kb, (byte) 26);
        ra.field_e = new ak(0L, cm.field_o);
        kh.field_a = new ak(0L, (ak) null);
        ra.field_e.a(ih.field_g, (byte) 26);
        ra.field_e.a(kh.field_a, (byte) 26);
        kh.field_a.a(oc.field_O, (byte) 26);
        kh.field_a.a(hb.field_eb, (byte) 26);
        hn.a((byte) 32, param0);
    }

    final static byte[] a(pc param0, byte[] param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_17_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 >= 59) {
                break L1;
              } else {
                var9 = null;
                byte[] discarded$2 = nl.a((pc) null, (byte[]) null, 62, -90);
                break L1;
              }
            }
            var4_int = param0.c(param2, (byte) -34);
            if (var4_int != 0) {
              L2: {
                L3: {
                  if (param1 == null) {
                    break L3;
                  } else {
                    if (var4_int == param1.length) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                param1 = new byte[var4_int];
                break L2;
              }
              L4: {
                var5 = param0.c(3, (byte) -34);
                var6 = (byte)param0.c(8, (byte) -34);
                if (var5 <= 0) {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param1[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param1[var7] = (byte)(param0.c(var5, (byte) -34) + var6);
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_17_0 = (byte[]) param1;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (byte[]) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("nl.E(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_18_0;
    }

    final void a(long param0, int param1, fa param2) {
        fa var5 = null;
        try {
            if (param1 <= 120) {
                fa discarded$0 = ((nl) this).a(-40);
            }
            if (!(param2.field_h == null)) {
                param2.c(2779);
            }
            var5 = ((nl) this).field_g[(int)(param0 & (long)(-1 + ((nl) this).field_a))];
            param2.field_h = var5.field_h;
            param2.field_a = var5;
            param2.field_h.field_a = param2;
            param2.field_e = param0;
            param2.field_a.field_h = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "nl.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        rd.a(param1, -17130, false);
        if (param0 != 0) {
            nl.a(-72, false);
        }
    }

    final static int a() {
        if (hf.field_q >= 2) {
          L0: {
            if (wo.field_d == 0) {
              if (!wk.field_j.b(-3)) {
                return 20;
              } else {
                if (wk.field_j.a("commonui", -1)) {
                  if (io.field_g.b(-3)) {
                    if (io.field_g.a("commonui", -1)) {
                      if (qo.field_u.b(-3)) {
                        if (!qo.field_u.a((byte) 92)) {
                          return 80;
                        } else {
                          break L0;
                        }
                      } else {
                        return 70;
                      }
                    } else {
                      return 60;
                    }
                  } else {
                    return 50;
                  }
                } else {
                  return 40;
                }
              }
            } else {
              L1: {
                if (null != hn.field_e) {
                  if (hn.field_e.b(-3)) {
                    if (!hn.field_e.b(127, "")) {
                      return 29;
                    } else {
                      if (hn.field_e.a("", -1)) {
                        break L1;
                      } else {
                        return 29;
                      }
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L1;
                }
              }
              if (!wk.field_j.b(-3)) {
                return 43;
              } else {
                if (!wk.field_j.a("commonui", -1)) {
                  return 57;
                } else {
                  if (io.field_g.b(-3)) {
                    if (io.field_g.a("commonui", -1)) {
                      if (!qo.field_u.b(-3)) {
                        return 82;
                      } else {
                        if (!qo.field_u.a((byte) 92)) {
                          return 86;
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                }
              }
            }
          }
          return 35;
        } else {
          return 0;
        }
    }

    nl(int param0) {
        int var2 = 0;
        fa var3 = null;
        ((nl) this).field_e = 0;
        ((nl) this).field_g = new fa[param0];
        ((nl) this).field_a = param0;
        for (var2 = 0; var2 < param0; var2++) {
            fa dupTemp$0 = new fa();
            var3 = dupTemp$0;
            ((nl) this).field_g[var2] = dupTemp$0;
            var3.field_h = var3;
            var3.field_a = var3;
        }
    }

    final fa a(int param0) {
        fa var2_ref_fa = null;
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        fa var4_ref = null;
        L0: {
          var3 = Pixelate.field_H ? 1 : 0;
          if (((nl) this).field_e <= 0) {
            break L0;
          } else {
            if (((nl) this).field_g[-1 + ((nl) this).field_e] != ((nl) this).field_f) {
              var2_ref_fa = ((nl) this).field_f;
              ((nl) this).field_f = var2_ref_fa.field_a;
              return var2_ref_fa;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (((nl) this).field_a <= ((nl) this).field_e) {
            var2 = -114 / ((-79 - param0) / 36);
            return null;
          } else {
            int fieldTemp$2 = ((nl) this).field_e;
            ((nl) this).field_e = ((nl) this).field_e + 1;
            var4_ref = ((nl) this).field_g[fieldTemp$2].field_a;
            var2_ref_fa = var4_ref;
            if (var4_ref == ((nl) this).field_g[-1 + ((nl) this).field_e]) {
              continue L1;
            } else {
              ((nl) this).field_f = var2_ref_fa.field_a;
              return var2_ref_fa;
            }
          }
        }
    }

    public static void b(int param0) {
        field_h = null;
        field_b = null;
        field_d = null;
        field_c = null;
        int var1 = -16 / ((-56 - param0) / 32);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Asking to join <%0>'s game...";
        field_d = "Auto-respond to <%0>";
        field_b = "This game option is only available to members.";
    }
}
