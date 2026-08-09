/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo extends ao implements ai {
    private int field_Q;
    private boolean field_K;
    private int field_C;
    private boolean field_A;
    private wp field_F;
    private wp field_M;
    private wp field_N;
    private int field_R;
    private jh field_H;
    static int field_I;
    private wp field_J;
    int field_G;
    private int field_O;
    private wp field_P;
    private boolean field_B;
    private int field_L;
    int field_D;
    int field_E;

    final void a(int param0, int param1) {
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == 0) {
          L0: {
            if (-1 < (param1 ^ -1)) {
              this.field_D = 0;
              break L0;
            } else {
              if (-65537 > (param1 ^ -1)) {
                this.field_D = 65536;
                break L0;
              } else {
                this.field_D = param1;
                break L0;
              }
            }
          }
          this.f(-1840);
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 106 / ((-25 - param0) / 52);
        this.b(param1, (byte) 122);
        if (this.field_o instanceof nc) {
            ((nc) ((Object) this.field_o)).a((vo) (this), -6772, this.field_D, this.field_G);
        }
    }

    final static long a(CharSequence param0, int param1) {
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_long = 0L;
            var4 = param0.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var5 >= var4) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var2_long = var2_long * 37L;
                      var6 = param0.charAt(var5);
                      if (-66 < (var6 ^ -1)) {
                        break L4;
                      } else {
                        if (90 < var6) {
                          break L4;
                        } else {
                          var2_long = var2_long + (long)(var6 + -64);
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (var6 < 97) {
                        break L5;
                      } else {
                        if (var6 > 122) {
                          break L5;
                        } else {
                          var2_long = var2_long + (long)(1 + (var6 - 97));
                          break L3;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L3;
                    } else {
                      if (var6 > 57) {
                        break L3;
                      } else {
                        var2_long = var2_long + (long)(-48 + (27 + var6));
                        break L3;
                      }
                    }
                  }
                  if (var2_long >= 177917621779460413L) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              L6: while (true) {
                L7: {
                  if (var2_long % 37L != 0L) {
                    break L7;
                  } else {
                    if (var2_long == 0L) {
                      break L7;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L6;
                    }
                  }
                }
                L8: {
                  if (param1 == 7441) {
                    break L8;
                  } else {
                    field_I = -23;
                    break L8;
                  }
                }
                stackIn_23_0 = var2_long;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("vo.AA(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        return stackIn_23_0;
    }

    final static bo a(boolean param0, byte[] param1) {
        bo var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        Object stackIn_2_0 = null;
        bo stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  var3 = (CharSequence) null;
                  vo.a((CharSequence) null, 104);
                  break L1;
                }
              }
              var2 = new bo(param1, er.field_h, av.field_C, vg.field_k, we.field_B, iv.field_l, ag.field_d);
              tl.a((byte) -60);
              stackIn_6_0 = (bo) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("vo.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bo) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    private final void b(int param0, byte param1) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        int var3 = -36 / ((param1 - 50) / 41);
        if (0 > param0) {
            this.field_G = 0;
        } else {
            if ((param0 ^ -1) >= -65537) {
                this.field_G = param0;
            } else {
                this.field_G = 65536;
            }
        }
        this.e((byte) 100);
    }

    private final void a(byte param0) {
        if (param0 != -121) {
            this.a(100, false);
        }
        int var2 = this.field_N == null ? this.field_P.field_r : this.field_N.field_r - -this.field_N.field_q;
        int var3 = null != this.field_J ? this.field_J.field_r - this.field_H.field_q : this.field_P.field_q + this.field_P.field_r - this.field_H.field_q;
        this.b(var3 > var2 ? (this.field_H.field_r + -var2 << 1984602960) / (var3 + -var2) : 0, (byte) -6);
    }

    final static ki b(int param0, int param1) {
        ki stackIn_7_0 = null;
        if (param1 == -1) {
          L0: {
            L1: {
              if (ha.field_g != null) {
                break L1;
              } else {
                if (param0 != -1) {
                  stackIn_7_0 = ng.a(1, -117, true, param0, false, true);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_7_0 = ha.field_g;
            break L0;
          }
          return stackIn_7_0;
        } else {
          return (ki) null;
        }
    }

    private final void a(int param0, byte param1) {
        this.a(0, param0);
        if (param1 != -125) {
            return;
        }
        if (this.field_o instanceof nc) {
            ((nc) ((Object) this.field_o)).a((vo) (this), -6772, this.field_D, this.field_D);
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 < -1) {
              L1: {
                L2: {
                  if (param1 <= 0) {
                    break L2;
                  } else {
                    if (128 > param1) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (param1 < 160) {
                    break L3;
                  } else {
                    if (255 >= param1) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                if (param1 != 0) {
                  var6 = uk.field_lb;
                  var2 = var6;
                  var3 = 0;
                  L4: while (true) {
                    if (var6.length <= var3) {
                      stackIn_22_0 = 0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var4 = var6[var3];
                      if (param1 == var4) {
                        stackIn_19_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
              stackIn_11_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2_ref), "vo.V(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              return stackIn_22_0 != 0;
            }
          }
        }
    }

    final boolean a(pk param0, byte param1) {
        jh var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 61) {
                break L1;
              } else {
                this.b(-73, (byte) 11);
                break L1;
              }
            }
            var3 = this.field_H;
            if (var3 == null) {
              stackIn_8_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (((pk) ((Object) var3)).a(param0, (byte) 61)) {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("vo.Q(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        int var7 = 0;
        byte[] var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 710) {
                break L1;
              } else {
                var8 = (byte[]) null;
                vo.a(true, (byte[]) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (-2 != (param0 ^ -1)) {
                  break L3;
                } else {
                  if (this.field_B) {
                    L4: {
                      if (!this.field_K) {
                        break L4;
                      } else {
                        if (this.field_F != param2) {
                          break L4;
                        } else {
                          this.a(-this.field_E + this.field_D, (byte) -125);
                          break L2;
                        }
                      }
                    }
                    L5: {
                      if (!this.field_K) {
                        break L5;
                      } else {
                        if (param2 != this.field_M) {
                          break L5;
                        } else {
                          this.a(this.field_E + this.field_D, (byte) -125);
                          break L2;
                        }
                      }
                    }
                    L6: {
                      if (!this.field_A) {
                        break L6;
                      } else {
                        if (param2 == this.field_N) {
                          this.a((byte) -78, this.field_G + -this.field_Q);
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (!this.field_A) {
                      break L3;
                    } else {
                      if (this.field_J != param2) {
                        break L3;
                      } else {
                        this.a((byte) 48, this.field_Q + this.field_G);
                        break L2;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("vo.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void g(int param0) {
        int var2 = this.field_F != null ? this.field_F.field_v - -this.field_F.field_p : this.field_P.field_v;
        int var3 = null != this.field_M ? this.field_M.field_v + -this.field_H.field_p : -this.field_H.field_p + this.field_P.field_v + this.field_P.field_p;
        this.a(0, var3 <= var2 ? 0 : (this.field_H.field_v + -var2 << -2066408880) / (-var2 + var3));
        if (param0 != -2066408880) {
            this.field_H = (jh) null;
        }
    }

    private final void a(boolean param0, int param1) {
        wp stackIn_3_0 = null;
        wp stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        wp stackIn_9_0 = null;
        wp stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        wp stackIn_17_0 = null;
        wp stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        wp stackIn_23_0 = null;
        wp stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        L0: {
          L1: {
            stackIn_3_0 = this.field_P;

            if (param0) {
              break L1;
            } else {


              if (!this.field_K) {
                stackIn_5_0 = (wp) ((Object) stackIn_3_0);
                stackIn_5_1 = 0;
                break L0;
              } else {
                stackIn_3_0 = (wp) ((Object) stackIn_3_0);
                break L1;
              }
            }
          }
          stackIn_5_0 = (wp) ((Object) stackIn_3_0);
          stackIn_5_1 = 1;
          break L0;
        }
        L2: {
          stackIn_5_0.field_x = stackIn_5_1 != 0;
          if (!(this.field_H.field_y instanceof wp)) {
            break L2;
          } else {
            L3: {
              L4: {
                stackIn_9_0 = (wp) ((Object) this.field_H.field_y);

                if (param0) {
                  break L4;
                } else {


                  if (!this.field_K) {
                    stackIn_11_0 = (wp) ((Object) stackIn_9_0);
                    stackIn_11_1 = 0;
                    break L3;
                  } else {
                    stackIn_9_0 = (wp) ((Object) stackIn_9_0);
                    break L4;
                  }
                }
              }
              stackIn_11_0 = (wp) ((Object) stackIn_9_0);
              stackIn_11_1 = 1;
              break L3;
            }
            stackIn_11_0.field_x = stackIn_11_1 != 0;
            break L2;
          }
        }
        L5: {
          if (param1 <= -126) {
            break L5;
          } else {
            this.field_O = -95;
            break L5;
          }
        }
        L6: {
          if (this.field_N == null) {
            break L6;
          } else {
            L7: {
              stackIn_17_0 = this.field_N;

              if (!param0) {
                stackIn_18_0 = (wp) ((Object) stackIn_17_0);
                stackIn_18_1 = 0;
                break L7;
              } else {
                stackIn_18_0 = (wp) ((Object) stackIn_17_0);
                stackIn_18_1 = 1;
                break L7;
              }
            }
            stackIn_18_0.field_x = stackIn_18_1 != 0;
            break L6;
          }
        }
        L8: {
          if (null != this.field_J) {
            L9: {
              stackIn_23_0 = this.field_J;

              if (!param0) {
                stackIn_24_0 = (wp) ((Object) stackIn_23_0);
                stackIn_24_1 = 0;
                break L9;
              } else {
                stackIn_24_0 = (wp) ((Object) stackIn_23_0);
                stackIn_24_1 = 1;
                break L9;
              }
            }
            stackIn_24_0.field_x = stackIn_24_1 != 0;
            break L8;
          } else {
            break L8;
          }
        }
    }

    final void a(int param0, int param1, pk param2, int param3) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, -123, param2, param3);
                var5_int = 4 / ((param1 - -25) / 45);
                if (!(this.field_H.field_y instanceof wp)) {
                  break L2;
                } else {
                  if (!((wp) ((Object) this.field_H.field_y)).field_x) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-2 == (this.field_H.field_l ^ -1)) {
                L3: {
                  if (!this.field_A) {
                    this.e((byte) 110);
                    break L3;
                  } else {
                    var6 = this.field_G;
                    this.a((byte) -121);
                    if (var6 == this.field_G) {
                      break L3;
                    } else {
                      if (!(this.field_o instanceof nc)) {
                        break L3;
                      } else {
                        ((nc) ((Object) this.field_o)).a(this.field_G, this.field_G, (vo) (this), false);
                        break L3;
                      }
                    }
                  }
                }
                if (!this.field_K) {
                  this.f(-1840);
                  break L1;
                } else {
                  var6 = this.field_D;
                  this.g(-2066408880);
                  if (this.field_D == var6) {
                    break L1;
                  } else {
                    if (!(this.field_o instanceof nc)) {
                      break L1;
                    } else {
                      ((nc) ((Object) this.field_o)).a(this.field_D, this.field_G, (vo) (this), false);
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (!this.field_P.field_x) {
                break L4;
              } else {
                if (this.field_P.field_B == 1) {
                  if (this.field_K) {
                    if (!this.field_A) {
                      if ((this.field_H.field_p >> 751265217) + param3 - -this.field_H.field_v < pi.field_e) {
                        this.a(this.field_O + this.field_D, (byte) -125);
                        break L4;
                      } else {
                        this.a(this.field_D + -this.field_O, (byte) -125);
                        break L4;
                      }
                    } else {
                      var6 = -(this.field_H.field_q >> 990352385) + (-this.field_H.field_r + -this.field_r + -param0 + ko.field_p);
                      var7 = -param3 + (pi.field_e - this.field_v) - (this.field_H.field_v - -(this.field_H.field_p >> 1781112321));
                      if (Math.abs(var7) > Math.abs(var6)) {
                        if (-1 > (var7 ^ -1)) {
                          this.a(this.field_O + this.field_D, (byte) -125);
                          break L4;
                        } else {
                          this.a(this.field_D + -this.field_O, (byte) -125);
                          break L4;
                        }
                      } else {
                        if (var6 <= 0) {
                          this.a((byte) -109, -this.field_C + this.field_G);
                          break L4;
                        } else {
                          this.a((byte) 27, this.field_C + this.field_G);
                          break L4;
                        }
                      }
                    }
                  } else {
                    if (this.field_A) {
                      if (ko.field_p <= this.field_H.field_r + param0 - -(this.field_H.field_q >> -9263039)) {
                        this.a((byte) 116, this.field_G + -this.field_C);
                        break L4;
                      } else {
                        this.a((byte) -79, this.field_G - -this.field_C);
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                } else {
                  break L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var5);

            stackIn_41_1 = new StringBuilder().append("vo.U(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L5;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param3 + ')');
        }
    }

    private final void e(byte param0) {
        int var2 = null == this.field_N ? this.field_P.field_r : this.field_N.field_r + this.field_N.field_q;
        if (param0 <= 89) {
            return;
        }
        int var3 = null == this.field_J ? this.field_P.field_r - -this.field_P.field_q + -this.field_H.field_q : this.field_J.field_r + -this.field_H.field_q;
        this.field_H.field_r = ((-var2 + var3) * this.field_G >> 1769537168) + var2;
    }

    final void b(int param0, int param1, int param2) {
        int var5 = 0;
        int var4 = 34 % ((59 - param2) / 45);
        if (param0 >= param1) {
            this.field_H.a(91, this.field_H.field_r, this.field_H.field_v, this.field_H.field_p, this.field_P.field_q);
            this.a(false, -127);
        } else {
            var5 = param0 * this.field_P.field_q / param1;
            if (!(var5 >= this.field_L)) {
                var5 = this.field_L;
            }
            this.field_H.a(106, this.field_H.field_r, this.field_H.field_v, this.field_H.field_p, var5);
            this.a(true, -127);
        }
        this.e((byte) 100);
    }

    private final void a(int param0, boolean param1) {
        wp stackIn_3_0 = null;
        wp stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        wp stackIn_12_0 = null;
        wp stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        wp stackIn_18_0 = null;
        wp stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        wp stackIn_23_0 = null;
        wp stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        L0: {
          L1: {
            stackIn_3_0 = this.field_P;

            if (param1) {
              break L1;
            } else {


              if (!this.field_A) {
                stackIn_5_0 = (wp) ((Object) stackIn_3_0);
                stackIn_5_1 = 0;
                break L0;
              } else {
                stackIn_3_0 = (wp) ((Object) stackIn_3_0);
                break L1;
              }
            }
          }
          stackIn_5_0 = (wp) ((Object) stackIn_3_0);
          stackIn_5_1 = 1;
          break L0;
        }
        stackIn_5_0.field_x = stackIn_5_1 != 0;
        if (param0 == 8206) {
          L2: {
            if (this.field_H.field_y instanceof wp) {
              L3: {
                L4: {
                  stackIn_12_0 = (wp) ((Object) this.field_H.field_y);

                  if (param1) {
                    break L4;
                  } else {


                    if (!this.field_A) {
                      stackIn_14_0 = (wp) ((Object) stackIn_12_0);
                      stackIn_14_1 = 0;
                      break L3;
                    } else {
                      stackIn_12_0 = (wp) ((Object) stackIn_12_0);
                      break L4;
                    }
                  }
                }
                stackIn_14_0 = (wp) ((Object) stackIn_12_0);
                stackIn_14_1 = 1;
                break L3;
              }
              stackIn_14_0.field_x = stackIn_14_1 != 0;
              break L2;
            } else {
              break L2;
            }
          }
          L5: {
            if (null == this.field_F) {
              break L5;
            } else {
              L6: {
                stackIn_18_0 = this.field_F;

                if (!param1) {
                  stackIn_19_0 = (wp) ((Object) stackIn_18_0);
                  stackIn_19_1 = 0;
                  break L6;
                } else {
                  stackIn_19_0 = (wp) ((Object) stackIn_18_0);
                  stackIn_19_1 = 1;
                  break L6;
                }
              }
              stackIn_19_0.field_x = stackIn_19_1 != 0;
              break L5;
            }
          }
          L7: {
            if (null == this.field_M) {
              break L7;
            } else {
              L8: {
                stackIn_23_0 = this.field_M;

                if (!param1) {
                  stackIn_24_0 = (wp) ((Object) stackIn_23_0);
                  stackIn_24_1 = 0;
                  break L8;
                } else {
                  stackIn_24_0 = (wp) ((Object) stackIn_23_0);
                  stackIn_24_1 = 1;
                  break L8;
                }
              }
              stackIn_24_0.field_x = stackIn_24_1 != 0;
              break L7;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void f(int param0) {
        int var2 = null == this.field_F ? this.field_P.field_v : this.field_F.field_v + this.field_F.field_p;
        int var3 = this.field_M != null ? -this.field_H.field_p + this.field_M.field_v : -this.field_H.field_p + (this.field_P.field_p + this.field_P.field_v);
        this.field_H.field_v = ((-var2 + var3) * this.field_D >> 1413961040) + var2;
        if (param0 != -1840) {
            this.field_P = (wp) null;
        }
    }

    final void e(boolean param0) {
        int var3;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (this.field_N != null) {
            this.field_N.field_v = -this.field_N.field_p + this.field_p >> -1835926495;
            this.field_N.field_r = 0;
            this.field_P.field_r = this.field_N.field_q + this.field_N.field_r;
            break L0;
          } else {
            this.field_P.field_r = 0;
            break L0;
          }
        }
        L1: {
          if (null == this.field_J) {
            this.field_P.field_q = this.field_q - this.field_P.field_r;
            break L1;
          } else {
            this.field_J.field_r = this.field_q + -this.field_J.field_q;
            this.field_J.field_v = this.field_p - this.field_J.field_p >> -286223071;
            this.field_P.field_q = this.field_q + (-this.field_P.field_r + -this.field_J.field_q);
            break L1;
          }
        }
        L2: {
          this.e((byte) 125);
          if (this.field_F != null) {
            this.field_F.field_v = 0;
            this.field_F.field_r = -this.field_F.field_q + this.field_q >> -2087720351;
            this.field_P.field_v = this.field_F.field_p + this.field_F.field_v;
            break L2;
          } else {
            this.field_P.field_v = 0;
            break L2;
          }
        }
        L3: {
          if (this.field_M == null) {
            this.field_P.field_p = -this.field_P.field_v + this.field_p;
            break L3;
          } else {
            this.field_M.field_v = -this.field_M.field_p + this.field_p;
            this.field_M.field_r = -this.field_M.field_q + this.field_q >> -495632863;
            this.field_P.field_p = -this.field_M.field_p + (-this.field_P.field_v + this.field_p);
            break L3;
          }
        }
        L4: {
          this.f(-1840);
          if (!this.field_K) {
            this.field_H.field_v = 0;
            this.field_H.field_p = this.field_P.field_p;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (this.field_A) {
            break L5;
          } else {
            this.field_H.field_r = 0;
            this.field_H.field_q = this.field_P.field_q;
            break L5;
          }
        }
        this.field_H.c(param0);
    }

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        if (param2 < param1) {
            var4 = param2 * this.field_P.field_p / param1;
            if (!(var4 >= this.field_R)) {
                var4 = this.field_R;
            }
            this.field_H.a(-95, this.field_H.field_r, this.field_H.field_v, var4, this.field_H.field_q);
            this.a(8206, true);
        } else {
            this.field_H.a(-49, this.field_H.field_r, this.field_H.field_v, this.field_P.field_p, this.field_H.field_q);
            this.a(8206, false);
        }
        this.f(-1840);
        if (param0 < 2) {
            this.e((byte) 53);
        }
    }

    vo(int param0, int param1, int param2, int param3, mh param4, mh param5, mh param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        jh dupTemp$0 = null;
        wp dupTemp$1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var16 = null;
        this.field_Q = 1024;
        this.field_R = 0;
        this.field_O = 8192;
        this.field_L = 0;
        this.field_B = true;
        this.field_E = 1024;
        this.field_D = 32768;
        this.field_C = 8192;
        this.field_G = 32768;
        try {
          L0: {
            L1: {
              this.field_x = new pk[6];
              dupTemp$0 = new jh(param0, param1, param7, param8, (mh) null, (qm) null, new wp(0, 0, param7, param8, param6, (qm) null), false, false);
              this.field_H = dupTemp$0;
              this.field_x[0] = (pk) ((Object) dupTemp$0);
              dupTemp$1 = new wp(param0, param1, param7, param8, param5, (qm) null);
              this.field_P = dupTemp$1;
              this.field_x[1] = (pk) ((Object) dupTemp$1);
              this.field_L = param9;
              this.field_R = param10;
              stackIn_3_0 = this;

              if (!param12) {
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
              ((vo) (this)).field_K = stackIn_4_1 != 0;
              stackIn_6_0 = this;

              if (!param11) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            ((vo) (this)).field_A = stackIn_7_1 != 0;
            this.b(param13, (byte) 7);
            this.a(0, param14);
            this.a(96, param0, param1, param3, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var16 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var16);

            stackIn_11_1 = new StringBuilder().append("vo.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param5 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param6 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    private final int h(int param0) {
        int var2 = 57 % ((param0 - -47) / 43);
        return (this.field_H.field_p << -897472048) / this.field_P.field_p;
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (super.a(param0, param1, (byte) 27, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!this.field_B) {
                  break L1;
                } else {
                  if (this.field_H.d(-1)) {
                    if (-99 == (param3 ^ -1)) {
                      this.a(this.field_D - this.field_E, (byte) -125);
                      stackIn_43_0 = 1;
                      decompiledRegionSelector0 = 10;
                      break L0;
                    } else {
                      if ((param3 ^ -1) == -100) {
                        this.a(this.field_E + this.field_D, (byte) -125);
                        stackIn_41_0 = 1;
                        decompiledRegionSelector0 = 9;
                        break L0;
                      } else {
                        if (-97 != (param3 ^ -1)) {
                          if (param3 != 97) {
                            if (-105 == (param3 ^ -1)) {
                              this.a(this.field_D + -this.h(123), (byte) -125);
                              stackIn_39_0 = 1;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              if ((param3 ^ -1) != -106) {
                                if ((param3 ^ -1) == -103) {
                                  L2: {
                                    if (!this.field_K) {
                                      break L2;
                                    } else {
                                      if (hw.field_b[82]) {
                                        this.a(0, (byte) -125);
                                        stackIn_37_0 = 1;
                                        decompiledRegionSelector0 = 7;
                                        break L0;
                                      } else {
                                        break L2;
                                      }
                                    }
                                  }
                                  if (this.field_A) {
                                    this.a((byte) 123, 0);
                                    stackIn_35_0 = 1;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  if (103 != param3) {
                                    break L1;
                                  } else {
                                    L3: {
                                      if (!this.field_K) {
                                        break L3;
                                      } else {
                                        if (!hw.field_b[82]) {
                                          break L3;
                                        } else {
                                          this.a(65536, (byte) -125);
                                          stackIn_24_0 = 1;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        }
                                      }
                                    }
                                    if (this.field_A) {
                                      this.a((byte) 123, 65536);
                                      stackIn_28_0 = 1;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      break L1;
                                    }
                                  }
                                }
                              } else {
                                this.a(this.field_D + this.h(-111), (byte) -125);
                                stackIn_18_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          } else {
                            this.a((byte) -122, this.field_G - -this.field_Q);
                            stackIn_14_0 = 1;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        } else {
                          this.a((byte) -124, -this.field_Q + this.field_G);
                          stackIn_11_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L4: {
                if (param2 > 9) {
                  break L4;
                } else {
                  this.a(true, 89);
                  break L4;
                }
              }
              stackIn_47_0 = 0;
              decompiledRegionSelector0 = 11;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_50_0 = (RuntimeException) (var5);

            stackIn_50_1 = new StringBuilder().append("vo.KA(");

            if (param0 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L5;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_24_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_28_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_35_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_37_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_39_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_41_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_43_0 != 0;
                            } else {
                              return stackIn_47_0 != 0;
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

    static {
        field_I = -1;
    }
}
