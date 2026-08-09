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
            String var2;
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
        int var2;
        int var3;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        L0: {
          if (this.field_K != this.field_M) {
            L1: {
              if (this.field_M > this.field_K) {
                stackIn_5_0 = this.field_K;
                break L1;
              } else {
                stackIn_5_0 = this.field_M;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_5_0;
              if (this.field_M <= this.field_K) {
                stackIn_8_0 = this.field_K;
                break L2;
              } else {
                stackIn_8_0 = this.field_M;
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
        long var6;
        eg var9;
        Object var16;
        eg var16_ref;
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("c.QA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
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
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
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
                    stackIn_4_0 = this;

                    if (-1 == var8_int) {
                      stackIn_5_0 = this;
                      stackIn_5_1 = 0;
                      break L2;
                    } else {
                      stackIn_5_0 = this;
                      stackIn_5_1 = var8_int;
                      break L2;
                    }
                  }
                  L3: {
                    this.a(stackIn_5_1, -57);
                    var8_long = lj.a((byte) -93);
                    stackIn_7_0 = this;

                    if ((var8_long - this.field_L ^ -1L) <= -251L) {
                      stackIn_8_0 = this;
                      stackIn_8_1 = 0;
                      break L3;
                    } else {
                      stackIn_8_0 = this;
                      stackIn_8_1 = 1;
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
                  stackIn_16_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackIn_18_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var8);

            stackIn_21_1 = new StringBuilder().append("c.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
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
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
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
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.c(false);
                this.a(param0 + 1, var2);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
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
        ne var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        qa var9;
        eg var10;
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
              this.a(11, 11, (qa) null, '*');
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
        int var2;
        int var3;
        int stackIn_8_0 = 0;
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
              stackIn_8_0 = -33;

              if (var3 == 0) {
                L2: {
                  if (stackIn_8_0 == (this.field_i.charAt(var2 - 1) ^ -1)) {
                    break L2;
                  } else {
                    var2--;
                    if (var3 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                return var2;
              } else {
                return stackIn_8_0;
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
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
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
              dupTemp$2 = this.field_i.length();
              this.field_K = dupTemp$2;
              this.field_M = dupTemp$2;
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
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("c.PA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    private final void a(int param0, int param1) {
        int discarded$1 = 0;
        if (param1 > -27) {
          L0: {
            discarded$1 = this.j(-45);
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
        int var2;
        int var3;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        if (param0 != 0) {
          return (String) null;
        } else {
          L0: {
            if (this.field_M > this.field_K) {
              stackIn_4_0 = this.field_K;
              break L0;
            } else {
              stackIn_4_0 = this.field_M;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_4_0;
            if (this.field_M <= this.field_K) {
              stackIn_7_0 = this.field_K;
              break L1;
            } else {
              stackIn_7_0 = this.field_M;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return this.field_i.substring(var2, var3);
        }
    }

    final static void a(int param0, byte param1, int param2, dd[] param3, int param4, int param5, fa param6, dd[] param7, int param8, int param9, boolean param10, int param11) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("c.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param7 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), stackIn_12_2 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ')');
        }
    }

    void a(int param0, int param1, qa param2, byte param3) {
        int var6 = 0;
        eg var7 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("c.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_34_0 = 0;
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
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
                            dupTemp$0 = this.field_i.length();
                            this.field_M = dupTemp$0;
                            this.field_K = dupTemp$0;
                            break L5;
                          }
                          this.i(-1);
                          stackIn_21_0 = 1;
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
                            stackIn_77_0 = 1;
                            decompiledRegionSelector0 = 15;
                            break L0;
                          }
                        } else {
                          this.c(false);
                          stackIn_74_0 = 1;
                          decompiledRegionSelector0 = 14;
                          break L0;
                        }
                      } else {
                        if (-102 == (param1 ^ -1)) {
                          if (this.field_M != this.field_K) {
                            this.c(false);
                            stackIn_71_0 = 1;
                            decompiledRegionSelector0 = 13;
                            break L0;
                          } else {
                            if (this.field_M < this.field_i.length()) {
                              this.field_K = this.field_M - -1;
                              this.c(false);
                              stackIn_69_0 = 1;
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
                                  stackIn_64_0 = 1;
                                  decompiledRegionSelector0 = 11;
                                  break L0;
                                } else {
                                  if (103 == param1) {
                                    this.a(this.field_i.length(), -92);
                                    stackIn_62_0 = 1;
                                    decompiledRegionSelector0 = 10;
                                    break L0;
                                  } else {
                                    if ((param1 ^ -1) == -85) {
                                      this.d((byte) 115);
                                      stackIn_60_0 = 1;
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
                                            stackIn_49_0 = 1;
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
                                            stackIn_53_0 = 1;
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
                                          stackIn_58_0 = 1;
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
                                    stackIn_40_0 = this;

                                    if (!ei.field_H[82]) {
                                      stackIn_41_0 = this;
                                      stackIn_41_1 = this.field_M - -1;
                                      break L10;
                                    } else {
                                      stackIn_41_0 = this;
                                      stackIn_41_1 = this.l(32);
                                      break L10;
                                    }
                                  }
                                  this.a(stackIn_41_1, -72);
                                  stackIn_42_0 = 1;
                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                } else {
                                  break L7;
                                }
                              }
                            } else {
                              if (this.field_M > 0) {
                                L11: {
                                  stackIn_32_0 = this;

                                  if (ei.field_H[82]) {
                                    stackIn_33_0 = this;
                                    stackIn_33_1 = this.j(param0 ^ -100);
                                    break L11;
                                  } else {
                                    stackIn_33_0 = this;
                                    stackIn_33_1 = this.field_M + -1;
                                    break L11;
                                  }
                                }
                                this.a(stackIn_33_1, -127);
                                stackIn_34_0 = 1;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              } else {
                                break L7;
                              }
                            }
                          } else {
                            this.r(32);
                            stackIn_26_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                    }
                    stackIn_79_0 = 0;
                    decompiledRegionSelector0 = 16;
                    break L0;
                  }
                }
              }
              stackIn_7_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackIn_82_0 = (RuntimeException) (var5);

            stackIn_82_1 = new StringBuilder().append("c.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "null";
              break L12;
            } else {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "{...}";
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
        int var2;
        int var3;
        int var4;
        char stackIn_10_0 = 0;
        var4 = fleas.field_A ? 1 : 0;
        var2 = this.field_i.length();
        if (var2 == this.field_M) {
          return this.field_M;
        } else {
          if (param0 == 32) {
            var3 = this.field_M - -1;
            L0: while (true) {
              if (var3 < var2) {
                stackIn_10_0 = this.field_i.charAt(var3 + -1);

                if (var4 == 0) {
                  L1: {
                    if (stackIn_10_0 == 32) {
                      break L1;
                    } else {
                      var3++;
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  return var3;
                } else {
                  return stackIn_10_0;
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
