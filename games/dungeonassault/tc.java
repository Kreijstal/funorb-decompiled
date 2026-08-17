/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends qb {
    private vh field_z;
    ug field_A;
    private int field_p;
    static int[] field_w;
    private int[] field_s;
    private vh field_o;
    private boolean field_n;
    private int field_r;
    static String field_u;
    private int[] field_y;
    private vh field_x;
    private boolean field_q;
    private ug field_C;
    static int[] field_m;
    ug field_B;
    private int field_t;
    private int field_v;

    public static void a(byte param0) {
        field_m = null;
        if (param0 >= -12) {
            return;
        }
        field_w = null;
        field_u = null;
    }

    private final void a(ug param0, int param1, int param2, int param3) {
        try {
            param0.a(param1, param3, (byte) -82);
            param0.b(param2, 0);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "tc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final qb c() {
        return null;
    }

    final qb d() {
        return null;
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
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
        var11 = DungeonAssault.field_K;
        try {
          L0: {
            if (0 < this.field_t) {
              L1: {
                if (this.field_n) {
                  L2: {
                    if ((this.field_p ^ -1) >= -1) {
                      break L2;
                    } else {
                      if (!this.field_A.b((byte) -126)) {
                        this.field_o = null;
                        this.field_n = false;
                        this.field_p = -this.field_p;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if ((this.field_p ^ -1) <= -1) {
                    break L1;
                  } else {
                    if (!this.field_B.b((byte) -123)) {
                      this.field_x = null;
                      this.field_p = -this.field_p;
                      this.field_n = false;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = (this.field_v >> -1224808404) * this.field_t / 256;
                var5 = this.field_t - var4_int;
                if (this.field_p != 0) {
                  this.field_v = this.field_v + this.field_p * param2;
                  if (-1048577 < (this.field_v ^ -1)) {
                    if (this.field_v <= 0) {
                      this.field_v = 0;
                      if (this.field_n) {
                        break L3;
                      } else {
                        this.field_p = 0;
                        if (!this.field_q) {
                          L4: {
                            if (this.field_o == null) {
                              break L4;
                            } else {
                              this.field_A.d(-87);
                              break L4;
                            }
                          }
                          this.field_o = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    this.field_v = 1048576;
                    if (!this.field_n) {
                      this.field_p = 0;
                      if (!this.field_q) {
                        L5: {
                          if (null == this.field_x) {
                            break L5;
                          } else {
                            this.field_B.d(-128);
                            break L5;
                          }
                        }
                        this.field_x = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (vn.field_g) {
                  stackIn_35_0 = param2 << 16615361;
                  break L6;
                } else {
                  stackIn_35_0 = param2;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_35_0;
                if (256 > this.field_r) {
                  L8: {
                    if (this.field_o != null) {
                      break L8;
                    } else {
                      if (null == this.field_x) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (-257 == (var4_int ^ -1)) {
                    this.field_A.b(param0, param1, param2);
                    break L7;
                  } else {
                    if ((var5 ^ -1) != -257) {
                      L9: {
                        L10: {
                          if (this.field_s == null) {
                            break L10;
                          } else {
                            if (this.field_s.length >= var6) {
                              cj.a(this.field_s, 0, var6);
                              cj.a(this.field_y, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.field_s = new int[var6];
                        this.field_y = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_A.b(this.field_s, 0, param2);
                        this.field_B.b(this.field_y, 0, param2);
                        if (!vn.field_g) {
                          stackIn_51_0 = param1;
                          break L11;
                        } else {
                          localTemp$0 = param1 << 1;
                          param1 = localTemp$0;
                          stackIn_51_0 = localTemp$0;
                          break L11;
                        }
                      }
                      var7 = stackIn_51_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var8 >= var6) {
                          break L7;
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (var4_int * this.field_s[var8] + this.field_y[var8] * var5 >> 1050901064);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      this.field_B.b(param0, param1, param2);
                      break L7;
                    }
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                L14: {
                  if (null == this.field_z) {
                    break L14;
                  } else {
                    if (this.field_r != 0) {
                      L15: {
                        L16: {
                          if (this.field_s == null) {
                            break L16;
                          } else {
                            if (this.field_s.length >= var6) {
                              cj.a(this.field_s, 0, var6);
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        this.field_y = new int[var6];
                        this.field_s = new int[var6];
                        break L15;
                      }
                      L17: {
                        this.field_C.b(this.field_s, 0, param2);
                        if (!vn.field_g) {
                          stackIn_66_0 = param1;
                          break L17;
                        } else {
                          localTemp$1 = param1 << 1;
                          param1 = localTemp$1;
                          stackIn_66_0 = localTemp$1;
                          break L17;
                        }
                      }
                      var7 = stackIn_66_0;
                      var8 = this.field_t * this.field_r / 256;
                      var9 = this.field_t - var8;
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= var6) {
                          break L14;
                        } else {
                          param0[var7 - -var10] = var8 * this.field_s[var10] + param0[var7 - -var10] * var9 >> 2025300552;
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
            stackIn_72_0 = (RuntimeException) (var4);

            stackIn_72_1 = new StringBuilder().append("tc.F(");

            if (param0 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L19;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L19;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized void a(int param0, int param1, int param2, vh param3, int param4, boolean param5) {
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_30_0 = 0;
        ug stackIn_40_0 = null;
        vh stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        ug stackIn_41_0;
        vh stackIn_41_1;
        int stackIn_41_2;
        int stackIn_41_3;
        ug stackIn_49_0 = null;
        vh stackIn_49_1 = null;
        int stackIn_49_2 = 0;
        ug stackIn_50_0;
        vh stackIn_50_1;
        int stackIn_50_2;
        int stackIn_50_3;
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
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (!this.field_n) {
                break L1;
              } else {
                if (param5) {
                  L2: {
                    if (this.field_p > 0) {
                      L3: {
                        if (null != this.field_o) {
                          this.field_A.d(-82);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.field_o = param3;
                      if (param3 == null) {
                        break L2;
                      } else {
                        this.field_A.a(param3, param0 ^ 1917, false);
                        this.a(this.field_A, param4, param1, param0 ^ -22200);
                        break L2;
                      }
                    } else {
                      L4: {
                        if (this.field_x != null) {
                          this.field_B.d(-79);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      this.field_x = param3;
                      if (param3 == null) {
                        break L2;
                      } else {
                        this.field_B.a(param3, param0 ^ 1917, false);
                        this.a(this.field_B, param4, param1, param0 ^ -22200);
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

              if (!param5) {
                stackIn_19_0 = this;
                stackIn_19_1 = 0;
                break L5;
              } else {
                stackIn_19_0 = this;
                stackIn_19_1 = 1;
                break L5;
              }
            }
            ((tc) (this)).field_n = stackIn_19_1 != 0;
            if (this.field_o != param3) {
              if (this.field_x != param3) {
                L6: {
                  if (this.field_o == null) {
                    var7_int = 1;
                    break L6;
                  } else {
                    if (this.field_x == null) {
                      var7_int = 0;
                      break L6;
                    } else {
                      L7: {
                        if (this.field_v >= 524288) {
                          stackIn_30_0 = 0;
                          break L7;
                        } else {
                          stackIn_30_0 = 1;
                          break L7;
                        }
                      }
                      var7_int = stackIn_30_0;
                      break L6;
                    }
                  }
                }
                L8: {
                  if (var7_int == 0) {
                    L9: {
                      if (this.field_x != null) {
                        this.field_B.d(-83);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      this.field_x = param3;
                      if (param3 == null) {
                        break L10;
                      } else {
                        L11: {
                          stackIn_49_0 = this.field_B;

                          stackIn_49_1 = (vh) (param3);

                          stackIn_49_2 = 20938;

                          if (param5) {
                            stackIn_50_0 = (ug) ((Object) stackIn_49_0);
                            stackIn_50_1 = (vh) ((Object) stackIn_49_1);
                            stackIn_50_2 = stackIn_49_2;
                            stackIn_50_3 = 0;
                            break L11;
                          } else {
                            stackIn_50_0 = (ug) ((Object) stackIn_49_0);
                            stackIn_50_1 = (vh) ((Object) stackIn_49_1);
                            stackIn_50_2 = stackIn_49_2;
                            stackIn_50_3 = 1;
                            break L11;
                          }
                        }
                        ((ug) (Object) stackIn_50_0).a(stackIn_50_1, stackIn_50_2, stackIn_50_3 != 0);
                        this.a(this.field_B, param4, param1, -1);
                        break L10;
                      }
                    }
                    this.field_p = -param2;
                    break L8;
                  } else {
                    L12: {
                      if (null == this.field_o) {
                        break L12;
                      } else {
                        this.field_A.d(-80);
                        break L12;
                      }
                    }
                    L13: {
                      this.field_o = param3;
                      if (param3 != null) {
                        L14: {
                          stackIn_40_0 = this.field_A;

                          stackIn_40_1 = (vh) (param3);

                          stackIn_40_2 = param0 + -1261;

                          if (param5) {
                            stackIn_41_0 = (ug) ((Object) stackIn_40_0);
                            stackIn_41_1 = (vh) ((Object) stackIn_40_1);
                            stackIn_41_2 = stackIn_40_2;
                            stackIn_41_3 = 0;
                            break L14;
                          } else {
                            stackIn_41_0 = (ug) ((Object) stackIn_40_0);
                            stackIn_41_1 = (vh) ((Object) stackIn_40_1);
                            stackIn_41_2 = stackIn_40_2;
                            stackIn_41_3 = 1;
                            break L14;
                          }
                        }
                        ((ug) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2, stackIn_41_3 != 0);
                        this.a(this.field_A, param4, param1, -1);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    this.field_p = param2;
                    break L8;
                  }
                }
                L15: {
                  if (param0 == 22199) {
                    break L15;
                  } else {
                    tc.a((byte) -5);
                    break L15;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                this.field_p = -param2;
                this.a(this.field_B, param4, param1, -1);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              this.field_p = param2;
              this.a(this.field_A, param4, param1, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackIn_57_0 = (RuntimeException) (var7);

            stackIn_57_1 = new StringBuilder().append("tc.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ',' + param4 + ',' + param5 + ')');
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

    final synchronized void a(int param0, int param1) {
        if (param1 != 256) {
            this.c();
        }
        this.field_t = param0;
    }

    private final void a(boolean param0, ug param1, ug param2) {
        try {
            this.field_B = param2;
            this.field_v = 1048576;
            if (!param0) {
                tc.a((byte) 14);
            }
            this.field_A = param1;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "tc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized int a() {
        return 2;
    }

    final synchronized void a(int param0) {
        int var3;
        L0: {
          var3 = DungeonAssault.field_K;
          if (0 >= this.field_v) {
            break L0;
          } else {
            if (this.field_o == null) {
              break L0;
            } else {
              this.field_A.a(param0);
              break L0;
            }
          }
        }
        L1: {
          if (this.field_v >= 1048576) {
            break L1;
          } else {
            if (null != this.field_x) {
              this.field_B.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (0 >= this.field_r) {
            break L2;
          } else {
            if (this.field_z != null) {
              this.field_C.a(param0);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (!this.field_n) {
            break L3;
          } else {
            if (0 < this.field_p) {
              if (!this.field_A.b((byte) -127)) {
                this.field_o = null;
                this.field_n = false;
                this.field_p = -this.field_p;
                break L3;
              } else {
                if (this.field_p >= 0) {
                  break L3;
                } else {
                  if (this.field_B.b((byte) -121)) {
                    break L3;
                  } else {
                    this.field_x = null;
                    this.field_p = -this.field_p;
                    this.field_n = false;
                    break L3;
                  }
                }
              }
            } else {
              if (this.field_p >= 0) {
                break L3;
              } else {
                if (this.field_B.b((byte) -121)) {
                  break L3;
                } else {
                  this.field_x = null;
                  this.field_p = -this.field_p;
                  this.field_n = false;
                  break L3;
                }
              }
            }
          }
        }
        L4: {
          if (this.field_p == 0) {
            break L4;
          } else {
            this.field_v = this.field_v + param0 * this.field_p;
            if (-1048577 < (this.field_v ^ -1)) {
              if (-1 <= (this.field_v ^ -1)) {
                this.field_v = 0;
                if (!this.field_n) {
                  this.field_p = 0;
                  if (!this.field_q) {
                    L5: {
                      if (this.field_o == null) {
                        break L5;
                      } else {
                        this.field_A.d(-86);
                        break L5;
                      }
                    }
                    this.field_o = null;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            } else {
              this.field_v = 1048576;
              if (this.field_n) {
                break L4;
              } else {
                this.field_p = 0;
                if (!this.field_q) {
                  L6: {
                    if (this.field_x == null) {
                      break L6;
                    } else {
                      this.field_B.d(-117);
                      break L6;
                    }
                  }
                  this.field_x = null;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
          }
        }
    }

    final void b(byte param0) {
        if (null != this.field_o) {
            this.field_A.d(param0 + -131);
        }
        if (null != this.field_x) {
            this.field_B.d(-96);
        }
        this.field_o = null;
        if (param0 != 52) {
            this.b((byte) 51);
        }
        this.field_x = null;
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        pm var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            var4 = (pm) ((Object) li.field_a.e(-24172));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param1 == -112) {
                    break L2;
                  } else {
                    field_u = (String) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                ro.a(var4, param0, param1 + 236);
                var4 = (pm) ((Object) li.field_a.a(4));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "tc.L(" + param0 + ',' + param1 + ')');
        }
    }

    public tc() {
        this.field_q = false;
        this.field_r = 0;
        this.field_t = 256;
        ug var1 = new ug();
        this.a(true, var1, new ug(var1));
    }

    static {
        field_m = new int[8192];
    }
}
