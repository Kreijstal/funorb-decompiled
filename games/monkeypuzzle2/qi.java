/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends ua implements vc, ql {
    private boolean field_F;
    private String field_B;
    private rj field_H;
    static String field_A;
    private t field_D;
    static String field_J;
    private rj field_L;
    static le[] field_K;
    private t field_C;
    static String field_E;
    private boolean field_G;
    private t field_I;
    private boolean field_z;

    final void a(String param0, byte param1) {
        rj var3 = this.field_L;
        String var4 = param0;
        if (param1 != -34) {
            return;
        }
        try {
            var3.a(false, param1 ^ 5937, var4);
            this.field_H.f((byte) -64);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "qi.FA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        try {
            if (!((k.field_g ^ -1) != -12)) {
                ub.a(250);
            }
            if (param1 >= -82) {
                field_A = (String) null;
            }
            kg.a(be.field_d, lh.field_e, pj.field_h, -9089);
            oh.a(0, (byte) 63, 0, param0);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "qi.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, rj param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 < -19) {
                break L1;
              } else {
                this.field_L = (rj) null;
                break L1;
              }
            }
            L2: {
              if (param1 != this.field_L) {
                break L2;
              } else {
                this.field_H.a((we) (this), false);
                break L2;
              }
            }
            L3: {
              if (this.field_H != param1) {
                break L3;
              } else {
                this.b(true);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("qi.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final static void a(int param0, gk param1, int param2, boolean param3, int param4) {
        param1.b(12, -49152);
        param1.c(17, 93);
        if (param3) {
            return;
        }
        try {
            param1.c(param2, 96);
            param1.c(param0, 125);
            param1.b(param4, -49152);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "qi.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void d(byte param0) {
        field_K = null;
        if (param0 != 98) {
            gk var2 = (gk) null;
            qi.a(10, (gk) null, 41, false, -90);
        }
        field_E = null;
        field_J = null;
        field_A = null;
    }

    final String a(int param0) {
        if (!(null != this.field_L.field_s)) {
            return "";
        }
        if (param0 < 10) {
            return (String) null;
        }
        return this.field_L.field_s;
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, -56)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5_int = 120 % ((param3 - 37) / 50);
              if ((param2 ^ -1) == -99) {
                stackIn_7_0 = this.a((byte) 120, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((param2 ^ -1) == -100) {
                  stackIn_11_0 = this.b(param0, false);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("qi.V(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final void k(int param0) {
        int var2 = -33 / ((param0 - -52) / 50);
        this.field_L.f((byte) -20);
        this.field_H.f((byte) -51);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (null != this.field_B) {
            t.field_z.a(this.field_B, 20 + (this.field_r + param3), 15 + this.field_e + param2, this.field_l + -40, this.field_p, 16777215, -1, 1, 0, t.field_z.field_C);
        }
        if (this.field_D != null) {
            ge.a(10 + param3, param2 + 134, this.field_l - 20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        vf.a((byte) 66);
        ge.c(param3, param4, param0, param2);
        if (!param1) {
            field_A = (String) null;
        }
    }

    public final void b(int param0, rj param1) {
        try {
            if (param0 != 16926) {
                this.a(-58);
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "qi.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    qi(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ml) null);
        mh dupTemp$0 = null;
        mh dupTemp$1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_17_0 = null;
        t stackIn_17_1 = null;
        t stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        t stackIn_18_1 = null;
        t stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        hd var6 = null;
        RuntimeException var6_ref = null;
        ta var7 = null;
        String var8 = null;
        cd var9 = null;
        mh var12 = null;
        mh var13 = null;
        try {
          L0: {
            L1: {
              this.field_B = param1;
              stackIn_3_0 = this;

              if (!param4) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((qi) (this)).field_F = stackIn_4_1 != 0;
              stackIn_6_0 = this;

              if (!param3) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              ((qi) (this)).field_G = stackIn_7_1 != 0;
              stackIn_9_0 = this;

              if (!param2) {
                stackIn_10_0 = this;
                stackIn_10_1 = 0;
                break L3;
              } else {
                stackIn_10_0 = this;
                stackIn_10_1 = 1;
                break L3;
              }
            }
            L4: {
              ((qi) (this)).field_z = stackIn_10_1 != 0;
              if (!this.field_z) {
                break L4;
              } else {
                L5: {
                  if (this.field_G) {
                    break L5;
                  } else {
                    if (!this.field_F) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              this.field_L = (rj) ((Object) new qc(param0, (of) (this), 100));
              this.field_H = (rj) ((Object) new qc("", (of) (this), 20));
              if (this.field_z) {
                this.field_I = new t(qd.field_c, (of) null);
                this.field_C = new t(vh.field_L, (of) null);
                this.field_L.field_w = false;
                break L6;
              } else {
                L7: {
                  this.field_I = new t(fe.field_c, (of) null);
                  stackIn_17_0 = this;

                  stackIn_17_1 = null;

                  stackIn_17_2 = null;

                  if (!this.field_F) {
                    stackIn_18_0 = this;
                    stackIn_18_1 = null;
                    stackIn_18_2 = null;
                    stackIn_18_3 = nf.field_E;
                    break L7;
                  } else {
                    stackIn_18_0 = this;
                    stackIn_18_1 = null;
                    stackIn_18_2 = null;
                    stackIn_18_3 = oi.field_d;
                    break L7;
                  }
                }
                ((qi) (this)).field_C = new t(stackIn_18_3, (of) null);
                if (!this.field_G) {
                  break L6;
                } else {
                  this.field_D = new t(oi.field_g, (of) (this));
                  break L6;
                }
              }
            }
            L8: {
              this.field_L.field_h = (ml) ((Object) new mg(10000536));
              this.field_H.field_h = (ml) ((Object) new ve(10000536));
              var6 = new hd();
              this.field_I.field_h = (ml) ((Object) var6);
              if (null == this.field_C) {
                break L8;
              } else {
                this.field_C.field_h = (ml) ((Object) var6);
                break L8;
              }
            }
            L9: {
              this.field_L.field_m = r.field_f;
              if (this.field_D == null) {
                break L9;
              } else {
                this.field_D.field_h = (ml) ((Object) var6);
                break L9;
              }
            }
            L10: {
              if (null == this.field_D) {
                break L10;
              } else {
                this.field_D.field_m = wd.field_s;
                break L10;
              }
            }
            L11: {
              if (this.field_z) {
                this.field_C.field_m = ba.field_c;
                break L11;
              } else {
                if (!this.field_F) {
                  this.field_C.field_h = (ml) ((Object) new lc());
                  break L11;
                } else {
                  this.field_C.field_m = ca.field_n;
                  this.field_C.field_h = (ml) ((Object) new lc());
                  break L11;
                }
              }
            }
            L12: {
              this.field_e = 15;
              var7 = t.field_z;
              if (this.field_B == null) {
                break L12;
              } else {
                this.field_e = this.field_e + (var7.a(this.field_B, this.field_l + -40, var7.field_C) - -5);
                break L12;
              }
            }
            L13: {
              var8 = wf.field_i;
              var9 = ei.a(ii.a(false), (byte) 125);
              if (var9 != oe.field_l) {
                if (dh.field_d != var9) {
                  break L13;
                } else {
                  var8 = tj.field_e;
                  break L13;
                }
              } else {
                var8 = p.field_c;
                break L13;
              }
            }
            L14: {
              dupTemp$0 = new mh(10, this.field_e, this.field_l - 20, 25, this.field_L, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.b((byte) -100, dupTemp$0);
              this.field_e = this.field_e + (5 + ((we) ((Object) var12)).field_p);
              dupTemp$1 = new mh(10, this.field_e, -20 + this.field_l, 25, this.field_H, false, 80, 3, var7, 16777215, ec.field_c);
              var13 = dupTemp$1;
              this.b((byte) -78, dupTemp$1);
              this.field_e = this.field_e + (((we) ((Object) var13)).field_p - -5);
              this.field_I.field_o = (of) (this);
              if (null == this.field_D) {
                break L14;
              } else {
                this.field_D.field_o = (of) (this);
                break L14;
              }
            }
            L15: {
              if (null == this.field_C) {
                break L15;
              } else {
                this.field_C.field_o = (of) (this);
                break L15;
              }
            }
            L16: {
              if (null == this.field_D) {
                this.field_I.a(30, 13361, 8, this.field_l - 6 + -10, this.field_e);
                this.field_e = this.field_e + 35;
                break L16;
              } else {
                this.field_I.a(30, 13361, 85, this.field_l + -95, this.field_e);
                this.field_e = this.field_e + 60;
                break L16;
              }
            }
            L17: {
              if (this.field_D == null) {
                break L17;
              } else {
                this.field_D.a(30, 13361, 8, this.field_l - 16, this.field_e);
                this.field_e = this.field_e + 35;
                break L17;
              }
            }
            L18: {
              if (null == this.field_C) {
                break L18;
              } else {
                L19: {
                  if (this.field_z) {
                    break L19;
                  } else {
                    if (this.field_F) {
                      break L19;
                    } else {
                      this.field_C.a(20, 13361, 8, 40, this.field_e);
                      this.field_e = this.field_e + 25;
                      break L18;
                    }
                  }
                }
                this.field_C.a(30, 13361, 8, -6 + (this.field_l - 10), this.field_e);
                this.field_e = this.field_e + 35;
                break L18;
              }
            }
            L20: {
              this.a(3 + this.field_e, 13361, 0, this.field_l, 0);
              this.b((byte) -105, this.field_I);
              if (this.field_D == null) {
                break L20;
              } else {
                this.b((byte) -69, this.field_D);
                break L20;
              }
            }
            L21: {
              if (this.field_C == null) {
                break L21;
              } else {
                this.b((byte) -64, this.field_C);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6_ref = decompiledCaughtException;
            stackIn_59_0 = (RuntimeException) (var6_ref);

            stackIn_59_1 = new StringBuilder().append("qi.<init>(");

            if (param0 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "null";
              break L22;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_62_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');

            if (param1 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L23;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L23;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param3 == 7) {
              L1: {
                if (this.field_I != param4) {
                  if (param4 == this.field_D) {
                    dc.a(0);
                    break L1;
                  } else {
                    if (this.field_C == param4) {
                      if (!this.field_z) {
                        if (!this.field_F) {
                          ok.a(15376);
                          break L1;
                        } else {
                          wg.f(-1);
                          break L1;
                        }
                      } else {
                        vf.a(false);
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                } else {
                  this.b(true);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("qi.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(boolean param0) {
        L0: {
          if (param0) {
            break L0;
          } else {
            field_E = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (ke.a(91)) {
              break L2;
            } else {
              if (this.field_L.field_s.length() <= 0) {
                break L1;
              } else {
                if (0 >= this.field_H.field_s.length()) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          gi.a((byte) 87, this.field_L.field_s, this.field_H.field_s);
          break L1;
        }
    }

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        wf var4 = null;
        bk var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (!param0) {
              var4 = (wf) ((Object) k.field_l.a((byte) -117));
              L1: while (true) {
                if (var4 == null) {
                  var5 = (bk) ((Object) wg.field_k.a((byte) -117));
                  L2: while (true) {
                    if (var5 == null) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      vb.a(param1, var5, true);
                      var5 = (bk) ((Object) wg.field_k.d((byte) 63));
                      continue L2;
                    }
                  }
                } else {
                  wj.a(25533, var4, param1);
                  var4 = (wf) ((Object) k.field_l.d((byte) 63));
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "qi.DA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_J = "Email address is unavailable";
        field_A = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_E = "Passwords can only contain letters and numbers";
    }
}
