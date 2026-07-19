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
        uf var2 = this.field_g;
        if (param0 < 1) {
            return (uf) null;
        }
        if (!(var2 != this.field_c.field_a)) {
            this.field_g = null;
            return null;
        }
        this.field_g = var2.field_d;
        return var2;
    }

    final static void a(int param0, String param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            L1: {
              dj.field_d = false;
              if (!param2) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              fd.field_k = stackIn_3_0 != 0;
              if (null == nb.field_b) {
                break L2;
              } else {
                if (nb.field_b.field_J) {
                  L3: {
                    if (-9 != (param0 ^ -1)) {
                      break L3;
                    } else {
                      L4: {
                        if (qi.field_b) {
                          param1 = em.field_b;
                          break L4;
                        } else {
                          param1 = bi.field_c;
                          break L4;
                        }
                      }
                      param0 = 2;
                      mb.field_s.a(ol.field_Hb, -1);
                      break L3;
                    }
                  }
                  L5: {
                    var3_int = 1;
                    if ((param0 ^ -1) != -11) {
                      break L5;
                    } else {
                      cm.a((byte) 124);
                      var3_int = 0;
                      break L5;
                    }
                  }
                  L6: {
                    if (var3_int != 0) {
                      L7: {
                        if (!dj.field_d) {
                          break L7;
                        } else {
                          param1 = ij.a(new String[]{param1}, -1, fd.field_q);
                          break L7;
                        }
                      }
                      L8: {
                        if (!ok.field_h) {
                          break L8;
                        } else {
                          param1 = ld.field_g;
                          break L8;
                        }
                      }
                      nb.field_b.a(true, param1, param0);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (param0 == 256) {
                    break L2;
                  } else {
                    if (param0 != 10) {
                      if (qi.field_b) {
                        break L2;
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
          L9: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var3);
            stackOut_26_1 = new StringBuilder().append("k.D(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_a = (String) null;
          field_a = null;
          field_d = null;
          field_b = null;
          field_e = null;
          field_f = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_b = null;
          field_e = null;
          field_f = null;
          return;
        }
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
        int decompiledRegionSelector0 = 0;
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
                var4 = this.field_c.field_a.field_d;
                break L1;
              }
            }
            if (var4 == this.field_c.field_a) {
              this.field_g = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_g = var4.field_d;
              stackOut_7_0 = (uf) (var4);
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("k.E(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (uf) ((Object) stackIn_6_0);
        } else {
          return stackIn_8_0;
        }
    }

    final static fd a(int param0) {
        if (qb.field_b != null) {
          if (param0 < 26) {
            field_a = (String) null;
            return qb.field_b;
          } else {
            return qb.field_b;
          }
        } else {
          qb.field_b = new fd(ra.field_l, 20, 0, 0, 0, 11579568, -1, 0, 0, ra.field_l.field_s, -1, 2147483647, true);
          if (param0 >= 26) {
            return qb.field_b;
          } else {
            field_a = (String) null;
            return qb.field_b;
          }
        }
    }

    final uf b(int param0) {
        uf var2 = null;
        var2 = this.field_c.field_a.field_a;
        if (var2 != this.field_c.field_a) {
          if (param0 <= 45) {
            field_b = (og) null;
            this.field_g = var2.field_a;
            return var2;
          } else {
            this.field_g = var2.field_a;
            return var2;
          }
        } else {
          this.field_g = null;
          return null;
        }
    }

    final uf a(int param0, uf param1) {
        uf var3 = null;
        RuntimeException var3_ref = null;
        uf stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        uf stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        uf stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        uf stackOut_1_0 = null;
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
                  var3 = this.field_c.field_a.field_a;
                  break L1;
                } else {
                  var3 = param1;
                  break L1;
                }
              }
              if (this.field_c.field_a != var3) {
                this.field_g = var3.field_a;
                stackOut_9_0 = (uf) (var3);
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                this.field_g = null;
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = (uf) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("k.F(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (uf) ((Object) stackIn_8_0);
          } else {
            return stackIn_10_0;
          }
        }
    }

    final uf a(byte param0) {
        uf var2 = null;
        var2 = this.field_c.field_a.field_d;
        if (param0 == -13) {
          if (this.field_c.field_a == var2) {
            this.field_g = null;
            return null;
          } else {
            this.field_g = var2.field_d;
            return var2;
          }
        } else {
          field_b = (og) null;
          if (this.field_c.field_a == var2) {
            this.field_g = null;
            return null;
          } else {
            this.field_g = var2.field_d;
            return var2;
          }
        }
    }

    k(jj param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "k.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final uf d(int param0) {
        uf var2 = null;
        if (param0 > -78) {
            field_a = (String) null;
            var2 = this.field_g;
            if (!(var2 != this.field_c.field_a)) {
                this.field_g = null;
                return null;
            }
            this.field_g = var2.field_a;
            return var2;
        }
        var2 = this.field_g;
        if (!(var2 != this.field_c.field_a)) {
            this.field_g = null;
            return null;
        }
        this.field_g = var2.field_a;
        return var2;
    }

    static {
        field_d = new String[]{"Moving and shooting", "Your normal cursor is shown by this green box. If the box is over a staircase, an arrow will appear to denote which direction the stairs travel.", "By left clicking on the terrain, the movement cursor will appear with a number saying how much time it will take to move to this position. Click once more to confirm and your soldier will move.", "If the cursor is positioned over a controllable soldier, it will turn blue. Click to select the soldier.", "Moving the cursor over an enemy will change the cursor to a red targeting icon. Left clicking will make your soldier fire a shot at the target. If you select your gun from the console you will enter auto-fire mode allowing you to fire at any position on the landscape. This is useful for explosive weapons or if you cannot see your target.", "If a soldier is in ready mode, they will automatically crouch when next to cover such as a low wall or hedge. Enemy fire is likely to hit the cover and thus not injure your soldier. Remember that cover can be destroyed by explosives or powerful guns."};
        field_e = new int[8192];
        field_a = "MML-4";
        field_b = new og();
    }
}
