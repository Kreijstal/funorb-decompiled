/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends sh {
    static volatile int field_s;
    static String[] field_m;
    private ei field_o;
    private boolean field_B;
    private int field_u;
    private ei field_C;
    private wk field_y;
    private wk field_F;
    static int field_n;
    private ei field_t;
    private int field_E;
    static int field_D;
    private int field_A;
    private int field_x;
    private int[] field_p;
    private wk field_r;
    static mf field_z;
    private int[] field_q;
    static dd[] field_v;
    private boolean field_w;

    private final void a(byte param0, int param1, int param2, ei param3) {
        param3.a(param2, true, -1);
        if (param0 < 16) {
            return;
        }
        try {
            param3.a((byte) -49, param1);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "th.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(wk param0, int param1, int param2, boolean param3, int param4, int param5) {
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_33_0 = 0;
        ei stackIn_42_0 = null;
        ei stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        ei stackIn_51_0 = null;
        ei stackIn_52_0 = null;
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
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_B) {
                break L1;
              } else {
                if (param3) {
                  L2: {
                    if (this.field_u > 0) {
                      L3: {
                        if (this.field_F != null) {
                          this.field_C.e(-398);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.field_F = param0;
                      if (param0 != null) {
                        this.field_C.a(false, param2 + 524395, param0);
                        this.a((byte) 87, param1, param5, this.field_C);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (this.field_r == null) {
                          break L4;
                        } else {
                          this.field_o.e(-398);
                          break L4;
                        }
                      }
                      this.field_r = param0;
                      if (param0 == null) {
                        break L2;
                      } else {
                        this.field_o.a(false, 64, param0);
                        this.a((byte) 64, param1, param5, this.field_o);
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
            ((th) (this)).field_B = stackIn_19_1 != 0;
            if (param0 != this.field_F) {
              if (param0 != this.field_r) {
                L6: {
                  if (param2 == -524289) {
                    break L6;
                  } else {
                    this.field_r = (wk) null;
                    break L6;
                  }
                }
                L7: {
                  if (null != this.field_F) {
                    if (this.field_r == null) {
                      var7_int = 0;
                      break L7;
                    } else {
                      L8: {
                        if ((this.field_E ^ -1) <= -524289) {
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
                  } else {
                    var7_int = 1;
                    break L7;
                  }
                }
                L9: {
                  if (var7_int != 0) {
                    L10: {
                      if (this.field_F != null) {
                        this.field_C.e(-398);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      this.field_F = param0;
                      if (param0 == null) {
                        break L11;
                      } else {
                        L12: {
                          stackIn_51_0 = this.field_C;

                          if (param3) {
                            stackIn_52_0 = (ei) ((Object) stackIn_51_0);
                            stackIn_52_1 = 0;
                            break L12;
                          } else {
                            stackIn_52_0 = (ei) ((Object) stackIn_51_0);
                            stackIn_52_1 = 1;
                            break L12;
                          }
                        }
                        ((ei) (Object) stackIn_52_0).a(stackIn_52_1 != 0, 101, param0);
                        this.a((byte) 79, param1, param5, this.field_C);
                        break L11;
                      }
                    }
                    this.field_u = param4;
                    break L9;
                  } else {
                    L13: {
                      if (this.field_r != null) {
                        this.field_o.e(-398);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      this.field_r = param0;
                      if (param0 == null) {
                        break L14;
                      } else {
                        L15: {
                          stackIn_42_0 = this.field_o;

                          if (param3) {
                            stackIn_43_0 = (ei) ((Object) stackIn_42_0);
                            stackIn_43_1 = 0;
                            break L15;
                          } else {
                            stackIn_43_0 = (ei) ((Object) stackIn_42_0);
                            stackIn_43_1 = 1;
                            break L15;
                          }
                        }
                        ((ei) (Object) stackIn_43_0).a(stackIn_43_1 != 0, param2 + 524353, param0);
                        this.a((byte) 104, param1, param5, this.field_o);
                        break L14;
                      }
                    }
                    this.field_u = -param4;
                    break L9;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                this.field_u = -param4;
                this.a((byte) 57, param1, param5, this.field_o);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              this.field_u = param4;
              this.a((byte) 72, param1, param5, this.field_C);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackIn_57_0 = (RuntimeException) (var7);

            stackIn_57_1 = new StringBuilder().append("th.F(");

            if (param0 == null) {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "null";
              break L16;
            } else {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "{...}";
              break L16;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    public static void b(boolean param0) {
        field_z = null;
        if (param0) {
            field_D = -86;
        }
        field_v = null;
        field_m = null;
    }

    final synchronized int a() {
        return 2;
    }

    final sh d() {
        return null;
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
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
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (0 < this.field_x) {
              L1: {
                if (!this.field_B) {
                  break L1;
                } else {
                  L2: {
                    if (-1 <= (this.field_u ^ -1)) {
                      break L2;
                    } else {
                      if (!this.field_C.d(31499)) {
                        this.field_F = null;
                        this.field_B = false;
                        this.field_u = -this.field_u;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (0 <= this.field_u) {
                    break L1;
                  } else {
                    if (!this.field_o.d(31499)) {
                      this.field_B = false;
                      this.field_u = -this.field_u;
                      this.field_r = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = this.field_x * (this.field_E >> 439093676) / 256;
                var5 = this.field_x - var4_int;
                if (0 != this.field_u) {
                  this.field_E = this.field_E + param2 * this.field_u;
                  if (this.field_E < 1048576) {
                    if (0 >= this.field_E) {
                      this.field_E = 0;
                      if (!this.field_B) {
                        this.field_u = 0;
                        if (this.field_w) {
                          break L3;
                        } else {
                          L4: {
                            if (this.field_F != null) {
                              this.field_C.e(-398);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          this.field_F = null;
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    this.field_E = 1048576;
                    if (this.field_B) {
                      break L3;
                    } else {
                      this.field_u = 0;
                      if (this.field_w) {
                        break L3;
                      } else {
                        L5: {
                          if (this.field_r == null) {
                            break L5;
                          } else {
                            this.field_o.e(-398);
                            break L5;
                          }
                        }
                        this.field_r = null;
                        break L3;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (la.field_h) {
                  stackIn_33_0 = param2 << 1335842689;
                  break L6;
                } else {
                  stackIn_33_0 = param2;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_33_0;
                if (-257 < (this.field_A ^ -1)) {
                  L8: {
                    if (this.field_F != null) {
                      break L8;
                    } else {
                      if (this.field_r != null) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (-257 != (var4_int ^ -1)) {
                    if ((var5 ^ -1) == -257) {
                      this.field_o.b(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (this.field_q == null) {
                            break L10;
                          } else {
                            if (var6 <= this.field_q.length) {
                              dm.a(this.field_q, 0, var6);
                              dm.a(this.field_p, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.field_p = new int[var6];
                        this.field_q = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_C.b(this.field_q, 0, param2);
                        this.field_o.b(this.field_p, 0, param2);
                        if (!la.field_h) {
                          stackIn_49_0 = param1;
                          break L11;
                        } else {
                          localTemp$0 = param1 << 1;
                          param1 = localTemp$0;
                          stackIn_49_0 = localTemp$0;
                          break L11;
                        }
                      }
                      var7 = stackIn_49_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var8 >= var6) {
                          break L7;
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (var4_int * this.field_q[var8] + this.field_p[var8] * var5 >> 1604844392);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  } else {
                    this.field_C.b(param0, param1, param2);
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                L14: {
                  if (this.field_y == null) {
                    break L14;
                  } else {
                    if (this.field_A != 0) {
                      L15: {
                        L16: {
                          if (null == this.field_q) {
                            break L16;
                          } else {
                            if (this.field_q.length < var6) {
                              break L16;
                            } else {
                              dm.a(this.field_q, 0, var6);
                              break L15;
                            }
                          }
                        }
                        this.field_q = new int[var6];
                        this.field_p = new int[var6];
                        break L15;
                      }
                      L17: {
                        this.field_t.b(this.field_q, 0, param2);
                        if (la.field_h) {
                          localTemp$1 = param1 << 1;
                          param1 = localTemp$1;
                          stackIn_63_0 = localTemp$1;
                          break L17;
                        } else {
                          stackIn_63_0 = param1;
                          break L17;
                        }
                      }
                      var7 = stackIn_63_0;
                      var8 = this.field_A * this.field_x / 256;
                      var9 = -var8 + this.field_x;
                      var10 = 0;
                      L18: while (true) {
                        if (var6 <= var10) {
                          break L14;
                        } else {
                          param0[var7 - -var10] = param0[var10 + var7] * var9 - -(this.field_q[var10] * var8) >> 1513585096;
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
            } else {
              this.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var4 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var4);

            stackIn_69_1 = new StringBuilder().append("th.G(");

            if (param0 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L19;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L19;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized void a(int param0, byte param1) {
        this.field_x = param0;
        if (param1 <= 2) {
            this.field_E = -91;
        }
    }

    final sh c() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3;
        L0: {
          var3 = fleas.field_A ? 1 : 0;
          if (this.field_E > 0) {
            if (this.field_F != null) {
              this.field_C.a(param0);
              if (-1048577 < (this.field_E ^ -1)) {
                if (this.field_r != null) {
                  this.field_o.a(param0);
                  if (0 >= this.field_A) {
                    break L0;
                  } else {
                    if (null == this.field_y) {
                      break L0;
                    } else {
                      this.field_t.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if (0 >= this.field_A) {
                    break L0;
                  } else {
                    if (null == this.field_y) {
                      break L0;
                    } else {
                      this.field_t.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if (0 >= this.field_A) {
                  break L0;
                } else {
                  if (null == this.field_y) {
                    break L0;
                  } else {
                    this.field_t.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if (-1048577 < (this.field_E ^ -1)) {
                if (this.field_r != null) {
                  this.field_o.a(param0);
                  if (0 >= this.field_A) {
                    break L0;
                  } else {
                    if (null == this.field_y) {
                      break L0;
                    } else {
                      this.field_t.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if (0 >= this.field_A) {
                    break L0;
                  } else {
                    if (null == this.field_y) {
                      break L0;
                    } else {
                      this.field_t.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if (0 >= this.field_A) {
                  break L0;
                } else {
                  if (null == this.field_y) {
                    break L0;
                  } else {
                    this.field_t.a(param0);
                    break L0;
                  }
                }
              }
            }
          } else {
            if (-1048577 < (this.field_E ^ -1)) {
              if (this.field_r != null) {
                this.field_o.a(param0);
                if (0 >= this.field_A) {
                  break L0;
                } else {
                  if (null == this.field_y) {
                    break L0;
                  } else {
                    this.field_t.a(param0);
                    break L0;
                  }
                }
              } else {
                if (0 >= this.field_A) {
                  break L0;
                } else {
                  if (null == this.field_y) {
                    break L0;
                  } else {
                    this.field_t.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if (0 >= this.field_A) {
                break L0;
              } else {
                if (null == this.field_y) {
                  break L0;
                } else {
                  this.field_t.a(param0);
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (!this.field_B) {
            break L1;
          } else {
            L2: {
              if (-1 <= (this.field_u ^ -1)) {
                break L2;
              } else {
                if (this.field_C.d(31499)) {
                  break L2;
                } else {
                  this.field_u = -this.field_u;
                  this.field_F = null;
                  this.field_B = false;
                  break L1;
                }
              }
            }
            if (this.field_u >= 0) {
              break L1;
            } else {
              if (!this.field_o.d(31499)) {
                this.field_B = false;
                this.field_r = null;
                this.field_u = -this.field_u;
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
        L3: {
          if (-1 == (this.field_u ^ -1)) {
            break L3;
          } else {
            this.field_E = this.field_E + param0 * this.field_u;
            if (1048576 <= this.field_E) {
              this.field_E = 1048576;
              if (!this.field_B) {
                this.field_u = 0;
                if (this.field_w) {
                  break L3;
                } else {
                  L4: {
                    if (null == this.field_r) {
                      break L4;
                    } else {
                      this.field_o.e(-398);
                      break L4;
                    }
                  }
                  this.field_r = null;
                  break L3;
                }
              } else {
                break L3;
              }
            } else {
              if (this.field_E <= 0) {
                this.field_E = 0;
                if (!this.field_B) {
                  this.field_u = 0;
                  if (this.field_w) {
                    break L3;
                  } else {
                    L5: {
                      if (this.field_F != null) {
                        this.field_C.e(-398);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.field_F = null;
                    break L3;
                  }
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
          }
        }
    }

    private th() throws Throwable {
        throw new Error();
    }

    static {
        field_m = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_s = 0;
        field_n = 0;
        field_D = 256;
        field_v = new dd[50];
    }
}
