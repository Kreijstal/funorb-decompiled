/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pt extends sf {
    private int field_Z;
    static String[] field_W;
    static je field_X;
    private int field_ib;
    private int field_hb;
    private bh field_cb;
    private tv field_bb;
    static h field_db;
    private int field_ab;
    private kb field_jb;
    private int field_fb;
    static uv field_eb;
    static String field_Y;
    static String field_gb;

    final static void c(int param0, int param1, int param2) {
        if (param2 < 1) {
            field_db = (h) null;
            rk.field_B = param0;
            ar.field_C = param1;
            return;
        }
        rk.field_B = param0;
        ar.field_C = param1;
    }

    final void m(int param0) {
        if (!(this.field_bb != ur.field_v)) {
            return;
        }
        this.field_bb = ki.field_e;
        int var2 = 113 % ((param0 - 69) / 50);
        this.field_hb = 0;
        this.b(72, this.field_jb);
        this.field_jb = null;
        this.field_cb.field_K = 0;
    }

    boolean a(byte param0) {
        int fieldTemp$15 = 0;
        boolean discarded$16 = false;
        boolean discarded$17 = false;
        boolean discarded$18 = false;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        boolean discarded$21 = false;
        boolean discarded$22 = false;
        boolean discarded$23 = false;
        boolean discarded$24 = false;
        int fieldTemp$25 = 0;
        boolean discarded$26 = false;
        boolean discarded$27 = false;
        boolean discarded$28 = false;
        boolean discarded$29 = false;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null != this.field_bb) {
          if (ur.field_v == this.field_bb) {
            fieldTemp$15 = this.field_hb + 1;
            this.field_hb = this.field_hb + 1;
            if (this.field_ib == fieldTemp$15) {
              this.field_bb = g.field_c;
              this.a(this.field_Z, false, this.field_jb.field_w + 12 + this.field_ab, this.field_jb.field_l + 12);
              this.field_hb = 0;
              this.field_cb.field_K = 0;
              if (param0 == -1) {
                return super.a((byte) -1);
              } else {
                discarded$16 = this.k(117);
                return super.a((byte) -1);
              }
            } else {
              this.field_cb.field_K = 256 + -((this.field_hb << -1638888056) / this.field_ib);
              if (var3 == 0) {
                if (param0 == -1) {
                  return super.a((byte) -1);
                } else {
                  discarded$17 = this.k(117);
                  return super.a((byte) -1);
                }
              } else {
                this.field_bb = g.field_c;
                this.a(this.field_Z, false, this.field_jb.field_w + 12 + this.field_ab, this.field_jb.field_l + 12);
                this.field_hb = 0;
                this.field_cb.field_K = 0;
                if (param0 == -1) {
                  return super.a((byte) -1);
                } else {
                  discarded$18 = this.k(117);
                  return super.a((byte) -1);
                }
              }
            }
          } else {
            if (ki.field_e == this.field_bb) {
              fieldTemp$19 = this.field_hb + 1;
              this.field_hb = this.field_hb + 1;
              if (this.field_fb == fieldTemp$19) {
                this.field_bb = null;
                this.field_cb.field_K = 256;
                if (var3 != 0) {
                  fieldTemp$20 = this.field_hb + 1;
                  this.field_hb = this.field_hb + 1;
                  if (this.field_ib == fieldTemp$20) {
                    this.field_bb = g.field_c;
                    this.a(this.field_Z, false, this.field_jb.field_w + 12 + this.field_ab, this.field_jb.field_l + 12);
                    this.field_hb = 0;
                    this.field_cb.field_K = 0;
                    if (param0 != -1) {
                      discarded$21 = this.k(117);
                      return super.a((byte) -1);
                    } else {
                      return super.a((byte) -1);
                    }
                  } else {
                    this.field_cb.field_K = 256 + -((this.field_hb << -1638888056) / this.field_ib);
                    if (var3 == 0) {
                      if (param0 != -1) {
                        discarded$22 = this.k(117);
                        return super.a((byte) -1);
                      } else {
                        return super.a((byte) -1);
                      }
                    } else {
                      this.field_bb = g.field_c;
                      this.a(this.field_Z, false, this.field_jb.field_w + 12 + this.field_ab, this.field_jb.field_l + 12);
                      this.field_hb = 0;
                      this.field_cb.field_K = 0;
                      if (param0 != -1) {
                        discarded$23 = this.k(117);
                        return super.a((byte) -1);
                      } else {
                        return super.a((byte) -1);
                      }
                    }
                  }
                } else {
                  if (param0 != -1) {
                    discarded$24 = this.k(117);
                    return super.a((byte) -1);
                  } else {
                    return super.a((byte) -1);
                  }
                }
              } else {
                this.field_cb.field_K = (this.field_hb << 134380648) / this.field_fb;
                if (var3 != 0) {
                  L0: {
                    this.field_bb = null;
                    this.field_cb.field_K = 256;
                    if (var3 == 0) {
                      break L0;
                    } else {
                      L1: {
                        fieldTemp$25 = this.field_hb + 1;
                        this.field_hb = this.field_hb + 1;
                        if (this.field_ib == fieldTemp$25) {
                          break L1;
                        } else {
                          this.field_cb.field_K = 256 + -((this.field_hb << -1638888056) / this.field_ib);
                          break L1;
                        }
                      }
                      this.field_bb = g.field_c;
                      this.a(this.field_Z, false, this.field_jb.field_w + 12 + this.field_ab, this.field_jb.field_l + 12);
                      this.field_hb = 0;
                      this.field_cb.field_K = 0;
                      break L0;
                    }
                  }
                  if (param0 != -1) {
                    discarded$26 = this.k(117);
                    return super.a((byte) -1);
                  } else {
                    return super.a((byte) -1);
                  }
                } else {
                  if (param0 != -1) {
                    discarded$27 = this.k(117);
                    return super.a((byte) -1);
                  } else {
                    return super.a((byte) -1);
                  }
                }
              }
            } else {
              if (param0 != -1) {
                discarded$28 = this.k(117);
                return super.a((byte) -1);
              } else {
                return super.a((byte) -1);
              }
            }
          }
        } else {
          if (param0 == -1) {
            return super.a((byte) -1);
          } else {
            discarded$29 = this.k(117);
            return super.a((byte) -1);
          }
        }
    }

    public static void i(byte param0) {
        field_db = null;
        field_gb = null;
        field_eb = null;
        field_W = null;
        field_Y = null;
        if (param0 != -72) {
            return;
        }
        field_X = null;
    }

    final void l(int param0) {
        int var2 = 0;
        if (this.field_bb != null) {
          if (ki.field_e == this.field_bb) {
            this.field_bb = null;
            this.field_cb.field_K = 256;
            super.l(81);
            var2 = 71 % ((param0 - -25) / 57);
            return;
          } else {
            this.a(this.field_jb.field_l + 12, (byte) 98, 12 + (this.field_ab - -this.field_jb.field_w));
            this.b(107, this.field_jb);
            this.field_bb = null;
            this.field_cb.field_K = 256;
            super.l(81);
            var2 = 71 % ((param0 - -25) / 57);
            return;
          }
        } else {
          super.l(81);
          var2 = 71 % ((param0 - -25) / 57);
          return;
        }
    }

    void a(kb param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              L2: {
                var3_int = 116 % ((-27 - param1) / 44);
                this.field_jb = param0;
                if (this.field_bb != g.field_c) {
                  break L2;
                } else {
                  this.a(this.field_Z, false, this.field_jb.field_w + (12 + this.field_ab), 12 - -this.field_jb.field_l);
                  this.field_hb = 0;
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (this.field_bb == ur.field_v) {
                break L1;
              } else {
                this.field_bb = ur.field_v;
                this.field_hb = 0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("pt.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    boolean a(kb param0, int param1, char param2, int param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (null != this.field_cb) {
                L1: {
                  if (98 != param1) {
                    break L1;
                  } else {
                    discarded$4 = this.field_cb.a(param3 ^ -12222, param0);
                    break L1;
                  }
                }
                L2: {
                  if ((param1 ^ -1) == -100) {
                    discarded$5 = this.field_cb.a(11, param0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("pt.F(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final boolean k(int param0) {
        int var2 = 115 / ((param0 - -1) / 44);
        this.l(121);
        return super.k(92);
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
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
            try {
              L1: {
                L2: {
                  var4 = param2.getGraphics();
                  if (param1 == 12) {
                    break L2;
                  } else {
                    field_Y = (String) null;
                    break L2;
                  }
                }
                so.field_b.a(255, var4, param0, param3);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param2.repaint();
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4_ref2);
            stackOut_6_1 = new StringBuilder().append("pt.E(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L4;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    private final void b(int param0, kb param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (this.field_cb == null) {
                break L1;
              } else {
                this.field_cb.d(92);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 == null) {
                  break L3;
                } else {
                  param1.a(6, param1.field_l, 6 - -this.field_ab, 8192, param1.field_w);
                  this.field_cb = new bh(param1);
                  if (!ArmiesOfGielinor.field_M) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_cb = new bh();
              break L2;
            }
            var3_int = 29 % ((param0 - 24) / 42);
            this.a((byte) 10, (kb) (this.field_cb));
            this.field_jb = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (runtimeException);
            stackOut_8_1 = new StringBuilder().append("pt.G(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    pt(gk param0, kb param1, int param2, int param3, int param4) {
        super(param0, param1.field_l + 12, 12 + param2 - -param1.field_w);
        try {
            this.field_Z = param4;
            this.field_ab = param2;
            this.field_fb = param3;
            this.field_ib = param3;
            this.b(-36, param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "pt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_W = new String[]{"ready", "walk", "run", "attack", "ranged", "jeer", "defend", "death"};
        field_db = new h(3);
        field_Y = "Go Back";
        field_gb = "You cannot chat to <%0> because <%0> is offline in your friend list.";
    }
}
