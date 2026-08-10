/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends in {
    static String field_t;
    private int[] field_w;
    private int[] field_q;
    static int field_l;
    static String field_G;
    private i field_x;
    private int field_r;
    private sc field_B;
    static String field_z;
    private sc field_E;
    static String field_p;
    private int field_v;
    private sc field_u;
    private int field_k;
    private i field_A;
    static String field_s;
    private int field_C;
    private boolean field_n;
    private boolean field_o;
    private i field_m;
    static int field_y;
    static String field_F;

    final static km d(int param0) {
        if (param0 != 1048576) {
            return (km) null;
        }
        return hj.c(112);
    }

    final static void a(int param0, int param1, boolean param2) {
        dj var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        gh var3 = gk.a((byte) -100, param0, param2);
        if (param1 > -16) {
            field_G = (String) null;
        }
        if (var3 != null) {
            md.field_e.a(false, (byte) -99);
            var4 = md.field_e;
            var5_ref_String = hm.field_a;
            var4.field_a.a(1, var5_ref_String, 5);
            var4 = md.field_e;
            var5 = ii.field_b;
            var6 = a.field_y;
            var4.field_a.a(0, 0, 0, var5, var6);
        }
        qm.a(param0, param2, (byte) 115);
    }

    private final void a(int param0, byte param1, int param2, i param3) {
        try {
            param3.a(param0, true, -1);
            param3.c(-128, param2);
            if (param1 > -85) {
                eg.b((byte) -72);
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "eg.N(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 <= 68) {
            field_F = (String) null;
        }
        this.field_C = param1;
    }

    final static mg a(int param0, byte param1, int param2) {
        mg var3;
        int var4;
        int var5;
        mg var6;
        var5 = Virogrid.field_F ? 1 : 0;
        var6 = new mg(param0, param0);
        var3 = var6;
        var4 = 0;
        if (param1 <= 13) {
          return (mg) null;
        } else {
          L0: while (true) {
            if (var3.field_B.length <= var4) {
              return var3;
            } else {
              var6.field_B[var4] = param2;
              var4++;
              continue L0;
            }
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int stackIn_32_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_60_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (-1 <= (this.field_C ^ -1)) {
              this.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_n) {
                  L2: {
                    if (-1 <= (this.field_r ^ -1)) {
                      break L2;
                    } else {
                      if (this.field_A.d(115)) {
                        break L2;
                      } else {
                        this.field_B = null;
                        this.field_n = false;
                        this.field_r = -this.field_r;
                        break L1;
                      }
                    }
                  }
                  if ((this.field_r ^ -1) <= -1) {
                    break L1;
                  } else {
                    if (this.field_x.d(111)) {
                      break L1;
                    } else {
                      this.field_r = -this.field_r;
                      this.field_u = null;
                      this.field_n = false;
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = (this.field_k >> -1187872660) * this.field_C / 256;
                var5 = -var4_int + this.field_C;
                if (this.field_r != 0) {
                  this.field_k = this.field_k + this.field_r * param2;
                  if (1048576 > this.field_k) {
                    if (-1 > (this.field_k ^ -1)) {
                      break L3;
                    } else {
                      this.field_k = 0;
                      if (this.field_n) {
                        break L3;
                      } else {
                        this.field_r = 0;
                        if (!this.field_o) {
                          L4: {
                            if (null != this.field_B) {
                              this.field_A.c(false);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          this.field_B = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  } else {
                    this.field_k = 1048576;
                    if (this.field_n) {
                      break L3;
                    } else {
                      this.field_r = 0;
                      if (this.field_o) {
                        break L3;
                      } else {
                        L5: {
                          if (this.field_u == null) {
                            break L5;
                          } else {
                            this.field_x.c(false);
                            break L5;
                          }
                        }
                        this.field_u = null;
                        break L3;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (!ua.field_q) {
                  stackIn_32_0 = param2;
                  break L6;
                } else {
                  stackIn_32_0 = param2 << 789208193;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_32_0;
                if (this.field_v >= 256) {
                  break L7;
                } else {
                  L8: {
                    if (this.field_B != null) {
                      break L8;
                    } else {
                      if (this.field_u != null) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (-257 != (var4_int ^ -1)) {
                    if (256 != var5) {
                      L9: {
                        L10: {
                          if (null == this.field_w) {
                            break L10;
                          } else {
                            if (this.field_w.length < var6) {
                              break L10;
                            } else {
                              ek.a(this.field_w, 0, var6);
                              ek.a(this.field_q, 0, var6);
                              break L9;
                            }
                          }
                        }
                        this.field_q = new int[var6];
                        this.field_w = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_A.b(this.field_w, 0, param2);
                        this.field_x.b(this.field_q, 0, param2);
                        if (!ua.field_q) {
                          stackIn_47_0 = param1;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackIn_47_0 = param1 << 1;
                          break L11;
                        }
                      }
                      var7 = stackIn_47_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var7 + var8] = param0[var7 + var8] + (var5 * this.field_q[var8] + var4_int * this.field_w[var8] >> 177966184);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      this.field_x.b(param0, param1, param2);
                      break L7;
                    }
                  } else {
                    this.field_A.b(param0, param1, param2);
                    break L7;
                  }
                }
              }
              L13: {
                if (this.field_E == null) {
                  break L13;
                } else {
                  if (this.field_v == 0) {
                    break L13;
                  } else {
                    L14: {
                      L15: {
                        if (this.field_w == null) {
                          break L15;
                        } else {
                          if (this.field_w.length >= var6) {
                            ek.a(this.field_w, 0, var6);
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      this.field_q = new int[var6];
                      this.field_w = new int[var6];
                      break L14;
                    }
                    L16: {
                      this.field_m.b(this.field_w, 0, param2);
                      if (!ua.field_q) {
                        stackIn_60_0 = param1;
                        break L16;
                      } else {
                        param1 = param1 << 1;
                        stackIn_60_0 = param1 << 1;
                        break L16;
                      }
                    }
                    var7 = stackIn_60_0;
                    var8 = this.field_v * this.field_C / 256;
                    var9 = -var8 + this.field_C;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        break L13;
                      } else {
                        param0[var7 - -var10] = param0[var7 + var10] * var9 - -(var8 * this.field_w[var10]) >> 391405160;
                        var10++;
                        continue L17;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackIn_66_0 = (RuntimeException) (var4);

            stackIn_66_1 = new StringBuilder().append("eg.A(");

            if (param0 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L18;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L18;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_67_0), stackIn_67_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(byte param0) {
        if (param0 != 47) {
            return true;
        }
        return rk.field_f;
    }

    final in b() {
        return null;
    }

    final in c() {
        return null;
    }

    final synchronized int d() {
        return 2;
    }

    final static wf a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            int var4_int = 0;
            RuntimeException var4 = null;
            Class var5 = null;
            Throwable var5_ref = null;
            wf var6 = null;
            gd var6_ref = null;
            wf stackIn_2_0 = null;
            gd stackIn_4_0 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var4_int = -32 % ((param3 - -6) / 37);
                try {
                  L1: {
                    var5 = Class.forName("n");
                    var6 = (wf) (var5.newInstance());
                    var6.a(param2, param1, (byte) -56, param0);
                    stackIn_2_0 = (wf) (var6);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var5_ref = decompiledCaughtException;
                  var6_ref = new gd();
                  ((wf) ((Object) var6_ref)).a(param2, param1, (byte) -66, param0);
                  stackIn_4_0 = (gd) (var6_ref);
                  return (wf) ((Object) stackIn_4_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_7_0 = (RuntimeException) (var4);

                stackIn_7_1 = new StringBuilder().append("eg.F(");

                if (param0 == null) {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "null";
                  break L2;
                } else {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "{...}";
                  break L2;
                }
              }
              throw kg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
            }
            return stackIn_2_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        field_t = null;
        field_G = null;
        if (param0 >= -43) {
            return;
        }
        field_z = null;
        field_s = null;
        field_F = null;
        field_p = null;
    }

    final synchronized void a(sc param0, int param1, int param2, boolean param3, int param4, int param5) {
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_33_0 = 0;
        i stackIn_41_0 = null;
        i stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        i stackIn_51_0 = null;
        i stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_n) {
                break L1;
              } else {
                if (!param3) {
                  break L1;
                } else {
                  L2: {
                    if ((this.field_r ^ -1) >= -1) {
                      L3: {
                        if (this.field_u != null) {
                          this.field_x.c(false);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.field_u = param0;
                      if (param0 != null) {
                        this.field_x.a(false, 37, param0);
                        this.a(param1, (byte) -108, param4, this.field_x);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (this.field_B == null) {
                          break L4;
                        } else {
                          this.field_A.c(false);
                          break L4;
                        }
                      }
                      this.field_B = param0;
                      if (param0 != null) {
                        this.field_A.a(false, 37, param0);
                        this.a(param1, (byte) -107, param4, this.field_A);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L5: {
              stackIn_18_0 = this;

              if (!param3) {
                stackIn_19_0 = this;
                stackIn_19_1 = 0;
                break L5;
              } else {
                stackIn_19_0 = this;
                stackIn_19_1 = 1;
                break L5;
              }
            }
            ((eg) (this)).field_n = stackIn_19_1 != 0;
            if (param5 > 119) {
              if (this.field_B == param0) {
                this.field_r = param2;
                this.a(param1, (byte) -116, param4, this.field_A);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if (param0 != this.field_u) {
                  L6: {
                    if (null != this.field_B) {
                      if (null == this.field_u) {
                        var7_int = 0;
                        break L6;
                      } else {
                        L7: {
                          if ((this.field_k ^ -1) <= -524289) {
                            stackIn_33_0 = 0;
                            break L7;
                          } else {
                            stackIn_33_0 = 1;
                            break L7;
                          }
                        }
                        var7_int = stackIn_33_0;
                        break L6;
                      }
                    } else {
                      var7_int = 1;
                      break L6;
                    }
                  }
                  L8: {
                    if (var7_int != 0) {
                      L9: {
                        if (null != this.field_B) {
                          this.field_A.c(false);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        this.field_B = param0;
                        if (param0 != null) {
                          L11: {
                            stackIn_51_0 = this.field_A;

                            if (param3) {
                              stackIn_52_0 = (i) ((Object) stackIn_51_0);
                              stackIn_52_1 = 0;
                              break L11;
                            } else {
                              stackIn_52_0 = (i) ((Object) stackIn_51_0);
                              stackIn_52_1 = 1;
                              break L11;
                            }
                          }
                          ((i) (Object) stackIn_52_0).a(stackIn_52_1 != 0, 37, param0);
                          this.a(param1, (byte) -86, param4, this.field_A);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      this.field_r = param2;
                      break L8;
                    } else {
                      L12: {
                        if (null == this.field_u) {
                          break L12;
                        } else {
                          this.field_x.c(false);
                          break L12;
                        }
                      }
                      L13: {
                        this.field_u = param0;
                        if (param0 == null) {
                          break L13;
                        } else {
                          L14: {
                            stackIn_41_0 = this.field_x;

                            if (param3) {
                              stackIn_42_0 = (i) ((Object) stackIn_41_0);
                              stackIn_42_1 = 0;
                              break L14;
                            } else {
                              stackIn_42_0 = (i) ((Object) stackIn_41_0);
                              stackIn_42_1 = 1;
                              break L14;
                            }
                          }
                          ((i) (Object) stackIn_42_0).a(stackIn_42_1 != 0, 37, param0);
                          this.a(param1, (byte) -124, param4, this.field_x);
                          break L13;
                        }
                      }
                      this.field_r = -param2;
                      break L8;
                    }
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  this.field_r = -param2;
                  this.a(param1, (byte) -93, param4, this.field_x);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackIn_57_0 = (RuntimeException) (var7);

            stackIn_57_1 = new StringBuilder().append("eg.Q(");

            if (param0 == null) {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "null";
              break L15;
            } else {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "{...}";
              break L15;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final static boolean b(byte param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 <= -53) {
            break L0;
          } else {
            field_l = -55;
            break L0;
          }
        }
        L1: {
          L2: {
            if (j.field_l < 10) {
              break L2;
            } else {
              if (oi.field_d) {
                break L2;
              } else {
                if (wl.b((byte) -119)) {
                  break L2;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
            }
          }
          stackIn_7_0 = 0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final synchronized void a(int param0) {
        int var3;
        L0: {
          var3 = Virogrid.field_F ? 1 : 0;
          if (-1 > (this.field_k ^ -1)) {
            if (this.field_B != null) {
              this.field_A.a(param0);
              if (1048576 <= this.field_k) {
                break L0;
              } else {
                if (null == this.field_u) {
                  break L0;
                } else {
                  this.field_x.a(param0);
                  break L0;
                }
              }
            } else {
              if (1048576 <= this.field_k) {
                break L0;
              } else {
                if (null == this.field_u) {
                  break L0;
                } else {
                  this.field_x.a(param0);
                  break L0;
                }
              }
            }
          } else {
            if (1048576 <= this.field_k) {
              break L0;
            } else {
              if (null == this.field_u) {
                break L0;
              } else {
                this.field_x.a(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (0 >= this.field_v) {
            break L1;
          } else {
            if (null != this.field_E) {
              this.field_m.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (!this.field_n) {
            break L2;
          } else {
            L3: {
              if (0 >= this.field_r) {
                break L3;
              } else {
                if (!this.field_A.d(121)) {
                  this.field_r = -this.field_r;
                  this.field_B = null;
                  this.field_n = false;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (this.field_r >= 0) {
              break L2;
            } else {
              if (!this.field_x.d(122)) {
                this.field_n = false;
                this.field_r = -this.field_r;
                this.field_u = null;
                break L2;
              } else {
                break L2;
              }
            }
          }
        }
        L4: {
          if (-1 == (this.field_r ^ -1)) {
            break L4;
          } else {
            L5: {
              this.field_k = this.field_k + param0 * this.field_r;
              if (1048576 <= this.field_k) {
                this.field_k = 1048576;
                if (this.field_n) {
                  break L5;
                } else {
                  this.field_r = 0;
                  if (!this.field_o) {
                    L6: {
                      if (this.field_u == null) {
                        break L6;
                      } else {
                        this.field_x.c(false);
                        break L6;
                      }
                    }
                    this.field_u = null;
                    break L5;
                  } else {
                    break L4;
                  }
                }
              } else {
                if (-1 <= (this.field_k ^ -1)) {
                  this.field_k = 0;
                  if (!this.field_n) {
                    this.field_r = 0;
                    if (this.field_o) {
                      break L5;
                    } else {
                      L7: {
                        if (this.field_B != null) {
                          this.field_A.c(false);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      this.field_B = null;
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            }
            break L4;
          }
        }
    }

    private eg() throws Throwable {
        throw new Error();
    }

    static {
        field_t = "Day";
        field_p = "<%0> has entered another game.";
        field_z = "You can ask to join this game";
        field_G = "Staff impersonation";
        field_s = "Checking";
        field_y = 2;
        field_F = "There are no valid types of game that match your preferences.";
    }
}
