/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends pj implements kd, ke {
    private hf field_P;
    static int field_N;
    private hf field_S;
    private kl field_L;
    private String field_J;
    static int[] field_Q;
    static int field_R;
    static he[] field_O;
    private boolean field_U;
    private hf field_K;
    private boolean field_V;
    private boolean field_T;
    private kl field_M;

    public final void a(kl param0, byte param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (param1 == 83) {
              L1: {
                if (param0 == this.field_L) {
                  this.field_M.a(false, (vg) (this));
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 != this.field_M) {
                  break L2;
                } else {
                  this.g((byte) -121);
                  break L2;
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
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("wa.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void j(int param0) {
        field_Q = null;
        if (param0 != -11179) {
            wa.a((byte) 75, false);
        }
        field_O = null;
    }

    private final void g(byte param0) {
        L0: {
          L1: {
            if (na.b(-1)) {
              break L1;
            } else {
              if (0 >= this.field_L.field_p.length()) {
                break L0;
              } else {
                if (this.field_M.field_p.length() > 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          pc.a(param0 ^ 32, this.field_L.field_p, this.field_M.field_p);
          break L0;
        }
        L2: {
          if (param0 == -121) {
            break L2;
          } else {
            this.g((byte) -63);
            break L2;
          }
        }
    }

    final void i(int param0) {
        if (param0 != 134) {
            this.field_P = (hf) null;
        }
        this.field_L.h((byte) 88);
        this.field_M.h((byte) 88);
    }

    public final void a(boolean param0, kl param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_O = (he[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("wa.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final String b(boolean param0) {
        if (param0) {
            this.g((byte) 79);
        }
        if (!(null != this.field_L.field_p)) {
            return "";
        }
        return this.field_L.field_p;
    }

    final static void a(String param0, boolean param1, java.applet.Applet param2, byte param3) {
        try {
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            try {
              L0: {
                L1: {
                  if (param3 == 9) {
                    break L1;
                  } else {
                    wa.a((byte) 5);
                    break L1;
                  }
                }
                L2: {
                  if (!bl.field_r.startsWith("win")) {
                    break L2;
                  } else {
                    if (og.a(param0, 0)) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                try {
                  L3: {
                    param2.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
                    break L3;
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                    gb.a((Throwable) null, "MGR1: " + param0, 10);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_12_0 = (RuntimeException) (var4_ref);

                stackIn_12_1 = new StringBuilder().append("wa.H(");

                if (param0 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L5;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L6;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L6;
                }
              }
              throw ie.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (null != this.field_J) {
            uh.field_i.a(this.field_J, 20 + (param0 + this.field_o), this.field_m + (param3 + 15), this.field_w + -40, this.field_k, 16777215, -1, 1, 0, uh.field_i.field_x);
        }
        if (!(null == this.field_K)) {
            wj.g(10 + param0, param3 + 134, -20 + this.field_w, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    wa(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (cg) null);
        dh dupTemp$0 = null;
        dh dupTemp$1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_18_0 = null;
        hf stackIn_18_1 = null;
        hf stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        hf stackIn_19_1 = null;
        hf stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ie var6 = null;
        RuntimeException var6_ref = null;
        rf var7 = null;
        String var8 = null;
        sd var9 = null;
        dh var12 = null;
        dh var13 = null;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param3) {
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
              ((wa) (this)).field_V = stackIn_4_1 != 0;
              this.field_J = param1;
              stackIn_6_0 = this;

              if (!param2) {
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
              ((wa) (this)).field_T = stackIn_7_1 != 0;
              stackIn_9_0 = this;

              if (!param4) {
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
              ((wa) (this)).field_U = stackIn_10_1 != 0;
              if (!this.field_T) {
                break L4;
              } else {
                L5: {
                  if (this.field_V) {
                    break L5;
                  } else {
                    if (!this.field_U) {
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
              this.field_L = (kl) ((Object) new qg(param0, (fd) (this), 100));
              this.field_M = (kl) ((Object) new qg("", (fd) (this), 20));
              if (!this.field_T) {
                L7: {
                  this.field_S = new hf(rc.field_b, (fd) null);
                  stackIn_18_0 = this;

                  stackIn_18_1 = null;

                  stackIn_18_2 = null;

                  if (!this.field_U) {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = f.field_m;
                    break L7;
                  } else {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = ml.field_m;
                    break L7;
                  }
                }
                ((wa) (this)).field_P = new hf(stackIn_19_3, (fd) null);
                if (!this.field_V) {
                  break L6;
                } else {
                  this.field_K = new hf(ai.field_v, (fd) (this));
                  break L6;
                }
              } else {
                this.field_S = new hf(DrPhlogistonSavesTheEarth.field_E, (fd) null);
                this.field_P = new hf(qk.field_d, (fd) null);
                this.field_L.field_E = false;
                break L6;
              }
            }
            L8: {
              this.field_L.field_l = (cg) ((Object) new mj(10000536));
              this.field_M.field_l = (cg) ((Object) new dm(10000536));
              var6 = new ie();
              this.field_S.field_l = (cg) ((Object) var6);
              if (null == this.field_P) {
                break L8;
              } else {
                this.field_P.field_l = (cg) ((Object) var6);
                break L8;
              }
            }
            L9: {
              this.field_L.field_v = bf.field_x;
              if (this.field_K == null) {
                break L9;
              } else {
                this.field_K.field_l = (cg) ((Object) var6);
                break L9;
              }
            }
            L10: {
              if (null == this.field_K) {
                break L10;
              } else {
                this.field_K.field_v = ai.field_w;
                break L10;
              }
            }
            L11: {
              if (!this.field_T) {
                if (!this.field_U) {
                  this.field_P.field_l = (cg) ((Object) new uk());
                  break L11;
                } else {
                  this.field_P.field_v = v.field_X;
                  this.field_P.field_l = (cg) ((Object) new uk());
                  break L11;
                }
              } else {
                this.field_P.field_v = ka.field_l;
                break L11;
              }
            }
            L12: {
              this.field_m = 15;
              var7 = uh.field_i;
              if (this.field_J == null) {
                break L12;
              } else {
                this.field_m = this.field_m + (var7.a(this.field_J, -40 + this.field_w, var7.field_x) + 5);
                break L12;
              }
            }
            L13: {
              var8 = ij.field_b;
              var9 = dg.a(nb.a(-117), (byte) -87);
              if (var9 == p.field_d) {
                var8 = rc.field_c;
                break L13;
              } else {
                if (var9 != ka.field_q) {
                  break L13;
                } else {
                  var8 = gk.field_b;
                  break L13;
                }
              }
            }
            L14: {
              dupTemp$0 = new dh(10, this.field_m, this.field_w - 20, 25, this.field_L, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.b(dupTemp$0, (byte) 53);
              this.field_m = this.field_m + (((vg) ((Object) var12)).field_k - -5);
              dupTemp$1 = new dh(10, this.field_m, -20 + this.field_w, 25, this.field_M, false, 80, 3, var7, 16777215, qf.field_a);
              var13 = dupTemp$1;
              this.b(dupTemp$1, (byte) 77);
              this.field_m = this.field_m + (((vg) ((Object) var13)).field_k + 5);
              this.field_S.field_u = (fd) (this);
              if (this.field_K == null) {
                break L14;
              } else {
                this.field_K.field_u = (fd) (this);
                break L14;
              }
            }
            L15: {
              if (this.field_P == null) {
                break L15;
              } else {
                this.field_P.field_u = (fd) (this);
                break L15;
              }
            }
            L16: {
              if (null != this.field_K) {
                this.field_S.a(this.field_m, 30, 85, 16535, -95 + this.field_w);
                this.field_m = this.field_m + 60;
                break L16;
              } else {
                this.field_S.a(this.field_m, 30, 8, 16535, -16 + this.field_w);
                this.field_m = this.field_m + 35;
                break L16;
              }
            }
            L17: {
              if (this.field_K == null) {
                break L17;
              } else {
                this.field_K.a(this.field_m, 30, 8, 16535, -6 + (this.field_w + -10));
                this.field_m = this.field_m + 35;
                break L17;
              }
            }
            L18: {
              if (this.field_P == null) {
                break L18;
              } else {
                L19: {
                  if (this.field_T) {
                    break L19;
                  } else {
                    if (!this.field_U) {
                      this.field_P.a(this.field_m, 20, 8, 16535, 40);
                      this.field_m = this.field_m + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                this.field_P.a(this.field_m, 30, 8, 16535, -6 + (this.field_w - 10));
                this.field_m = this.field_m + 35;
                break L18;
              }
            }
            L20: {
              this.a(0, 3 + this.field_m, 0, 16535, this.field_w);
              this.b(this.field_S, (byte) 89);
              if (null == this.field_K) {
                break L20;
              } else {
                this.b(this.field_K, (byte) 90);
                break L20;
              }
            }
            L21: {
              if (this.field_P == null) {
                break L21;
              } else {
                this.b(this.field_P, (byte) 54);
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

            stackIn_59_1 = new StringBuilder().append("wa.<init>(");

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
          throw ie.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, char param1, vg param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, 72)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param3 > 63) {
                  break L1;
                } else {
                  this.field_S = (hf) null;
                  break L1;
                }
              }
              if (-99 == (param0 ^ -1)) {
                stackIn_9_0 = this.a(param2, 65535);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (99 == param0) {
                  stackIn_13_0 = this.a(param2, (byte) 98);
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
          L2: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("wa.BA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    public final void a(int param0, int param1, boolean param2, hf param3, int param4) {
        int var7 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        java.applet.Applet var8 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_S != param3) {
                if (param3 == this.field_K) {
                  L2: {
                    if (param2) {
                      stackIn_14_0 = 0;
                      break L2;
                    } else {
                      stackIn_14_0 = 1;
                      break L2;
                    }
                  }
                  ta.b(stackIn_14_0 != 0);
                  break L1;
                } else {
                  if (this.field_P == param3) {
                    if (this.field_T) {
                      sg.a(param2);
                      break L1;
                    } else {
                      if (this.field_U) {
                        gf.d((byte) 89);
                        break L1;
                      } else {
                        oh.a((byte) 75);
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                this.g((byte) -121);
                break L1;
              }
            }
            L3: {
              if (param2) {
                break L3;
              } else {
                var8 = (java.applet.Applet) null;
                wa.a((String) null, true, (java.applet.Applet) null, (byte) -7);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var6);

            stackIn_20_1 = new StringBuilder().append("wa.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0) {
        if (param0 != -43) {
            field_R = -56;
        }
    }

    final static int a(byte param0, boolean param1) {
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            nf.field_w = nf.field_w + 65536;
            L1: while (true) {
              if (65536 > bj.a(false, nf.field_w, rd.field_G)) {
                L2: {
                  var2_int = -1;
                  if (null != gl.field_e) {
                    var2_int = gl.field_e.length;
                    break L2;
                  } else {
                    if (bh.field_c != null) {
                      var2_int = bh.field_c.length;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var3 = -10 / ((param0 - -62) / 33);
                  if (var2_int != -1) {
                    L4: {
                      if (rd.field_D > la.field_b) {
                        L5: {
                          la.field_b = la.field_b + 1;
                          if (rd.field_F >= la.field_b) {
                            break L5;
                          } else {
                            L6: {
                              if (null == gl.field_e) {
                                break L6;
                              } else {
                                if (null == gl.field_e[ig.field_k]) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            la.field_b = la.field_b - 1;
                            break L4;
                          }
                        }
                        if (rd.field_D > la.field_b) {
                          break L4;
                        } else {
                          if (gl.field_e[(1 + ig.field_k) % var2_int] == null) {
                            la.field_b = la.field_b - 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    L7: {
                      if (rd.field_D <= la.field_b) {
                        L8: {
                          bd.field_L = ig.field_k;
                          if (!ie.field_B) {
                            ig.field_k = ig.field_k - 1;
                            if ((ig.field_k ^ -1) > -1) {
                              ig.field_k = ig.field_k + var2_int;
                              break L8;
                            } else {
                              break L8;
                            }
                          } else {
                            ig.field_k = ig.field_k + 1;
                            if (ig.field_k >= var2_int) {
                              ig.field_k = ig.field_k - var2_int;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                        la.field_b = la.field_b - rd.field_D;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (la.field_b <= rd.field_F) {
                      break L3;
                    } else {
                      ie.field_B = true;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L9: {
                  if (sc.field_c == null) {
                    break L9;
                  } else {
                    L10: {
                      var4 = 357 + -(sc.field_c.field_C / 2);
                      var5 = 0;
                      if (-1 == (mh.field_f ^ -1)) {
                        break L10;
                      } else {
                        if (var4 >= ih.field_R) {
                          break L10;
                        } else {
                          if (ih.field_R < var4 - -sc.field_c.field_w) {
                            L11: {
                              if (ae.field_gb <= -sc.field_c.field_y + 269) {
                                break L11;
                              } else {
                                if ((ae.field_gb ^ -1) <= -270) {
                                  break L11;
                                } else {
                                  ie.field_B = false;
                                  var5 = 1;
                                  la.field_b = rd.field_D;
                                  break L11;
                                }
                              }
                            }
                            if (ae.field_gb <= 586) {
                              break L10;
                            } else {
                              if (ae.field_gb < sc.field_c.field_y + 586) {
                                var5 = 1;
                                la.field_b = rd.field_D;
                                ie.field_B = true;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    if (var5 != 0) {
                      break L9;
                    } else {
                      if (rd.field_F >= la.field_b) {
                        break L9;
                      } else {
                        if (ob.field_g <= var4) {
                          break L9;
                        } else {
                          if (ob.field_g >= var4 + sc.field_c.field_w) {
                            break L9;
                          } else {
                            L12: {
                              if (-sc.field_c.field_y + 269 >= ck.field_c) {
                                break L12;
                              } else {
                                if (-270 >= (ck.field_c ^ -1)) {
                                  break L12;
                                } else {
                                  la.field_b = rd.field_F;
                                  break L12;
                                }
                              }
                            }
                            if (-587 <= (ck.field_c ^ -1)) {
                              break L9;
                            } else {
                              if (sc.field_c.field_y + 586 > ck.field_c) {
                                la.field_b = rd.field_F;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L13: {
                  if (!param1) {
                    break L13;
                  } else {
                    L14: {
                      lb.field_w.a(0, ua.a(ob.field_g, -13412, ck.field_c), ua.a(ih.field_R, -13412, ae.field_gb));
                      if (!lb.field_w.c((byte) -82)) {
                        break L14;
                      } else {
                        if (-1 == (lb.field_w.field_f ^ -1)) {
                          stackIn_62_0 = 3;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          if (1 != lb.field_w.field_f) {
                            break L14;
                          } else {
                            stackIn_65_0 = 2;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                    L15: while (true) {
                      if (!th.a(83)) {
                        break L13;
                      } else {
                        L16: {
                          lb.field_w.a(0, (byte) 123);
                          if (!lb.field_w.c((byte) -82)) {
                            break L16;
                          } else {
                            if (lb.field_w.field_f == 0) {
                              stackIn_72_0 = 3;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              if (lb.field_w.field_f != 1) {
                                break L16;
                              } else {
                                stackIn_75_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                        }
                        if (di.field_c == 13) {
                          stackIn_79_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          continue L15;
                        }
                      }
                    }
                  }
                }
                stackIn_81_0 = 0;
                decompiledRegionSelector0 = 5;
                break L0;
              } else {
                k.field_L = k.field_L + 1;
                nf.field_w = nf.field_w - rd.field_G;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "wa.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_62_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_65_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_72_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_75_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_79_0;
                } else {
                  return stackIn_81_0;
                }
              }
            }
          }
        }
    }

    final void b(byte param0, String param1) {
        kl var3 = null;
        String var4 = null;
        try {
            if (param0 < 24) {
                this.field_M = (kl) null;
            }
            var3 = this.field_L;
            var4 = param1;
            var3.a(false, var4, -19116);
            this.field_M.h((byte) 88);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "wa.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Q = new int[75];
    }
}
