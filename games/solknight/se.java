/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends ej {
    private mf field_u;
    private mf field_r;
    private mf field_v;
    private rl field_n;
    private boolean field_m;
    private int[] field_w;
    private int field_A;
    private int field_s;
    private boolean field_o;
    static String field_z;
    static String field_x;
    private rl field_y;
    private int field_p;
    private int[] field_t;
    private int field_l;
    private rl field_q;

    final synchronized void a(int param0, int param1, boolean param2, rl param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_34_0 = 0;
        mf stackIn_42_0 = null;
        mf stackIn_43_0 = null;
        mf stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        mf stackIn_50_0 = null;
        mf stackIn_51_0 = null;
        mf stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        mf stackOut_41_0 = null;
        mf stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        mf stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        mf stackOut_49_0 = null;
        mf stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        mf stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_o) {
                break L1;
              } else {
                if (!param2) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (-1 <= (this.field_s ^ -1)) {
                        break L3;
                      } else {
                        L4: {
                          if (null != this.field_n) {
                            this.field_r.a((byte) 97);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.field_n = param3;
                        if (param3 == null) {
                          break L2;
                        } else {
                          this.field_r.a(false, param3, true);
                          this.a((byte) -113, this.field_r, param4, param5);
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L5: {
                      if (null == this.field_q) {
                        break L5;
                      } else {
                        this.field_v.a((byte) 97);
                        break L5;
                      }
                    }
                    this.field_q = param3;
                    if (param3 != null) {
                      this.field_v.a(false, param3, true);
                      this.a((byte) -71, this.field_v, param4, param5);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L6: {
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (!param2) {
                stackOut_18_0 = this;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L6;
              } else {
                stackOut_17_0 = this;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L6;
              }
            }
            L7: {
              ((se) (this)).field_o = stackIn_19_1 != 0;
              if (param1 == 0) {
                break L7;
              } else {
                this.field_A = -21;
                break L7;
              }
            }
            if (this.field_n == param3) {
              this.field_s = param0;
              this.a((byte) -106, this.field_r, param4, param5);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (this.field_q == param3) {
                this.field_s = -param0;
                this.a((byte) -84, this.field_v, param4, param5);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L8: {
                  L9: {
                    if (null != this.field_n) {
                      break L9;
                    } else {
                      var7_int = 1;
                      if (var8 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (null == this.field_q) {
                      break L10;
                    } else {
                      L11: {
                        if (-524289 >= (this.field_l ^ -1)) {
                          stackOut_33_0 = 0;
                          stackIn_34_0 = stackOut_33_0;
                          break L11;
                        } else {
                          stackOut_32_0 = 1;
                          stackIn_34_0 = stackOut_32_0;
                          break L11;
                        }
                      }
                      var7_int = stackIn_34_0;
                      if (var8 == 0) {
                        break L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var7_int = 0;
                  break L8;
                }
                L12: {
                  L13: {
                    if (var7_int != 0) {
                      break L13;
                    } else {
                      L14: {
                        if (this.field_q == null) {
                          break L14;
                        } else {
                          this.field_v.a((byte) 97);
                          break L14;
                        }
                      }
                      L15: {
                        this.field_q = param3;
                        if (param3 != null) {
                          L16: {
                            stackOut_41_0 = this.field_v;
                            stackIn_43_0 = stackOut_41_0;
                            stackIn_42_0 = stackOut_41_0;
                            if (param2) {
                              stackOut_43_0 = (mf) ((Object) stackIn_43_0);
                              stackOut_43_1 = 0;
                              stackIn_44_0 = stackOut_43_0;
                              stackIn_44_1 = stackOut_43_1;
                              break L16;
                            } else {
                              stackOut_42_0 = (mf) ((Object) stackIn_42_0);
                              stackOut_42_1 = 1;
                              stackIn_44_0 = stackOut_42_0;
                              stackIn_44_1 = stackOut_42_1;
                              break L16;
                            }
                          }
                          ((mf) (Object) stackIn_44_0).a(stackIn_44_1 != 0, param3, true);
                          this.a((byte) -95, this.field_v, param4, param5);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      this.field_s = -param0;
                      if (var8 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L17: {
                    if (null == this.field_n) {
                      break L17;
                    } else {
                      this.field_r.a((byte) 97);
                      break L17;
                    }
                  }
                  L18: {
                    this.field_n = param3;
                    if (param3 == null) {
                      break L18;
                    } else {
                      L19: {
                        stackOut_49_0 = this.field_r;
                        stackIn_51_0 = stackOut_49_0;
                        stackIn_50_0 = stackOut_49_0;
                        if (param2) {
                          stackOut_51_0 = (mf) ((Object) stackIn_51_0);
                          stackOut_51_1 = 0;
                          stackIn_52_0 = stackOut_51_0;
                          stackIn_52_1 = stackOut_51_1;
                          break L19;
                        } else {
                          stackOut_50_0 = (mf) ((Object) stackIn_50_0);
                          stackOut_50_1 = 1;
                          stackIn_52_0 = stackOut_50_0;
                          stackIn_52_1 = stackOut_50_1;
                          break L19;
                        }
                      }
                      ((mf) (Object) stackIn_52_0).a(stackIn_52_1 != 0, param3, true);
                      this.a((byte) -84, this.field_r, param4, param5);
                      break L18;
                    }
                  }
                  this.field_s = param0;
                  break L12;
                }
                decompiledRegionSelector0 = 3;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) (var7);
            stackOut_55_1 = new StringBuilder().append("se.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param3 == null) {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L20;
            } else {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L20;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ',' + param4 + ',' + param5 + ')');
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

    final synchronized void b(int param0, int param1) {
        if (param0 != -15705) {
            field_z = (String) null;
        }
        this.field_p = param1;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = SolKnight.field_L ? 1 : 0;
          if ((this.field_l ^ -1) >= -1) {
            if (1048576 > this.field_l) {
              if (null == this.field_q) {
                break L0;
              } else {
                this.field_v.a(param0);
                break L0;
              }
            } else {
              if (1048576 <= this.field_l) {
                break L0;
              } else {
                if (null == this.field_q) {
                  break L0;
                } else {
                  this.field_v.a(param0);
                  break L0;
                }
              }
            }
          } else {
            if (1048576 > this.field_l) {
              if (null == this.field_q) {
                break L0;
              } else {
                this.field_v.a(param0);
                break L0;
              }
            } else {
              if (1048576 <= this.field_l) {
                break L0;
              } else {
                if (null == this.field_q) {
                  break L0;
                } else {
                  this.field_v.a(param0);
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (this.field_A <= 0) {
            break L1;
          } else {
            if (null != this.field_y) {
              this.field_u.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (!this.field_o) {
            break L2;
          } else {
            L3: {
              L4: {
                if (this.field_s <= 0) {
                  break L4;
                } else {
                  if (!this.field_r.d(144)) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (-1 >= (this.field_s ^ -1)) {
                break L2;
              } else {
                if (this.field_v.d(144)) {
                  break L2;
                } else {
                  this.field_o = false;
                  this.field_s = -this.field_s;
                  this.field_q = null;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
            }
            this.field_o = false;
            this.field_s = -this.field_s;
            this.field_n = null;
            break L2;
          }
        }
        L5: {
          if (this.field_s == 0) {
            break L5;
          } else {
            L6: {
              this.field_l = this.field_l + this.field_s * param0;
              if ((this.field_l ^ -1) <= -1048577) {
                break L6;
              } else {
                if (0 < this.field_l) {
                  break L5;
                } else {
                  this.field_l = 0;
                  if (!this.field_o) {
                    this.field_s = 0;
                    if (!this.field_m) {
                      L7: {
                        if (null != this.field_n) {
                          this.field_r.a((byte) 97);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      this.field_n = null;
                      if (var3 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
              }
            }
            this.field_l = 1048576;
            if (this.field_o) {
              break L5;
            } else {
              this.field_s = 0;
              if (this.field_m) {
                break L5;
              } else {
                L8: {
                  if (null == this.field_q) {
                    break L8;
                  } else {
                    this.field_v.a((byte) 97);
                    break L8;
                  }
                }
                this.field_q = null;
                break L5;
              }
            }
          }
        }
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_33_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (-1 <= (this.field_p ^ -1)) {
              this.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!this.field_o) {
                  break L1;
                } else {
                  L2: {
                    if (this.field_s <= 0) {
                      break L2;
                    } else {
                      if (this.field_r.d(144)) {
                        break L2;
                      } else {
                        this.field_n = null;
                        this.field_s = -this.field_s;
                        this.field_o = false;
                        if (var11 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  if ((this.field_s ^ -1) <= -1) {
                    break L1;
                  } else {
                    if (this.field_v.d(144)) {
                      break L1;
                    } else {
                      this.field_q = null;
                      this.field_o = false;
                      this.field_s = -this.field_s;
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = (this.field_l >> 263738636) * this.field_p / 256;
                var5 = this.field_p + -var4_int;
                if (this.field_s != 0) {
                  L4: {
                    this.field_l = this.field_l + param2 * this.field_s;
                    if ((this.field_l ^ -1) <= -1048577) {
                      break L4;
                    } else {
                      if (0 >= this.field_l) {
                        this.field_l = 0;
                        if (this.field_o) {
                          break L3;
                        } else {
                          this.field_s = 0;
                          if (this.field_m) {
                            break L3;
                          } else {
                            L5: {
                              if (this.field_n != null) {
                                this.field_r.a((byte) 97);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            this.field_n = null;
                            if (var11 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  this.field_l = 1048576;
                  if (this.field_o) {
                    break L3;
                  } else {
                    this.field_s = 0;
                    if (this.field_m) {
                      break L3;
                    } else {
                      L6: {
                        if (this.field_q != null) {
                          this.field_v.a((byte) 97);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      this.field_q = null;
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              L7: {
                if (!gj.field_u) {
                  stackOut_32_0 = param2;
                  stackIn_33_0 = stackOut_32_0;
                  break L7;
                } else {
                  stackOut_31_0 = param2 << -76864383;
                  stackIn_33_0 = stackOut_31_0;
                  break L7;
                }
              }
              L8: {
                var6 = stackIn_33_0;
                if (this.field_A >= 256) {
                  break L8;
                } else {
                  L9: {
                    if (null != this.field_n) {
                      break L9;
                    } else {
                      if (this.field_q == null) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (-257 == (var4_int ^ -1)) {
                      break L10;
                    } else {
                      L11: {
                        if (var5 != 256) {
                          break L11;
                        } else {
                          this.field_v.a(param0, param1, param2);
                          if (var11 == 0) {
                            break L8;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L12: {
                        L13: {
                          L14: {
                            if (this.field_w == null) {
                              break L14;
                            } else {
                              if (this.field_w.length >= var6) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          this.field_w = new int[var6];
                          this.field_t = new int[var6];
                          if (var11 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                        fk.a(this.field_w, 0, var6);
                        fk.a(this.field_t, 0, var6);
                        break L12;
                      }
                      L15: {
                        this.field_r.a(this.field_w, 0, param2);
                        this.field_v.a(this.field_t, 0, param2);
                        if (gj.field_u) {
                          param1 = param1 << 1;
                          stackOut_49_0 = param1 << 1;
                          stackIn_50_0 = stackOut_49_0;
                          break L15;
                        } else {
                          stackOut_48_0 = param1;
                          stackIn_50_0 = stackOut_48_0;
                          break L15;
                        }
                      }
                      var7 = stackIn_50_0;
                      var8 = 0;
                      L16: while (true) {
                        if (var6 <= var8) {
                          if (var11 == 0) {
                            break L8;
                          } else {
                            break L10;
                          }
                        } else {
                          param0[var7 + var8] = param0[var7 + var8] + (this.field_t[var8] * var5 + this.field_w[var8] * var4_int >> -450835704);
                          var8++;
                          if (var11 != 0) {
                            break L8;
                          } else {
                            continue L16;
                          }
                        }
                      }
                    }
                  }
                  this.field_r.a(param0, param1, param2);
                  break L8;
                }
              }
              L17: {
                if (this.field_y == null) {
                  break L17;
                } else {
                  if (0 == this.field_A) {
                    break L17;
                  } else {
                    L18: {
                      L19: {
                        L20: {
                          if (null == this.field_w) {
                            break L20;
                          } else {
                            if (this.field_w.length >= var6) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        this.field_w = new int[var6];
                        this.field_t = new int[var6];
                        if (var11 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                      fk.a(this.field_w, 0, var6);
                      break L18;
                    }
                    L21: {
                      this.field_u.a(this.field_w, 0, param2);
                      if (!gj.field_u) {
                        stackOut_67_0 = param1;
                        stackIn_68_0 = stackOut_67_0;
                        break L21;
                      } else {
                        param1 = param1 << 1;
                        stackOut_66_0 = param1 << 1;
                        stackIn_68_0 = stackOut_66_0;
                        break L21;
                      }
                    }
                    var7 = stackIn_68_0;
                    var8 = this.field_A * this.field_p / 256;
                    var9 = this.field_p + -var8;
                    var10 = 0;
                    L22: while (true) {
                      if (var6 <= var10) {
                        break L17;
                      } else {
                        param0[var7 - -var10] = param0[var10 + var7] * var9 + this.field_w[var10] * var8 >> 15817128;
                        var10++;
                        if (var11 != 0) {
                          break L17;
                        } else {
                          continue L22;
                        }
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
          L23: {
            var4 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) (var4);
            stackOut_74_1 = new StringBuilder().append("se.AA(");
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param0 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L23;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L23;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, mf param1, int param2, int param3) {
        ej discarded$2 = null;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.b(param3, -1, -129);
              param1.b(param2, (byte) -110);
              if (param0 <= -61) {
                break L1;
              } else {
                discarded$2 = this.b();
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
            stackOut_3_1 = new StringBuilder().append("se.B(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ej b() {
        return null;
    }

    final ej a() {
        return null;
    }

    public static void b(boolean param0) {
        field_x = null;
        field_z = null;
        if (param0) {
            field_x = (String) null;
        }
    }

    private se() throws Throwable {
        throw new Error();
    }

    final synchronized int d() {
        return 2;
    }

    static {
        field_z = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_x = "Invalid password.";
    }
}
