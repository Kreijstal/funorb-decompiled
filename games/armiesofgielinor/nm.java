/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends hn {
    static int field_z;
    private ih field_r;
    private boolean field_F;
    private int field_x;
    private int field_C;
    ih field_y;
    private boolean field_B;
    static int field_o;
    static String field_u;
    ih field_w;
    ih field_D;
    private int[] field_E;
    private um field_p;
    private um field_q;
    private int[] field_t;
    static kl field_s;
    private int field_v;
    private int field_G;
    private um field_A;

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
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
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if ((this.field_x ^ -1) >= -1) {
              this.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_F) {
                  L2: {
                    if (-1 <= (this.field_C ^ -1)) {
                      break L2;
                    } else {
                      if (this.field_w.g(11899)) {
                        break L2;
                      } else {
                        this.field_F = false;
                        this.field_p = null;
                        this.field_C = -this.field_C;
                        break L1;
                      }
                    }
                  }
                  if (this.field_C >= 0) {
                    break L1;
                  } else {
                    if (this.field_D.g(11899)) {
                      break L1;
                    } else {
                      this.field_F = false;
                      this.field_C = -this.field_C;
                      this.field_A = null;
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = (this.field_G >> -1158767380) * this.field_x / 256;
                var5 = -var4_int + this.field_x;
                if (this.field_C == 0) {
                  break L3;
                } else {
                  this.field_G = this.field_G + param2 * this.field_C;
                  if (1048576 > this.field_G) {
                    if (-1 > (this.field_G ^ -1)) {
                      break L3;
                    } else {
                      this.field_G = 0;
                      if (this.field_F) {
                        break L3;
                      } else {
                        this.field_C = 0;
                        if (!this.field_B) {
                          L4: {
                            if (this.field_p == null) {
                              break L4;
                            } else {
                              this.field_w.j(7);
                              break L4;
                            }
                          }
                          this.field_p = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  } else {
                    this.field_G = 1048576;
                    if (this.field_F) {
                      break L3;
                    } else {
                      this.field_C = 0;
                      if (!this.field_B) {
                        L5: {
                          if (null != this.field_A) {
                            this.field_D.j(7);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.field_A = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L6: {
                if (!rc.field_q) {
                  stackIn_32_0 = param2;
                  break L6;
                } else {
                  stackIn_32_0 = param2 << -1077437279;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_32_0;
                if (-257 < (this.field_v ^ -1)) {
                  L8: {
                    if (this.field_p != null) {
                      break L8;
                    } else {
                      if (null == this.field_A) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (-257 != (var4_int ^ -1)) {
                    if (-257 == (var5 ^ -1)) {
                      this.field_D.b(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (null == this.field_t) {
                            break L10;
                          } else {
                            if (var6 <= this.field_t.length) {
                              vm.a(this.field_t, 0, var6);
                              vm.a(this.field_E, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.field_t = new int[var6];
                        this.field_E = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_w.b(this.field_t, 0, param2);
                        this.field_D.b(this.field_E, 0, param2);
                        if (!rc.field_q) {
                          stackIn_48_0 = param1;
                          break L11;
                        } else {
                          localTemp$0 = param1 << 1;
                          param1 = localTemp$0;
                          stackIn_48_0 = localTemp$0;
                          break L11;
                        }
                      }
                      var7 = stackIn_48_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var8 >= var6) {
                          break L7;
                        } else {
                          param0[var7 - -var8] = param0[var7 - -var8] + (var5 * this.field_E[var8] + var4_int * this.field_t[var8] >> 1437544328);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  } else {
                    this.field_w.b(param0, param1, param2);
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                L14: {
                  if (this.field_q == null) {
                    break L14;
                  } else {
                    if (-1 != (this.field_v ^ -1)) {
                      L15: {
                        L16: {
                          if (this.field_t == null) {
                            break L16;
                          } else {
                            if (var6 > this.field_t.length) {
                              break L16;
                            } else {
                              vm.a(this.field_t, 0, var6);
                              break L15;
                            }
                          }
                        }
                        this.field_E = new int[var6];
                        this.field_t = new int[var6];
                        break L15;
                      }
                      L17: {
                        this.field_r.b(this.field_t, 0, param2);
                        if (!rc.field_q) {
                          stackIn_62_0 = param1;
                          break L17;
                        } else {
                          localTemp$1 = param1 << 1;
                          param1 = localTemp$1;
                          stackIn_62_0 = localTemp$1;
                          break L17;
                        }
                      }
                      var7 = stackIn_62_0;
                      var8 = this.field_x * this.field_v / 256;
                      var9 = -var8 + this.field_x;
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= var6) {
                          break L14;
                        } else {
                          param0[var10 + var7] = param0[var10 + var7] * var9 - -(var8 * this.field_t[var10]) >> -1668644856;
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      break L13;
                    }
                  }
                }
                break L13;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var4 = decompiledCaughtException;
            stackIn_68_0 = (RuntimeException) (var4);

            stackIn_68_1 = new StringBuilder().append("nm.E(");

            if (param0 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L19;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L19;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(um param0, boolean param1, int param2, byte param3) {
        Object var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          L0: {
            L1: {
              if (param3 == 41) {
                break L1;
              } else {
                field_u = (String) null;
                break L1;
              }
            }
            L2: {
              if (lk.field_e == null) {
                break L2;
              } else {
                bk.a(param2, 1048576, param0, param3 + 20566, param1);
                break L2;
              }
            }
            L3: {
              if (null != au.field_Kb) {
                var4 = l.field_a;
                synchronized (var4) {
                  L4: {
                    au.field_Kb.a(param2, -1, (byte) -91);
                    if (lo.field_u == param0) {
                      return;
                    } else {
                      L5: {
                        au.field_Kb.j(7);
                        l.field_a.c();
                        lo.field_u = param0;
                        if (lo.field_u == null) {
                          break L5;
                        } else {
                          au.field_Kb.a(2, param1, lo.field_u);
                          break L5;
                        }
                      }
                      break L4;
                    }
                  }
                }
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4_ref);

            stackIn_20_1 = new StringBuilder().append("nm.N(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final hn a() {
        return null;
    }

    final static boolean a(int param0, boolean param1) {
        if (!param1) {
            return false;
        }
        return (param0 ^ -1) <= -1 ? true : false;
    }

    final synchronized void a(int param0) {
        int var3;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if ((this.field_G ^ -1) >= -1) {
            break L0;
          } else {
            if (this.field_p != null) {
              this.field_w.a(param0);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (-1048577 < (this.field_G ^ -1)) {
            L2: {
              if (this.field_A != null) {
                this.field_D.a(param0);
                break L2;
              } else {
                break L2;
              }
            }
            if (-1 <= (this.field_v ^ -1)) {
              break L1;
            } else {
              if (null == this.field_q) {
                break L1;
              } else {
                this.field_r.a(param0);
                break L1;
              }
            }
          } else {
            if (-1 <= (this.field_v ^ -1)) {
              break L1;
            } else {
              if (null == this.field_q) {
                break L1;
              } else {
                this.field_r.a(param0);
                break L1;
              }
            }
          }
        }
        L3: {
          if (!this.field_F) {
            break L3;
          } else {
            if (this.field_C > 0) {
              if (!this.field_w.g(11899)) {
                this.field_F = false;
                this.field_C = -this.field_C;
                this.field_p = null;
                break L3;
              } else {
                if ((this.field_C ^ -1) <= -1) {
                  break L3;
                } else {
                  if (this.field_D.g(11899)) {
                    break L3;
                  } else {
                    this.field_F = false;
                    this.field_C = -this.field_C;
                    this.field_A = null;
                    break L3;
                  }
                }
              }
            } else {
              if ((this.field_C ^ -1) <= -1) {
                break L3;
              } else {
                if (this.field_D.g(11899)) {
                  break L3;
                } else {
                  this.field_F = false;
                  this.field_C = -this.field_C;
                  this.field_A = null;
                  break L3;
                }
              }
            }
          }
        }
        L4: {
          if (this.field_C != 0) {
            this.field_G = this.field_G + this.field_C * param0;
            if ((this.field_G ^ -1) > -1048577) {
              if ((this.field_G ^ -1) >= -1) {
                this.field_G = 0;
                if (this.field_F) {
                  break L4;
                } else {
                  this.field_C = 0;
                  if (this.field_B) {
                    break L4;
                  } else {
                    L5: {
                      if (null != this.field_p) {
                        this.field_w.j(7);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.field_p = null;
                    break L4;
                  }
                }
              } else {
                break L4;
              }
            } else {
              this.field_G = 1048576;
              if (!this.field_F) {
                this.field_C = 0;
                if (!this.field_B) {
                  L6: {
                    if (this.field_A != null) {
                      this.field_D.j(7);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  this.field_A = null;
                  break L4;
                } else {
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

    final synchronized void a(int param0, boolean param1, um param2, int param3, int param4, int param5) {
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_33_0 = 0;
        ih stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        ih stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        ih stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        ih stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        ih var9 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_F) {
                break L1;
              } else {
                if (param1) {
                  L2: {
                    if (-1 <= (this.field_C ^ -1)) {
                      L3: {
                        if (null != this.field_A) {
                          this.field_D.j(7);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.field_A = param2;
                      if (param2 == null) {
                        break L2;
                      } else {
                        this.field_D.a(2, false, param2);
                        this.a(-1, this.field_D, param5, param0);
                        break L2;
                      }
                    } else {
                      L4: {
                        if (this.field_p != null) {
                          this.field_w.j(7);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      this.field_p = param2;
                      if (param2 == null) {
                        break L2;
                      } else {
                        this.field_w.a(2, false, param2);
                        this.a(-1, this.field_w, param5, param0);
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L5: {
              stackIn_18_0 = this;

              if (!param1) {
                stackIn_19_0 = this;
                stackIn_19_1 = 0;
                break L5;
              } else {
                stackIn_19_0 = this;
                stackIn_19_1 = 1;
                break L5;
              }
            }
            ((nm) (this)).field_F = stackIn_19_1 != 0;
            if (param2 == this.field_p) {
              this.field_C = param4;
              this.a(-1, this.field_w, param5, param0);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (param2 == this.field_A) {
                this.field_C = -param4;
                this.a(-1, this.field_D, param5, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L6: {
                  if (param3 == -1) {
                    break L6;
                  } else {
                    var9 = (ih) null;
                    this.a(-25, (ih) null, 43, -18);
                    break L6;
                  }
                }
                L7: {
                  if (this.field_p == null) {
                    var7_int = 1;
                    break L7;
                  } else {
                    if (null == this.field_A) {
                      var7_int = 0;
                      break L7;
                    } else {
                      L8: {
                        if (-524289 >= (this.field_G ^ -1)) {
                          stackIn_33_0 = 0;
                          break L8;
                        } else {
                          stackIn_33_0 = 1;
                          break L8;
                        }
                      }
                      var7_int = stackIn_33_0;
                      break L7;
                    }
                  }
                }
                L9: {
                  if (var7_int != 0) {
                    L10: {
                      if (this.field_p == null) {
                        break L10;
                      } else {
                        this.field_w.j(7);
                        break L10;
                      }
                    }
                    L11: {
                      this.field_p = param2;
                      if (param2 != null) {
                        L12: {
                          stackIn_52_0 = this.field_w;

                          stackIn_52_1 = 2;

                          if (param1) {
                            stackIn_53_0 = (ih) ((Object) stackIn_52_0);
                            stackIn_53_1 = stackIn_52_1;
                            stackIn_53_2 = 0;
                            break L12;
                          } else {
                            stackIn_53_0 = (ih) ((Object) stackIn_52_0);
                            stackIn_53_1 = stackIn_52_1;
                            stackIn_53_2 = 1;
                            break L12;
                          }
                        }
                        ((ih) (Object) stackIn_53_0).a(stackIn_53_1, stackIn_53_2 != 0, param2);
                        this.a(param3 + 0, this.field_w, param5, param0);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    this.field_C = param4;
                    break L9;
                  } else {
                    L13: {
                      if (null == this.field_A) {
                        break L13;
                      } else {
                        this.field_D.j(7);
                        break L13;
                      }
                    }
                    L14: {
                      this.field_A = param2;
                      if (param2 != null) {
                        L15: {
                          stackIn_43_0 = this.field_D;

                          stackIn_43_1 = param3 + 3;

                          if (param1) {
                            stackIn_44_0 = (ih) ((Object) stackIn_43_0);
                            stackIn_44_1 = stackIn_43_1;
                            stackIn_44_2 = 0;
                            break L15;
                          } else {
                            stackIn_44_0 = (ih) ((Object) stackIn_43_0);
                            stackIn_44_1 = stackIn_43_1;
                            stackIn_44_2 = 1;
                            break L15;
                          }
                        }
                        ((ih) (Object) stackIn_44_0).a(stackIn_44_1, stackIn_44_2 != 0, param2);
                        this.a(param3 ^ 0, this.field_D, param5, param0);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    this.field_C = -param4;
                    break L9;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackIn_58_0 = (RuntimeException) (var7);

            stackIn_58_1 = new StringBuilder().append("nm.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "null";
              break L16;
            } else {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "{...}";
              break L16;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_59_0), stackIn_59_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
              return;
            }
          }
        }
    }

    final hn b() {
        return null;
    }

    final synchronized void b(int param0, int param1) {
        this.field_x = param0;
        int var3 = 74 % ((param1 - -65) / 46);
    }

    final synchronized int c() {
        return 2;
    }

    private final void a(int param0, ih param1, ih param2) {
        try {
            this.field_D = param2;
            this.field_w = param1;
            this.field_G = 1048576;
            this.field_y = this.field_w;
            if (param0 < 36) {
                ih var5 = (ih) null;
                this.a(-114, (ih) null, (ih) null);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "nm.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(int param0) {
        if (param0 != 256) {
            field_u = (String) null;
        }
        field_u = null;
        field_s = null;
    }

    private final void a(int param0, ih param1, int param2, int param3) {
        try {
            this.field_y = param1;
            param1.a(param3, param0, (byte) -55);
            param1.c(param2, param0 ^ 34);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "nm.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        je stackIn_6_0 = null;
        je stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        je stackIn_10_0 = null;
        je stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        je stackIn_23_0 = null;
        je stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        je stackIn_27_0 = null;
        je stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        L0: {
          id.a(-640 + qn.field_l >> -1264848031, 640 + qn.field_l >> -2033411135, qn.field_g, 0, (byte) 91);
          if (gk.field_J <= 0) {
            break L0;
          } else {
            L1: {
              if (null == dh.field_k) {
                break L1;
              } else {
                dh.field_k.f(no.field_T.field_S, 0);
                break L1;
              }
            }
            L2: {
              L3: {
                stackIn_6_0 = no.field_T;

                if (!param1) {
                  break L3;
                } else {
                  stackIn_6_0 = (je) ((Object) stackIn_6_0);

                  if (bw.field_g) {
                    break L3;
                  } else {
                    stackIn_7_0 = (je) ((Object) stackIn_6_0);
                    stackIn_7_1 = 1;
                    break L2;
                  }
                }
              }
              stackIn_7_0 = (je) ((Object) stackIn_6_0);
              stackIn_7_1 = 0;
              break L2;
            }
            L4: {
              L5: {
                ((je) (Object) stackIn_7_0).b(stackIn_7_1 != 0, 20);
                stackIn_10_0 = ov.field_i;

                if (!param1) {
                  break L5;
                } else {
                  stackIn_10_0 = (je) ((Object) stackIn_10_0);

                  if (bw.field_g) {
                    break L5;
                  } else {
                    stackIn_11_0 = (je) ((Object) stackIn_10_0);
                    stackIn_11_1 = 1;
                    break L4;
                  }
                }
              }
              stackIn_11_0 = (je) ((Object) stackIn_10_0);
              stackIn_11_1 = 0;
              break L4;
            }
            ((je) (Object) stackIn_11_0).b(stackIn_11_1 != 0, 20);
            break L0;
          }
        }
        if (param0 == 95) {
          L6: {
            L7: {
              if (0 < bd.field_r) {
                break L7;
              } else {
                if (rk.field_D > 0) {
                  break L7;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (dh.field_k != null) {
                dh.field_k.f(lk.field_a.field_S, 0);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              L10: {
                stackIn_23_0 = lk.field_a;

                if (!param1) {
                  break L10;
                } else {
                  stackIn_23_0 = (je) ((Object) stackIn_23_0);

                  if (vk.field_f) {
                    break L10;
                  } else {
                    stackIn_24_0 = (je) ((Object) stackIn_23_0);
                    stackIn_24_1 = 1;
                    break L9;
                  }
                }
              }
              stackIn_24_0 = (je) ((Object) stackIn_23_0);
              stackIn_24_1 = 0;
              break L9;
            }
            L11: {
              L12: {
                ((je) (Object) stackIn_24_0).b(stackIn_24_1 != 0, 20);
                stackIn_27_0 = pd.field_c;

                if (!param1) {
                  break L12;
                } else {
                  stackIn_27_0 = (je) ((Object) stackIn_27_0);

                  if (vk.field_f) {
                    break L12;
                  } else {
                    stackIn_28_0 = (je) ((Object) stackIn_27_0);
                    stackIn_28_1 = 1;
                    break L11;
                  }
                }
              }
              stackIn_28_0 = (je) ((Object) stackIn_27_0);
              stackIn_28_1 = 0;
              break L11;
            }
            ((je) (Object) stackIn_28_0).b(stackIn_28_1 != 0, 20);
            break L6;
          }
          rf.b(-18862);
          return;
        } else {
          return;
        }
    }

    final static li a(int param0, int param1, byte[] param2) {
        li var3 = null;
        RuntimeException var3_ref = null;
        li stackIn_2_0 = null;
        li stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new li(param2);
            s.field_e.a((byte) -119, (tc) (var3));
            hp.a(var3, param1, 25522);
            if (param0 == 0) {
              stackIn_4_0 = (li) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (li) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("nm.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    nm(ih param0, ih param1) {
        this.field_B = false;
        this.field_x = 256;
        this.field_v = 0;
        try {
            this.a(121, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "nm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_u = "The following settings need to be changed:  ";
        field_o = -1;
    }
}
