/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hq extends tda {
    private int field_q;
    private kia field_v;
    private jp field_r;
    private int field_t;
    private jp field_s;
    private boolean field_n;
    private int field_l;
    private boolean field_p;
    private kia field_m;
    private int[] field_j;
    private kia field_u;
    private int field_w;
    private int[] field_k;
    private jp field_o;

    final synchronized void a(kia param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_33_0 = 0;
        jp stackIn_42_0 = null;
        kia stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        jp stackIn_43_0;
        kia stackIn_43_1;
        int stackIn_43_2;
        int stackIn_43_3;
        jp stackIn_50_0 = null;
        kia stackIn_50_1 = null;
        int stackIn_50_2 = 0;
        jp stackIn_51_0;
        kia stackIn_51_1;
        int stackIn_51_2;
        int stackIn_51_3;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            if (param5) {
              L1: {
                if (!this.field_p) {
                  break L1;
                } else {
                  if (!param1) {
                    break L1;
                  } else {
                    L2: {
                      if (0 >= this.field_w) {
                        L3: {
                          if (null != this.field_m) {
                            this.field_o.b(true);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        this.field_m = param0;
                        if (param0 == null) {
                          break L2;
                        } else {
                          this.field_o.a(param0, (byte) -115, false);
                          this.a(param3, param2, this.field_o, -49);
                          break L2;
                        }
                      } else {
                        L4: {
                          if (null != this.field_u) {
                            this.field_s.b(true);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.field_u = param0;
                        if (param0 != null) {
                          this.field_s.a(param0, (byte) -113, false);
                          this.a(param3, param2, this.field_s, -72);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L5: {
                stackIn_20_0 = this;

                if (!param1) {
                  stackIn_21_0 = this;
                  stackIn_21_1 = 0;
                  break L5;
                } else {
                  stackIn_21_0 = this;
                  stackIn_21_1 = 1;
                  break L5;
                }
              }
              ((hq) (this)).field_p = stackIn_21_1 != 0;
              if (param0 != this.field_u) {
                if (this.field_m != param0) {
                  L6: {
                    if (this.field_u != null) {
                      if (this.field_m == null) {
                        var7_int = 0;
                        break L6;
                      } else {
                        L7: {
                          if (-524289 >= (this.field_t ^ -1)) {
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
                    if (var7_int == 0) {
                      L9: {
                        if (null == this.field_m) {
                          break L9;
                        } else {
                          this.field_o.b(true);
                          break L9;
                        }
                      }
                      L10: {
                        this.field_m = param0;
                        if (param0 == null) {
                          break L10;
                        } else {
                          L11: {
                            stackIn_50_0 = this.field_o;

                            stackIn_50_1 = (kia) (param0);

                            stackIn_50_2 = -111;

                            if (param1) {
                              stackIn_51_0 = (jp) ((Object) stackIn_50_0);
                              stackIn_51_1 = (kia) ((Object) stackIn_50_1);
                              stackIn_51_2 = stackIn_50_2;
                              stackIn_51_3 = 0;
                              break L11;
                            } else {
                              stackIn_51_0 = (jp) ((Object) stackIn_50_0);
                              stackIn_51_1 = (kia) ((Object) stackIn_50_1);
                              stackIn_51_2 = stackIn_50_2;
                              stackIn_51_3 = 1;
                              break L11;
                            }
                          }
                          ((jp) (Object) stackIn_51_0).a(stackIn_51_1, (byte) stackIn_51_2, stackIn_51_3 != 0);
                          this.a(param3, param2, this.field_o, -53);
                          break L10;
                        }
                      }
                      this.field_w = -param4;
                      break L8;
                    } else {
                      L12: {
                        if (null == this.field_u) {
                          break L12;
                        } else {
                          this.field_s.b(true);
                          break L12;
                        }
                      }
                      L13: {
                        this.field_u = param0;
                        if (param0 != null) {
                          L14: {
                            stackIn_42_0 = this.field_s;

                            stackIn_42_1 = (kia) (param0);

                            stackIn_42_2 = -115;

                            if (param1) {
                              stackIn_43_0 = (jp) ((Object) stackIn_42_0);
                              stackIn_43_1 = (kia) ((Object) stackIn_42_1);
                              stackIn_43_2 = stackIn_42_2;
                              stackIn_43_3 = 0;
                              break L14;
                            } else {
                              stackIn_43_0 = (jp) ((Object) stackIn_42_0);
                              stackIn_43_1 = (kia) ((Object) stackIn_42_1);
                              stackIn_43_2 = stackIn_42_2;
                              stackIn_43_3 = 1;
                              break L14;
                            }
                          }
                          ((jp) (Object) stackIn_43_0).a(stackIn_43_1, (byte) stackIn_43_2, stackIn_43_3 != 0);
                          this.a(param3, param2, this.field_s, -83);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      this.field_w = param4;
                      break L8;
                    }
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  this.field_w = -param4;
                  this.a(param3, param2, this.field_o, -91);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                this.field_w = param4;
                this.a(param3, param2, this.field_s, -75);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackIn_56_0 = (RuntimeException) (var7);

            stackIn_56_1 = new StringBuilder().append("hq.H(");

            if (param0 == null) {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L15;
            } else {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
              break L15;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    final synchronized void a(int param0) {
        int var3;
        L0: {
          var3 = BachelorFridge.field_y;
          if (-1 > (this.field_t ^ -1)) {
            if (this.field_u != null) {
              this.field_s.a(param0);
              if (-1048577 < (this.field_t ^ -1)) {
                if (null != this.field_m) {
                  this.field_o.a(param0);
                  if ((this.field_l ^ -1) >= -1) {
                    break L0;
                  } else {
                    if (this.field_v == null) {
                      break L0;
                    } else {
                      this.field_r.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if ((this.field_l ^ -1) >= -1) {
                    break L0;
                  } else {
                    if (this.field_v == null) {
                      break L0;
                    } else {
                      this.field_r.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if ((this.field_l ^ -1) >= -1) {
                  break L0;
                } else {
                  if (this.field_v == null) {
                    break L0;
                  } else {
                    this.field_r.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if (-1048577 < (this.field_t ^ -1)) {
                if (null != this.field_m) {
                  this.field_o.a(param0);
                  if ((this.field_l ^ -1) >= -1) {
                    break L0;
                  } else {
                    if (this.field_v == null) {
                      break L0;
                    } else {
                      this.field_r.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if ((this.field_l ^ -1) >= -1) {
                    break L0;
                  } else {
                    if (this.field_v == null) {
                      break L0;
                    } else {
                      this.field_r.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if ((this.field_l ^ -1) >= -1) {
                  break L0;
                } else {
                  if (this.field_v == null) {
                    break L0;
                  } else {
                    this.field_r.a(param0);
                    break L0;
                  }
                }
              }
            }
          } else {
            if (-1048577 < (this.field_t ^ -1)) {
              if (null != this.field_m) {
                this.field_o.a(param0);
                if ((this.field_l ^ -1) >= -1) {
                  break L0;
                } else {
                  if (this.field_v == null) {
                    break L0;
                  } else {
                    this.field_r.a(param0);
                    break L0;
                  }
                }
              } else {
                if ((this.field_l ^ -1) >= -1) {
                  break L0;
                } else {
                  if (this.field_v == null) {
                    break L0;
                  } else {
                    this.field_r.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if ((this.field_l ^ -1) >= -1) {
                break L0;
              } else {
                if (this.field_v == null) {
                  break L0;
                } else {
                  this.field_r.a(param0);
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (!this.field_p) {
            break L1;
          } else {
            L2: {
              if (this.field_w <= 0) {
                break L2;
              } else {
                if (this.field_s.c(28607)) {
                  break L2;
                } else {
                  this.field_u = null;
                  this.field_p = false;
                  this.field_w = -this.field_w;
                  break L1;
                }
              }
            }
            if (0 <= this.field_w) {
              break L1;
            } else {
              if (!this.field_o.c(28607)) {
                this.field_m = null;
                this.field_w = -this.field_w;
                this.field_p = false;
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
        L3: {
          if (this.field_w == 0) {
            break L3;
          } else {
            this.field_t = this.field_t + param0 * this.field_w;
            if ((this.field_t ^ -1) <= -1048577) {
              this.field_t = 1048576;
              if (!this.field_p) {
                this.field_w = 0;
                if (!this.field_n) {
                  L4: {
                    if (this.field_m != null) {
                      this.field_o.b(true);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_m = null;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            } else {
              if (-1 <= (this.field_t ^ -1)) {
                this.field_t = 0;
                if (!this.field_p) {
                  this.field_w = 0;
                  if (this.field_n) {
                    break L3;
                  } else {
                    L5: {
                      if (null == this.field_u) {
                        break L5;
                      } else {
                        this.field_s.b(true);
                        break L5;
                      }
                    }
                    this.field_u = null;
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

    final tda b() {
        return null;
    }

    final void a(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int stackIn_34_0 = 0;
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
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            if (-1 <= (this.field_q ^ -1)) {
              this.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_p) {
                  L2: {
                    if ((this.field_w ^ -1) >= -1) {
                      break L2;
                    } else {
                      if (!this.field_s.c(28607)) {
                        this.field_u = null;
                        this.field_w = -this.field_w;
                        this.field_p = false;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (this.field_w >= 0) {
                    break L1;
                  } else {
                    if (this.field_o.c(28607)) {
                      break L1;
                    } else {
                      this.field_w = -this.field_w;
                      this.field_m = null;
                      this.field_p = false;
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = this.field_q * (this.field_t >> -1198266804) / 256;
                var5 = -var4_int + this.field_q;
                if (0 == this.field_w) {
                  break L3;
                } else {
                  this.field_t = this.field_t + this.field_w * param2;
                  if (-1048577 >= (this.field_t ^ -1)) {
                    this.field_t = 1048576;
                    if (!this.field_p) {
                      this.field_w = 0;
                      if (!this.field_n) {
                        L4: {
                          if (this.field_m == null) {
                            break L4;
                          } else {
                            this.field_o.b(true);
                            break L4;
                          }
                        }
                        this.field_m = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    if (this.field_t > 0) {
                      break L3;
                    } else {
                      this.field_t = 0;
                      if (this.field_p) {
                        break L3;
                      } else {
                        this.field_w = 0;
                        if (!this.field_n) {
                          L5: {
                            if (this.field_u != null) {
                              this.field_s.b(true);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          this.field_u = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              L6: {
                if (!pb.field_q) {
                  stackIn_34_0 = param2;
                  break L6;
                } else {
                  stackIn_34_0 = param2 << 893102177;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_34_0;
                if (this.field_l >= 256) {
                  break L7;
                } else {
                  L8: {
                    if (this.field_u != null) {
                      break L8;
                    } else {
                      if (null != this.field_m) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (256 != var4_int) {
                    if ((var5 ^ -1) == -257) {
                      this.field_o.a(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (this.field_j == null) {
                            break L10;
                          } else {
                            if (this.field_j.length < var6) {
                              break L10;
                            } else {
                              bl.a(this.field_j, 0, var6);
                              bl.a(this.field_k, 0, var6);
                              break L9;
                            }
                          }
                        }
                        this.field_k = new int[var6];
                        this.field_j = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_s.a(this.field_j, 0, param2);
                        this.field_o.a(this.field_k, 0, param2);
                        if (!pb.field_q) {
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
                          param0[var8 + var7] = param0[var8 + var7] + (var4_int * this.field_j[var8] + var5 * this.field_k[var8] >> 202956008);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  } else {
                    this.field_s.a(param0, param1, param2);
                    break L7;
                  }
                }
              }
              L13: {
                L14: {
                  if (this.field_v == null) {
                    break L14;
                  } else {
                    if (this.field_l != 0) {
                      L15: {
                        L16: {
                          if (this.field_j == null) {
                            break L16;
                          } else {
                            if (this.field_j.length < var6) {
                              break L16;
                            } else {
                              bl.a(this.field_j, 0, var6);
                              break L15;
                            }
                          }
                        }
                        this.field_k = new int[var6];
                        this.field_j = new int[var6];
                        break L15;
                      }
                      L17: {
                        this.field_r.a(this.field_j, 0, param2);
                        if (pb.field_q) {
                          localTemp$1 = param1 << 1;
                          param1 = localTemp$1;
                          stackIn_62_0 = localTemp$1;
                          break L17;
                        } else {
                          stackIn_62_0 = param1;
                          break L17;
                        }
                      }
                      var7 = stackIn_62_0;
                      var8 = this.field_l * this.field_q / 256;
                      var9 = this.field_q + -var8;
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= var6) {
                          break L14;
                        } else {
                          param0[var7 - -var10] = this.field_j[var10] * var8 + var9 * param0[var7 + var10] >> -1222271384;
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

            stackIn_68_1 = new StringBuilder().append("hq.C(");

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
          throw pe.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized int d() {
        return 2;
    }

    final tda a() {
        return null;
    }

    final synchronized void a(int param0, boolean param1) {
        if (!param1) {
            int[] var4 = (int[]) null;
            this.a((int[]) null, 70, 31);
        }
        this.field_q = param0;
    }

    private final void a(int param0, int param1, jp param2, int param3) {
        try {
            if (param3 > 0) {
                this.d();
            }
            param2.a(-1, param0, (byte) -107);
            param2.c(224, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "hq.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private hq() throws Throwable {
        throw new Error();
    }

    static {
    }
}
