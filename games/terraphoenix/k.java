/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static String[] field_d;
    static String field_a;
    static og field_b;
    static int[] field_e;
    private uf field_g;
    private jj field_c;
    static te field_f;

    final uf c(int param0) {
        uf var2 = ((k) this).field_g;
        if (param0 < 1) {
            return null;
        }
        if (!(var2 != ((k) this).field_c.field_a)) {
            ((k) this).field_g = null;
            return null;
        }
        ((k) this).field_g = var2.field_d;
        return var2;
    }

    final static void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
        try {
          L0: {
            L1: {
              dj.field_d = false;
              fd.field_k = false;
              if (null == nb.field_b) {
                break L1;
              } else {
                if (nb.field_b.field_J) {
                  L2: {
                    if (param0 != 8) {
                      break L2;
                    } else {
                      L3: {
                        if (qi.field_b) {
                          param1 = em.field_b;
                          break L3;
                        } else {
                          param1 = bi.field_c;
                          break L3;
                        }
                      }
                      param0 = 2;
                      mb.field_s.a(ol.field_Hb, -1);
                      break L2;
                    }
                  }
                  L4: {
                    var3_int = 1;
                    if (param0 != 10) {
                      break L4;
                    } else {
                      int discarded$2 = 124;
                      cm.a();
                      var3_int = 0;
                      break L4;
                    }
                  }
                  L5: {
                    if (var3_int != 0) {
                      L6: {
                        if (!dj.field_d) {
                          break L6;
                        } else {
                          param1 = ij.a(new String[1], -1, fd.field_q);
                          break L6;
                        }
                      }
                      L7: {
                        if (!ok.field_h) {
                          break L7;
                        } else {
                          param1 = ld.field_g;
                          break L7;
                        }
                      }
                      nb.field_b.a(true, param1, param0);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (param0 == 256) {
                    break L1;
                  } else {
                    if (param0 != 10) {
                      if (qi.field_b) {
                        break L1;
                      } else {
                        mb.field_s.g((byte) -107);
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("k.D(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + 0 + 41);
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        field_e = null;
        field_f = null;
    }

    final uf a(byte param0, uf param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        uf var4 = null;
        Object stackIn_6_0 = null;
        uf stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        uf stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var3_int = 88 / ((-52 - param0) / 61);
              if (param1 != null) {
                var4 = param1;
                break L1;
              } else {
                var4 = ((k) this).field_c.field_a.field_d;
                break L1;
              }
            }
            if (var4 == ((k) this).field_c.field_a) {
              ((k) this).field_g = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (uf) (Object) stackIn_6_0;
            } else {
              ((k) this).field_g = var4.field_d;
              stackOut_7_0 = (uf) var4;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("k.E(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0;
    }

    final static fd a() {
        if (qb.field_b == null) {
          qb.field_b = new fd(ra.field_l, 20, 0, 0, 0, 11579568, -1, 0, 0, ra.field_l.field_s, -1, 2147483647, true);
          return qb.field_b;
        } else {
          return qb.field_b;
        }
    }

    final uf b(int param0) {
        uf var2 = null;
        var2 = ((k) this).field_c.field_a.field_a;
        if (var2 != ((k) this).field_c.field_a) {
          if (param0 <= 45) {
            field_b = null;
            ((k) this).field_g = var2.field_a;
            return var2;
          } else {
            ((k) this).field_g = var2.field_a;
            return var2;
          }
        } else {
          ((k) this).field_g = null;
          return null;
        }
    }

    final uf a(int param0, uf param1) {
        uf var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        uf stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        uf stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param0 >= 22) {
              L1: {
                if (param1 == null) {
                  var3 = ((k) this).field_c.field_a.field_a;
                  break L1;
                } else {
                  var3 = param1;
                  break L1;
                }
              }
              if (((k) this).field_c.field_a != var3) {
                ((k) this).field_g = var3.field_a;
                stackOut_9_0 = (uf) var3;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                ((k) this).field_g = null;
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (uf) (Object) stackIn_8_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (uf) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("k.F(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final uf a(byte param0) {
        uf var2 = null;
        var2 = ((k) this).field_c.field_a.field_d;
        if (param0 == -13) {
          if (((k) this).field_c.field_a == var2) {
            ((k) this).field_g = null;
            return null;
          } else {
            ((k) this).field_g = var2.field_d;
            return var2;
          }
        } else {
          field_b = null;
          if (((k) this).field_c.field_a == var2) {
            ((k) this).field_g = null;
            return null;
          } else {
            ((k) this).field_g = var2.field_d;
            return var2;
          }
        }
    }

    k(jj param0) {
        try {
            ((k) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "k.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final uf d(int param0) {
        uf var2 = null;
        if (param0 > -78) {
            field_a = null;
            var2 = ((k) this).field_g;
            if (!(var2 != ((k) this).field_c.field_a)) {
                ((k) this).field_g = null;
                return null;
            }
            ((k) this).field_g = var2.field_a;
            return var2;
        }
        var2 = ((k) this).field_g;
        if (!(var2 != ((k) this).field_c.field_a)) {
            ((k) this).field_g = null;
            return null;
        }
        ((k) this).field_g = var2.field_a;
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"Moving and shooting", "Your normal cursor is shown by this green box. If the box is over a staircase, an arrow will appear to denote which direction the stairs travel.", "By left clicking on the terrain, the movement cursor will appear with a number saying how much time it will take to move to this position. Click once more to confirm and your soldier will move.", "If the cursor is positioned over a controllable soldier, it will turn blue. Click to select the soldier.", "Moving the cursor over an enemy will change the cursor to a red targeting icon. Left clicking will make your soldier fire a shot at the target. If you select your gun from the console you will enter auto-fire mode allowing you to fire at any position on the landscape. This is useful for explosive weapons or if you cannot see your target.", "If a soldier is in ready mode, they will automatically crouch when next to cover such as a low wall or hedge. Enemy fire is likely to hit the cover and thus not injure your soldier. Remember that cover can be destroyed by explosives or powerful guns."};
        field_e = new int[8192];
        field_a = "MML-4";
        field_b = new og();
    }
}
