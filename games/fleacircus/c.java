/*
 * Decompiled by CFR-JS 0.4.0.
 */
class c extends bb {
    private long field_L;
    private int field_N;
    static boolean field_U;
    static long field_P;
    private int field_M;
    private long field_Q;
    static int field_S;
    private int field_O;
    private boolean field_T;
    private boolean field_R;
    private int field_K;

    private final void q(int param0) {
        try {
            String var2 = null;
            var2 = this.p(0);
            if (param0 <= 82) {
              L0: {
                this.field_O = -105;
                if (0 < var2.length()) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.p(0))), (java.awt.datatransfer.ClipboardOwner) null);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                if (0 < var2.length()) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.p(0))), (java.awt.datatransfer.ClipboardOwner) null);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (this.field_K != this.field_M) {
            L1: {
              if (this.field_M > this.field_K) {
                stackOut_4_0 = this.field_K;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = this.field_M;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_5_0;
              if (this.field_M <= this.field_K) {
                stackOut_7_0 = this.field_K;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = this.field_M;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var3 = stackIn_8_0;
            this.field_M = var2;
            this.field_K = var2;
            this.field_i = this.field_i.substring(0, var2) + this.field_i.substring(var3, this.field_i.length());
            this.i(-1);
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          return;
        } else {
          this.field_R = true;
          return;
        }
    }

    final static void o(int param0) {
        ij.field_H = null;
        of.field_d = (byte[][]) null;
        if (param0 != -28210) {
          field_S = 0;
          vg.field_I = null;
          rd.field_d = null;
          ob.field_a = null;
          b.field_b = null;
          return;
        } else {
          vg.field_I = null;
          rd.field_d = null;
          ob.field_a = null;
          b.field_b = null;
          return;
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        long var6 = 0L;
        eg var9 = null;
        Object var16 = null;
        eg var16_ref = null;
        var16 = null;
        if (param2) {
          if (null != this.field_p) {
            if (-1 == (param3 ^ -1)) {
              this.field_p.a(-74, param1, this.field_D, (qa) (this), param0);
              if (this.field_p instanceof eg) {
                var16_ref = (eg) ((Object) this.field_p);
                if (this.field_M == this.field_K) {
                  var6 = lj.a((byte) -27);
                  if (((var6 + -this.field_Q) % 1000L ^ -1L) > -501L) {
                    var16_ref.a(param0, 0, (qa) (this), this.field_M, param1);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var16_ref.a((qa) (this), this.field_M, param0, this.field_K, -30298, param1);
                  var6 = lj.a((byte) -27);
                  if (((var6 + -this.field_Q) % 1000L ^ -1L) > -501L) {
                    var16_ref.a(param0, 0, (qa) (this), this.field_M, param1);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_O = -50;
          if (null != this.field_p) {
            if (-1 == (param3 ^ -1)) {
              this.field_p.a(-74, param1, this.field_D, (qa) (this), param0);
              if (this.field_p instanceof eg) {
                var9 = (eg) ((Object) this.field_p);
                if (this.field_M != this.field_K) {
                  var9.a((qa) (this), this.field_M, param0, this.field_K, -30298, param1);
                  var6 = lj.a((byte) -27);
                  if (((var6 + -this.field_Q) % 1000L ^ -1L) > -501L) {
                    var9.a(param0, 0, (qa) (this), this.field_M, param1);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var6 = lj.a((byte) -27);
                  if (((var6 + -this.field_Q) % 1000L ^ -1L) > -501L) {
                    var9.a(param0, 0, (qa) (this), this.field_M, param1);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final void r(int param0) {
        this.field_M = 0;
        this.field_K = 0;
        this.field_i = "";
        this.i(-1);
        if (param0 == 32) {
          return;
        } else {
          field_U = false;
          return;
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == (this.field_O ^ -1)) {
                break L1;
              } else {
                var3_int = this.field_O - this.field_i.length();
                if (var3_int < 0) {
                  param1 = param1.substring(0, var3_int);
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              L3: {
                if (this.field_M != this.field_i.length()) {
                  break L3;
                } else {
                  this.field_i = this.field_i + param1;
                  if (!fleas.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_i = this.field_i.substring(0, this.field_M) + param1 + this.field_i.substring(this.field_M, this.field_i.length());
              break L2;
            }
            this.field_M = this.field_M + param1.length();
            this.field_K = this.field_M;
            this.i(-1);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("c.QA(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
                break L1;
              } else {
                if (!(this.field_p instanceof eg)) {
                  break L1;
                } else {
                  L2: {
                    var8_int = ((eg) ((Object) this.field_p)).a(kc.field_b, (qa) (this), (byte) 97, param6, param0, ag.field_f);
                    stackOut_2_0 = this;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (-1 == var8_int) {
                      stackOut_4_0 = this;
                      stackOut_4_1 = 0;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      break L2;
                    } else {
                      stackOut_3_0 = this;
                      stackOut_3_1 = var8_int;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      break L2;
                    }
                  }
                  L3: {
                    this.a(stackIn_5_1, -57);
                    var8_long = lj.a((byte) -93);
                    stackOut_5_0 = this;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if ((var8_long - this.field_L ^ -1L) <= -251L) {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L3;
                    } else {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L3;
                    }
                  }
                  L4: {
                    ((c) (this)).field_R = stackIn_8_1 != 0;
                    if (this.field_R) {
                      L5: {
                        this.field_K = this.j(127);
                        this.field_M = this.l(32);
                        if ((this.field_M ^ -1) >= -1) {
                          break L5;
                        } else {
                          if (32 == this.field_i.charAt(-1 + this.field_M)) {
                            this.field_M = this.field_M - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_N = this.field_M;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_L = var8_long;
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackOut_17_0 = 0;
            stackIn_18_0 = stackOut_17_0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var8);
            stackOut_19_1 = new StringBuilder().append("c.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_18_0 != 0;
        }
    }

    private final void n(int param0) {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param0 == -1) {
                    break L1;
                  } else {
                    this.field_N = 63;
                    break L1;
                  }
                }
                var2_ref = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.c(false);
                this.a(param0 + 1, var2_ref);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = (Exception) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    c(String param0, kd param1, int param2) {
        super(param0, param1);
        this.field_N = -1;
        this.field_R = false;
        this.field_L = 0L;
        try {
            this.field_p = nf.field_M.field_l;
            this.field_O = param2;
            this.a(true, (byte) -78, param0);
            this.field_T = true;
            this.field_Q = lj.a((byte) -19);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "c.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void m(int param0) {
        boolean discarded$1 = false;
        ne var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qa var9 = null;
        eg var10 = null;
        var8 = fleas.field_A ? 1 : 0;
        if (this.field_T) {
          if (!(this.field_p instanceof eg)) {
            return;
          } else {
            var10 = (eg) ((Object) this.field_p);
            var3 = var10.a((qa) (this), (byte) -35);
            var4 = var3.b((byte) 97);
            if (param0 > 89) {
              var5 = var10.b((qa) (this), (byte) -67);
              var6 = var10.a((byte) 127) >> -1183616383;
              if (var4 >= var5 + -var6) {
                L0: {
                  var7 = this.field_r - -var3.c(-1, this.field_M);
                  if (var5 + -var6 >= var7) {
                    if (var7 < var6) {
                      this.field_r = this.field_r + (var6 - var7);
                      break L0;
                    } else {
                      L1: {
                        if (this.field_r <= 0) {
                          break L1;
                        } else {
                          this.field_r = 0;
                          if (var8 != 0) {
                            break L1;
                          } else {
                            return;
                          }
                        }
                      }
                      if (this.field_r < -var5 - -var6) {
                        this.field_r = -var5 + var6;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    this.field_r = this.field_r - (-var5 - -var6) - var7;
                    if (var8 == 0) {
                      break L0;
                    } else {
                      L2: {
                        if (var7 < var6) {
                          this.field_r = this.field_r + (var6 - var7);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        if (this.field_r <= 0) {
                          break L3;
                        } else {
                          this.field_r = 0;
                          if (var8 != 0) {
                            break L3;
                          } else {
                            return;
                          }
                        }
                      }
                      if (this.field_r < -var5 - -var6) {
                        this.field_r = -var5 + var6;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
                L4: {
                  if (this.field_r <= 0) {
                    break L4;
                  } else {
                    this.field_r = 0;
                    if (var8 != 0) {
                      break L4;
                    } else {
                      return;
                    }
                  }
                }
                if (this.field_r >= -var5 - -var6) {
                  return;
                } else {
                  this.field_r = -var5 + var6;
                  return;
                }
              } else {
                this.field_r = 0;
                this.field_n = 0;
                return;
              }
            } else {
              var9 = (qa) null;
              discarded$1 = this.a(11, 11, (qa) null, '*');
              var5 = var10.b((qa) (this), (byte) -67);
              var6 = var10.a((byte) 127) >> -1183616383;
              if (var4 >= var5 + -var6) {
                var7 = this.field_r - -var3.c(-1, this.field_M);
                if (var5 + -var6 < var7) {
                  this.field_r = this.field_r - (-var5 - -var6) - var7;
                  if (var8 != 0) {
                    L5: {
                      if (var7 < var6) {
                        this.field_r = this.field_r + (var6 - var7);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (this.field_r > 0) {
                      this.field_r = 0;
                      if (var8 != 0) {
                        if (this.field_r < -var5 - -var6) {
                          this.field_r = -var5 + var6;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (this.field_r < -var5 - -var6) {
                        this.field_r = -var5 + var6;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (this.field_r <= 0) {
                      if (this.field_r < -var5 - -var6) {
                        this.field_r = -var5 + var6;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_r = 0;
                      return;
                    }
                  }
                } else {
                  L6: {
                    if (var7 < var6) {
                      this.field_r = this.field_r + (var6 - var7);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (this.field_r > 0) {
                    this.field_r = 0;
                    if (var8 == 0) {
                      return;
                    } else {
                      L7: {
                        if (this.field_r >= -var5 - -var6) {
                          break L7;
                        } else {
                          this.field_r = -var5 + var6;
                          break L7;
                        }
                      }
                      return;
                    }
                  } else {
                    L8: {
                      if (this.field_r >= -var5 - -var6) {
                        break L8;
                      } else {
                        this.field_r = -var5 + var6;
                        break L8;
                      }
                    }
                    return;
                  }
                }
              } else {
                this.field_r = 0;
                this.field_n = 0;
                return;
              }
            }
          }
        } else {
          this.field_n = 0;
          this.field_r = 0;
          return;
        }
    }

    private final void k(int param0) {
        if (param0 != -14) {
            return;
        }
        this.q(param0 ^ -97);
        this.c(false);
    }

    private final int j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        var3 = fleas.field_A ? 1 : 0;
        if (0 != this.field_M) {
          L0: {
            var2 = -1 + this.field_M;
            if (param0 > 79) {
              break L0;
            } else {
              this.r(-57);
              break L0;
            }
          }
          L1: while (true) {
            if ((var2 ^ -1) < -1) {
              stackOut_6_0 = -33;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (var3 == 0) {
                if (stackIn_8_0 == (this.field_i.charAt(var2 - 1) ^ -1)) {
                  return var2;
                } else {
                  var2--;
                  continue L1;
                }
              } else {
                return stackIn_7_0;
              }
            } else {
              return var2;
            }
          }
        } else {
          return this.field_M;
        }
    }

    final void a(boolean param0, byte param1, String param2) {
        int dupTemp$3 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param2 != null) {
                break L1;
              } else {
                param2 = "";
                break L1;
              }
            }
            L2: {
              if (param1 <= -39) {
                break L2;
              } else {
                this.i(125);
                break L2;
              }
            }
            L3: {
              this.field_i = param2;
              var4_int = param2.length();
              if (-1 == this.field_O) {
                break L3;
              } else {
                if (this.field_O < var4_int) {
                  this.field_i = this.field_i.substring(0, this.field_O);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              dupTemp$3 = this.field_i.length();
              this.field_K = dupTemp$3;
              this.field_M = dupTemp$3;
              if (!param0) {
                this.i(-1);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("c.PA(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    private final void a(int param0, int param1) {
        int discarded$2 = 0;
        if (param1 > -27) {
          L0: {
            discarded$2 = this.j(-45);
            this.field_M = param0;
            if (!ei.field_H[81]) {
              this.field_K = this.field_M;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            this.field_M = param0;
            if (!ei.field_H[81]) {
              this.field_K = this.field_M;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final void d(byte param0) {
        if (param0 <= 88) {
            return;
        }
        if (!(!(this.field_s instanceof nk))) {
            ((nk) ((Object) this.field_s)).a(-31825, (c) (this));
        }
    }

    void i(int param0) {
        L0: {
          if (this.field_s instanceof nk) {
            ((nk) ((Object) this.field_s)).b(param0 ^ -41, (c) (this));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == -1) {
          return;
        } else {
          field_U = true;
          return;
        }
    }

    private final String p(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 != 0) {
          return (String) null;
        } else {
          L0: {
            if (this.field_M > this.field_K) {
              stackOut_3_0 = this.field_K;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = this.field_M;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_4_0;
            if (this.field_M <= this.field_K) {
              stackOut_6_0 = this.field_K;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = this.field_M;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return this.field_i.substring(var2, var3);
        }
    }

    final static void a(int param0, byte param1, int param2, dd[] param3, int param4, int param5, fa param6, dd[] param7, int param8, int param9, boolean param10, int param11) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
              ib.a(param0, param9, param6, param3, param7, param2, 0, param8, param4, param2, param9, param5, param11, param10, param6);
              if (param1 > 66) {
                break L1;
              } else {
                field_P = 53L;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("c.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param6 == null) {
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
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param7 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ')');
        }
    }

    void a(int param0, int param1, qa param2, byte param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        eg var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -93);
              if (param3 < -85) {
                break L1;
              } else {
                this.field_N = 68;
                break L1;
              }
            }
            L2: {
              this.m(127);
              if (this.field_v == 1) {
                L3: {
                  if (this.field_p instanceof eg) {
                    var7 = (eg) ((Object) this.field_p);
                    var6 = var7.a(kc.field_b, (qa) (this), (byte) 80, param1, param0, ag.field_f);
                    if (0 != (var6 ^ -1)) {
                      L4: {
                        if (!this.field_R) {
                          break L4;
                        } else {
                          if (this.field_N <= var6) {
                            break L4;
                          } else {
                            if (this.field_K < var6) {
                              var6 = this.field_N;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      this.field_M = var6;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                this.field_Q = lj.a((byte) -81);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var5);
            stackOut_16_1 = new StringBuilder().append("c.I(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        int dupTemp$1 = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_34_0 = 0;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_57_0 = 0;
        Object stackOut_38_0 = null;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_41_0 = 0;
        Object stackOut_30_0 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        try {
          L0: {
            this.field_Q = lj.a((byte) -37);
            if (param0 == -2) {
              L1: {
                if (param3 == 60) {
                  break L1;
                } else {
                  if (62 == param3) {
                    break L1;
                  } else {
                    L2: {
                      if (param3 < 32) {
                        break L2;
                      } else {
                        if (126 < param3) {
                          break L2;
                        } else {
                          L3: {
                            if (this.field_K != this.field_M) {
                              this.c(false);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          L4: {
                            if (0 == (this.field_O ^ -1)) {
                              break L4;
                            } else {
                              if (this.field_i.length() < this.field_O) {
                                break L4;
                              } else {
                                return true;
                              }
                            }
                          }
                          L5: {
                            L6: {
                              if (this.field_M >= this.field_i.length()) {
                                break L6;
                              } else {
                                this.field_i = this.field_i.substring(0, this.field_M) + param3 + this.field_i.substring(this.field_M, this.field_i.length());
                                this.field_M = this.field_M + 1;
                                this.field_K = this.field_M;
                                if (!fleas.field_A) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            this.field_i = this.field_i + param3;
                            dupTemp$1 = this.field_i.length();
                            this.field_M = dupTemp$1;
                            this.field_K = dupTemp$1;
                            break L5;
                          }
                          this.i(-1);
                          stackOut_20_0 = 1;
                          stackIn_21_0 = stackOut_20_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                    L7: {
                      if (85 == param1) {
                        if (this.field_M == this.field_K) {
                          if (0 >= this.field_M) {
                            break L7;
                          } else {
                            this.field_K = -1 + this.field_M;
                            this.c(false);
                            stackOut_76_0 = 1;
                            stackIn_77_0 = stackOut_76_0;
                            decompiledRegionSelector0 = 15;
                            break L0;
                          }
                        } else {
                          this.c(false);
                          stackOut_73_0 = 1;
                          stackIn_74_0 = stackOut_73_0;
                          decompiledRegionSelector0 = 14;
                          break L0;
                        }
                      } else {
                        if (-102 == (param1 ^ -1)) {
                          if (this.field_M != this.field_K) {
                            this.c(false);
                            stackOut_70_0 = 1;
                            stackIn_71_0 = stackOut_70_0;
                            decompiledRegionSelector0 = 13;
                            break L0;
                          } else {
                            if (this.field_M < this.field_i.length()) {
                              this.field_K = this.field_M - -1;
                              this.c(false);
                              stackOut_68_0 = 1;
                              stackIn_69_0 = stackOut_68_0;
                              decompiledRegionSelector0 = 12;
                              break L0;
                            } else {
                              break L7;
                            }
                          }
                        } else {
                          if (-14 != (param1 ^ -1)) {
                            if ((param1 ^ -1) != -97) {
                              if (param1 != 97) {
                                if (102 == param1) {
                                  this.a(0, -47);
                                  stackOut_63_0 = 1;
                                  stackIn_64_0 = stackOut_63_0;
                                  decompiledRegionSelector0 = 11;
                                  break L0;
                                } else {
                                  if (103 == param1) {
                                    this.a(this.field_i.length(), -92);
                                    stackOut_61_0 = 1;
                                    stackIn_62_0 = stackOut_61_0;
                                    decompiledRegionSelector0 = 10;
                                    break L0;
                                  } else {
                                    if ((param1 ^ -1) == -85) {
                                      this.d((byte) 115);
                                      stackOut_59_0 = 1;
                                      stackIn_60_0 = stackOut_59_0;
                                      decompiledRegionSelector0 = 9;
                                      break L0;
                                    } else {
                                      L8: {
                                        if (!ei.field_H[82]) {
                                          break L8;
                                        } else {
                                          if (65 != param1) {
                                            break L8;
                                          } else {
                                            this.k(-14);
                                            stackOut_48_0 = 1;
                                            stackIn_49_0 = stackOut_48_0;
                                            decompiledRegionSelector0 = 6;
                                            break L0;
                                          }
                                        }
                                      }
                                      L9: {
                                        if (!ei.field_H[82]) {
                                          break L9;
                                        } else {
                                          if ((param1 ^ -1) != -67) {
                                            break L9;
                                          } else {
                                            this.q(105);
                                            stackOut_52_0 = 1;
                                            stackIn_53_0 = stackOut_52_0;
                                            decompiledRegionSelector0 = 7;
                                            break L0;
                                          }
                                        }
                                      }
                                      if (!ei.field_H[82]) {
                                        break L7;
                                      } else {
                                        if (param1 == 67) {
                                          this.n(-1);
                                          stackOut_57_0 = 1;
                                          stackIn_58_0 = stackOut_57_0;
                                          decompiledRegionSelector0 = 8;
                                          break L0;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (this.field_M < this.field_i.length()) {
                                  L10: {
                                    stackOut_38_0 = this;
                                    stackIn_40_0 = stackOut_38_0;
                                    stackIn_39_0 = stackOut_38_0;
                                    if (!ei.field_H[82]) {
                                      stackOut_40_0 = this;
                                      stackOut_40_1 = this.field_M - -1;
                                      stackIn_41_0 = stackOut_40_0;
                                      stackIn_41_1 = stackOut_40_1;
                                      break L10;
                                    } else {
                                      stackOut_39_0 = this;
                                      stackOut_39_1 = this.l(32);
                                      stackIn_41_0 = stackOut_39_0;
                                      stackIn_41_1 = stackOut_39_1;
                                      break L10;
                                    }
                                  }
                                  this.a(stackIn_41_1, -72);
                                  stackOut_41_0 = 1;
                                  stackIn_42_0 = stackOut_41_0;
                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                } else {
                                  break L7;
                                }
                              }
                            } else {
                              if (this.field_M > 0) {
                                L11: {
                                  stackOut_30_0 = this;
                                  stackIn_32_0 = stackOut_30_0;
                                  stackIn_31_0 = stackOut_30_0;
                                  if (ei.field_H[82]) {
                                    stackOut_32_0 = this;
                                    stackOut_32_1 = this.j(param0 ^ -100);
                                    stackIn_33_0 = stackOut_32_0;
                                    stackIn_33_1 = stackOut_32_1;
                                    break L11;
                                  } else {
                                    stackOut_31_0 = this;
                                    stackOut_31_1 = this.field_M + -1;
                                    stackIn_33_0 = stackOut_31_0;
                                    stackIn_33_1 = stackOut_31_1;
                                    break L11;
                                  }
                                }
                                this.a(stackIn_33_1, -127);
                                stackOut_33_0 = 1;
                                stackIn_34_0 = stackOut_33_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              } else {
                                break L7;
                              }
                            }
                          } else {
                            this.r(32);
                            stackOut_25_0 = 1;
                            stackIn_26_0 = stackOut_25_0;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                    }
                    stackOut_78_0 = 0;
                    stackIn_79_0 = stackOut_78_0;
                    decompiledRegionSelector0 = 16;
                    break L0;
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_80_0 = (RuntimeException) (var5);
            stackOut_80_1 = new StringBuilder().append("c.N(").append(param0).append(',').append(param1).append(',');
            stackIn_82_0 = stackOut_80_0;
            stackIn_82_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param2 == null) {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L12;
            } else {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "{...}";
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              stackIn_83_2 = stackOut_81_2;
              break L12;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_34_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_42_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_49_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_53_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_58_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_60_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_62_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_64_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_69_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_71_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_74_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_77_0 != 0;
                                      } else {
                                        return stackIn_79_0 != 0;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final int l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        char stackIn_9_0 = 0;
        char stackIn_10_0 = 0;
        char stackOut_8_0 = 0;
        var4 = fleas.field_A ? 1 : 0;
        var2 = this.field_i.length();
        if (var2 == this.field_M) {
          return this.field_M;
        } else {
          if (param0 == 32) {
            var3 = this.field_M - -1;
            L0: while (true) {
              if (var3 < var2) {
                stackOut_8_0 = this.field_i.charAt(var3 + -1);
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (var4 == 0) {
                  if (stackIn_10_0 == 32) {
                    return var3;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  return stackIn_9_0;
                }
              } else {
                return var3;
              }
            }
          } else {
            return -60;
          }
        }
    }

    static {
        field_S = 0;
    }
}
