/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends ew {
    private int field_r;
    private int field_j;
    static String field_z;
    static int field_p;
    private bc field_w;
    private bg field_t;
    private int field_B;
    private byte[] field_C;
    static rg field_D;
    private bp field_x;
    static String field_k;
    static int field_h;
    static int[][] field_y;
    private bc field_f;
    private byte[] field_g;
    private jm field_q;
    private ks field_n;
    private vo field_A;
    private int field_s;
    private at field_i;
    private boolean field_o;
    private boolean field_u;
    private at field_m;
    private boolean field_l;
    private long field_v;

    final void b(int param0) {
        ks discarded$6 = null;
        ks discarded$7 = null;
        ks discarded$8 = null;
        ks discarded$9 = null;
        ks discarded$10 = null;
        ks discarded$11 = null;
        ks var2 = null;
        int var2_int = 0;
        tc var3 = null;
        int var4 = 0;
        int var5 = 0;
        tc var6 = null;
        tc var7 = null;
        int stackIn_9_0 = 0;
        byte stackIn_9_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_44_0 = 0;
        byte stackIn_44_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackIn_130_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_134_0 = 0;
        int stackIn_134_1 = 0;
        int stackOut_8_0 = 0;
        byte stackOut_8_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_136_0 = 0;
        int stackOut_136_1 = 0;
        int stackOut_132_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_43_0 = 0;
        byte stackOut_43_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_67_0 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == -26132) {
          L0: {
            if (this.field_i == null) {
              break L0;
            } else {
              if (null != this.a(param0 ^ -10433)) {
                L1: {
                  if (!this.field_o) {
                    break L1;
                  } else {
                    var2_int = 1;
                    var3 = this.field_i.e((byte) 101);
                    L2: while (true) {
                      L3: {
                        L4: {
                          L5: {
                            if (var3 == null) {
                              break L5;
                            } else {
                              var4 = (int)var3.field_i;
                              stackOut_8_0 = 0;
                              stackOut_8_1 = this.field_C[var4];
                              stackIn_18_0 = stackOut_8_0;
                              stackIn_18_1 = stackOut_8_1;
                              stackIn_9_0 = stackOut_8_0;
                              stackIn_9_1 = stackOut_8_1;
                              if (var5 != 0) {
                                L6: while (true) {
                                  if (stackIn_18_0 <= stackIn_18_1) {
                                    break L4;
                                  } else {
                                    stackOut_19_0 = this.field_q.field_p[this.field_s] ^ -1;
                                    stackIn_34_0 = stackOut_19_0;
                                    stackIn_20_0 = stackOut_19_0;
                                    if (var5 != 0) {
                                      break L3;
                                    } else {
                                      L7: {
                                        L8: {
                                          if (stackIn_20_0 != -1) {
                                            break L8;
                                          } else {
                                            this.field_s = this.field_s + 1;
                                            if (var5 == 0) {
                                              break L7;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        L9: {
                                          if (250 <= this.field_A.field_b) {
                                            var2_int = 0;
                                            if (var5 == 0) {
                                              break L4;
                                            } else {
                                              break L9;
                                            }
                                          } else {
                                            break L9;
                                          }
                                        }
                                        L10: {
                                          if (-1 == (this.field_C[this.field_s] ^ -1)) {
                                            discarded$6 = this.a(1, this.field_s, 1);
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        }
                                        L11: {
                                          if ((this.field_C[this.field_s] ^ -1) == -1) {
                                            var6 = new tc();
                                            var6.field_i = (long)this.field_s;
                                            var2_int = 0;
                                            this.field_i.a((byte) -119, var6);
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                        this.field_s = this.field_s + 1;
                                        if (var5 == 0) {
                                          break L7;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      stackOut_17_0 = this.field_s ^ -1;
                                      stackOut_17_1 = this.field_q.field_p.length ^ -1;
                                      stackIn_18_0 = stackOut_17_0;
                                      stackIn_18_1 = stackOut_17_1;
                                      continue L6;
                                    }
                                  }
                                }
                              } else {
                                L12: {
                                  if (stackIn_9_0 != stackIn_9_1) {
                                    break L12;
                                  } else {
                                    discarded$7 = this.a(1, var4, 1);
                                    break L12;
                                  }
                                }
                                L13: {
                                  L14: {
                                    if (this.field_C[var4] == 0) {
                                      break L14;
                                    } else {
                                      var3.d(-115);
                                      if (var5 == 0) {
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  var2_int = 0;
                                  break L13;
                                }
                                var3 = this.field_i.a((byte) 123);
                                if (var5 == 0) {
                                  continue L2;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          L15: while (true) {
                            stackOut_136_0 = this.field_s ^ -1;
                            stackOut_136_1 = this.field_q.field_p.length ^ -1;
                            stackIn_134_0 = stackOut_136_0;
                            stackIn_134_1 = stackOut_136_1;
                            if (stackIn_134_0 <= stackIn_134_1) {
                              break L4;
                            } else {
                              stackOut_132_0 = this.field_q.field_p[this.field_s] ^ -1;
                              stackIn_34_0 = stackOut_132_0;
                              stackIn_133_0 = stackOut_132_0;
                              if (var5 != 0) {
                                break L3;
                              } else {
                                stackOut_133_0 = stackIn_133_0;
                                stackIn_130_0 = stackOut_133_0;
                                L16: {
                                  if (stackIn_130_0 != -1) {
                                    break L16;
                                  } else {
                                    this.field_s = this.field_s + 1;
                                    if (var5 == 0) {
                                      continue L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                L17: {
                                  if (250 <= this.field_A.field_b) {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L4;
                                    } else {
                                      break L17;
                                    }
                                  } else {
                                    break L17;
                                  }
                                }
                                L18: {
                                  if (-1 == (this.field_C[this.field_s] ^ -1)) {
                                    discarded$8 = this.a(1, this.field_s, 1);
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                L19: {
                                  if ((this.field_C[this.field_s] ^ -1) == -1) {
                                    var6 = new tc();
                                    var6.field_i = (long)this.field_s;
                                    var2_int = 0;
                                    this.field_i.a((byte) -119, var6);
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                this.field_s = this.field_s + 1;
                                if (var5 == 0) {
                                  continue L15;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        stackOut_33_0 = var2_int;
                        stackIn_34_0 = stackOut_33_0;
                        break L3;
                      }
                      L20: {
                        if (stackIn_34_0 != 0) {
                          this.field_s = 0;
                          this.field_o = false;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                L21: {
                  if (this.field_u) {
                    break L21;
                  } else {
                    this.field_i = null;
                    if (var5 == 0) {
                      break L0;
                    } else {
                      break L21;
                    }
                  }
                }
                var2_int = 1;
                var3 = this.field_i.e((byte) 92);
                L22: while (true) {
                  L23: {
                    L24: {
                      L25: {
                        if (var3 == null) {
                          break L25;
                        } else {
                          var4 = (int)var3.field_i;
                          stackOut_43_0 = 1;
                          stackOut_43_1 = this.field_C[var4];
                          stackIn_53_0 = stackOut_43_0;
                          stackIn_53_1 = stackOut_43_1;
                          stackIn_44_0 = stackOut_43_0;
                          stackIn_44_1 = stackOut_43_1;
                          if (var5 != 0) {
                            L26: while (true) {
                              if (stackIn_53_0 >= stackIn_53_1) {
                                break L24;
                              } else {
                                stackOut_54_0 = 0;
                                stackIn_68_0 = stackOut_54_0;
                                stackIn_55_0 = stackOut_54_0;
                                if (var5 != 0) {
                                  break L23;
                                } else {
                                  L27: {
                                    L28: {
                                      if (stackIn_55_0 == this.field_q.field_p[this.field_s]) {
                                        this.field_s = this.field_s + 1;
                                        if (var5 == 0) {
                                          break L27;
                                        } else {
                                          break L28;
                                        }
                                      } else {
                                        break L28;
                                      }
                                    }
                                    L29: {
                                      if (this.field_x.a((byte) 51)) {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L24;
                                        } else {
                                          break L29;
                                        }
                                      } else {
                                        break L29;
                                      }
                                    }
                                    L30: {
                                      if ((this.field_C[this.field_s] ^ -1) == -2) {
                                        break L30;
                                      } else {
                                        discarded$9 = this.a(1, this.field_s, 2);
                                        break L30;
                                      }
                                    }
                                    L31: {
                                      if (this.field_C[this.field_s] != 1) {
                                        var7 = new tc();
                                        var7.field_i = (long)this.field_s;
                                        this.field_i.a((byte) -119, var7);
                                        var2_int = 0;
                                        break L31;
                                      } else {
                                        break L31;
                                      }
                                    }
                                    this.field_s = this.field_s + 1;
                                    if (var5 == 0) {
                                      break L27;
                                    } else {
                                      break L24;
                                    }
                                  }
                                  stackOut_52_0 = this.field_q.field_p.length ^ -1;
                                  stackOut_52_1 = this.field_s ^ -1;
                                  stackIn_53_0 = stackOut_52_0;
                                  stackIn_53_1 = stackOut_52_1;
                                  continue L26;
                                }
                              }
                            }
                          } else {
                            L32: {
                              if (stackIn_44_0 == stackIn_44_1) {
                                break L32;
                              } else {
                                discarded$10 = this.a(1, var4, 2);
                                break L32;
                              }
                            }
                            L33: {
                              L34: {
                                if (-2 != (this.field_C[var4] ^ -1)) {
                                  break L34;
                                } else {
                                  var3.d(param0 ^ 26237);
                                  if (var5 == 0) {
                                    break L33;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                              var2_int = 0;
                              break L33;
                            }
                            var3 = this.field_i.a((byte) 123);
                            if (var5 == 0) {
                              continue L22;
                            } else {
                              break L25;
                            }
                          }
                        }
                      }
                      L35: while (true) {
                        stackOut_111_0 = this.field_q.field_p.length ^ -1;
                        stackOut_111_1 = this.field_s ^ -1;
                        stackIn_109_0 = stackOut_111_0;
                        stackIn_109_1 = stackOut_111_1;
                        if (stackIn_109_0 >= stackIn_109_1) {
                          break L24;
                        } else {
                          stackOut_107_0 = 0;
                          stackIn_68_0 = stackOut_107_0;
                          stackIn_108_0 = stackOut_107_0;
                          if (var5 != 0) {
                            break L23;
                          } else {
                            stackOut_108_0 = stackIn_108_0;
                            stackIn_105_0 = stackOut_108_0;
                            L36: {
                              if (stackIn_105_0 == this.field_q.field_p[this.field_s]) {
                                this.field_s = this.field_s + 1;
                                if (var5 == 0) {
                                  continue L35;
                                } else {
                                  break L36;
                                }
                              } else {
                                break L36;
                              }
                            }
                            L37: {
                              if (this.field_x.a((byte) 51)) {
                                var2_int = 0;
                                if (var5 == 0) {
                                  break L24;
                                } else {
                                  break L37;
                                }
                              } else {
                                break L37;
                              }
                            }
                            L38: {
                              if ((this.field_C[this.field_s] ^ -1) == -2) {
                                break L38;
                              } else {
                                discarded$11 = this.a(1, this.field_s, 2);
                                break L38;
                              }
                            }
                            L39: {
                              if (this.field_C[this.field_s] != 1) {
                                var7 = new tc();
                                var7.field_i = (long)this.field_s;
                                this.field_i.a((byte) -119, var7);
                                var2_int = 0;
                                break L39;
                              } else {
                                break L39;
                              }
                            }
                            this.field_s = this.field_s + 1;
                            if (var5 == 0) {
                              continue L35;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                    }
                    stackOut_67_0 = var2_int;
                    stackIn_68_0 = stackOut_67_0;
                    break L23;
                  }
                  if (stackIn_68_0 == 0) {
                    break L0;
                  } else {
                    this.field_u = false;
                    this.field_s = 0;
                    break L0;
                  }
                }
              } else {
                return;
              }
            }
          }
          L40: {
            if (!this.field_l) {
              break L40;
            } else {
              if ((this.field_v ^ -1L) >= (vi.b(param0 + 26060) ^ -1L)) {
                var2 = (ks) ((Object) this.field_t.b(1));
                L41: while (true) {
                  L42: {
                    L43: {
                      if (var2 == null) {
                        break L43;
                      } else {
                        if (var5 != 0) {
                          break L42;
                        } else {
                          L44: {
                            if (var2.field_x) {
                              break L44;
                            } else {
                              L45: {
                                if (var2.field_w) {
                                  break L45;
                                } else {
                                  var2.field_w = true;
                                  if (var5 == 0) {
                                    break L44;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                              if (!var2.field_z) {
                                throw new RuntimeException();
                              } else {
                                var2.d(-128);
                                break L44;
                              }
                            }
                          }
                          var2 = (ks) ((Object) this.field_t.b((byte) 127));
                          if (var5 == 0) {
                            continue L41;
                          } else {
                            break L43;
                          }
                        }
                      }
                    }
                    this.field_v = 1000L + vi.b(65);
                    break L42;
                  }
                  break L40;
                }
              } else {
                break L40;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final jm a(int param0) {
        nh discarded$1 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_q == null) {
          L0: {
            if (null == this.field_n) {
              if (!this.field_x.d(101)) {
                this.field_n = (ks) ((Object) this.field_x.a(this.field_r, false, 255, (byte) 0, true));
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_n.field_x) {
            L1: {
              var7 = this.field_n.d((byte) -119);
              var6 = var7;
              var5 = var6;
              var2 = var5;
              if (!(this.field_n instanceof nh)) {
                try {
                  L2: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      this.field_q = new jm(var7, this.field_B, this.field_g);
                      break L2;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    this.field_x.b((byte) 4);
                    this.field_q = null;
                    if (this.field_x.d(param0 + -20152)) {
                      break L3;
                    } else {
                      this.field_n = (ks) ((Object) this.field_x.a(this.field_r, false, 255, (byte) 0, true));
                      if (var4 != 0) {
                        break L3;
                      } else {
                        return null;
                      }
                    }
                  }
                  this.field_n = null;
                  return null;
                }
                if (null != this.field_f) {
                  discarded$1 = this.field_A.a(this.field_r, this.field_f, false, var7);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                try {
                  L4: {
                    if (var5 != null) {
                      this.field_q = new jm(var7, this.field_B, this.field_g);
                      if ((this.field_j ^ -1) != (this.field_q.field_c ^ -1)) {
                        throw new RuntimeException();
                      } else {
                        break L4;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var3 = decompiledCaughtException;
                    this.field_q = null;
                    if (!this.field_x.d(92)) {
                      break L5;
                    } else {
                      this.field_n = null;
                      if (var4 != 0) {
                        break L5;
                      } else {
                        return null;
                      }
                    }
                  }
                  this.field_n = (ks) ((Object) this.field_x.a(this.field_r, false, 255, (byte) 0, true));
                  return null;
                }
                break L1;
              }
            }
            L6: {
              this.field_n = null;
              if (null != this.field_w) {
                this.field_C = new byte[this.field_q.field_i];
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param0 == 20179) {
                break L7;
              } else {
                field_k = (String) null;
                break L7;
              }
            }
            return this.field_q;
          } else {
            return null;
          }
        } else {
          return this.field_q;
        }
    }

    private final ks a(int param0, int param1, int param2) {
        nh discarded$1 = null;
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        ks var11 = null;
        byte[] var12 = null;
        byte[] var17 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        Object stackIn_62_0 = null;
        byte stackIn_80_0 = 0;
        byte stackIn_80_1 = 0;
        byte stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_79_0 = 0;
        byte stackOut_79_1 = 0;
        byte stackOut_93_0 = 0;
        int stackOut_93_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        Object stackOut_61_0 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 1) {
          L0: {
            var11 = (ks) ((Object) this.field_t.a(-67, (long)param1));
            var4 = var11;
            if (var11 == null) {
              break L0;
            } else {
              if (0 != param2) {
                break L0;
              } else {
                if (var11.field_z) {
                  break L0;
                } else {
                  if (var11.field_x) {
                    var11.d(35);
                    var4 = null;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          L1: {
            if (var4 != null) {
              break L1;
            } else {
              L2: {
                if ((param2 ^ -1) == -1) {
                  L3: {
                    if (null == this.field_w) {
                      break L3;
                    } else {
                      if (0 == (this.field_C[param1] ^ -1)) {
                        break L3;
                      } else {
                        var4 = this.field_A.a(param1, this.field_w, 86);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (!this.field_x.d(64)) {
                    var4 = this.field_x.a(param1, false, this.field_r, (byte) 2, true);
                    if (var10 == 0) {
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                } else {
                  L4: {
                    if (1 != param2) {
                      break L4;
                    } else {
                      if (this.field_w != null) {
                        var4 = this.field_A.a((byte) 56, param1, this.field_w);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  if (-3 != (param2 ^ -1)) {
                    throw new RuntimeException();
                  } else {
                    if (this.field_w != null) {
                      if (this.field_C[param1] == -1) {
                        if (!this.field_x.a((byte) 51)) {
                          var4 = this.field_x.a(param1, false, this.field_r, (byte) 2, false);
                          if (var10 == 0) {
                            break L2;
                          } else {
                            return null;
                          }
                        } else {
                          return null;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              }
              this.field_t.a((tc) (var4), (long)param1, 108);
              break L1;
            }
          }
          if (!((ks) (var4)).field_x) {
            var17 = ((ks) (var4)).d((byte) -86);
            var12 = var17;
            var5 = var12;
            if (!(var4 instanceof nh)) {
              try {
                L5: {
                  L6: {
                    if (var5 == null) {
                      break L6;
                    } else {
                      if ((var17.length ^ -1) < -3) {
                        ab.field_b.reset();
                        ab.field_b.update(var5, 0, var17.length + -2);
                        var6_int = (int)ab.field_b.getValue();
                        if (var6_int == this.field_q.field_e[param1]) {
                          L7: {
                            if (null == this.field_q.field_v) {
                              break L7;
                            } else {
                              if (this.field_q.field_v[param1] == null) {
                                break L7;
                              } else {
                                var28 = this.field_q.field_v[param1];
                                var29 = ua.a(-18423, -2 + var17.length, var17, 0);
                                var9 = 0;
                                L8: while (true) {
                                  if ((var9 ^ -1) <= -65) {
                                    break L7;
                                  } else {
                                    stackOut_79_0 = var28[var9];
                                    stackOut_79_1 = var29[var9];
                                    stackIn_94_0 = stackOut_79_0;
                                    stackIn_94_1 = stackOut_79_1;
                                    stackIn_80_0 = stackOut_79_0;
                                    stackIn_80_1 = stackOut_79_1;
                                    if (var10 != 0) {
                                      decompiledRegionSelector0 = 0;
                                      break L5;
                                    } else {
                                      if (stackIn_80_0 != stackIn_80_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L8;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          this.field_x.field_q = 0;
                          this.field_x.field_p = 0;
                          decompiledRegionSelector0 = 1;
                          break L5;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L9: {
                  var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                  this.field_x.b((byte) 4);
                  ((ks) (var4)).d(-109);
                  if (((ks) (var4)).field_z) {
                    if (!this.field_x.d(59)) {
                      var4 = this.field_x.a(param1, false, this.field_r, (byte) 2, true);
                      this.field_t.a((tc) (var4), (long)param1, 120);
                      break L9;
                    } else {
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
                return null;
              }
              L10: {
                L11: {
                  if (decompiledRegionSelector0 == 0) {
                    break L11;
                  } else {
                    var5[-2 + var17.length] = (byte)(this.field_q.field_t[param1] >>> -1066328536);
                    var5[-1 + var17.length] = (byte)this.field_q.field_t[param1];
                    if (null == this.field_w) {
                      break L10;
                    } else {
                      discarded$1 = this.field_A.a(param1, this.field_w, false, var17);
                      stackOut_93_0 = this.field_C[param1];
                      stackOut_93_1 = 1;
                      stackIn_94_0 = stackOut_93_0;
                      stackIn_94_1 = stackOut_93_1;
                      break L11;
                    }
                  }
                }
                if (stackIn_94_0 != stackIn_94_1) {
                  this.field_C[param1] = (byte) 1;
                  break L10;
                } else {
                  break L10;
                }
              }
              L12: {
                if (((ks) (var4)).field_z) {
                  break L12;
                } else {
                  ((ks) (var4)).d(105);
                  break L12;
                }
              }
              return (ks) (var4);
            } else {
              try {
                L13: {
                  L14: {
                    if (var5 == null) {
                      break L14;
                    } else {
                      if (-3 <= (var17.length ^ -1)) {
                        break L14;
                      } else {
                        ab.field_b.reset();
                        ab.field_b.update(var5, 0, -2 + var17.length);
                        var6_int = (int)ab.field_b.getValue();
                        if (var6_int != this.field_q.field_e[param1]) {
                          throw new RuntimeException();
                        } else {
                          L15: {
                            L16: {
                              if (this.field_q.field_v == null) {
                                break L16;
                              } else {
                                if (null != this.field_q.field_v[param1]) {
                                  var26 = this.field_q.field_v[param1];
                                  var27 = ua.a(param0 ^ -18424, -2 + var17.length, var17, 0);
                                  var9 = 0;
                                  L17: while (true) {
                                    if (var9 >= 64) {
                                      break L16;
                                    } else {
                                      stackOut_47_0 = var26[var9] ^ -1;
                                      stackOut_47_1 = var27[var9] ^ -1;
                                      stackIn_52_0 = stackOut_47_0;
                                      stackIn_52_1 = stackOut_47_1;
                                      stackIn_48_0 = stackOut_47_0;
                                      stackIn_48_1 = stackOut_47_1;
                                      if (var10 != 0) {
                                        break L15;
                                      } else {
                                        if (stackIn_48_0 == stackIn_48_1) {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L17;
                                          } else {
                                            break L16;
                                          }
                                        } else {
                                          throw new RuntimeException();
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L16;
                                }
                              }
                            }
                            stackOut_51_0 = 255 & var5[var17.length + -1];
                            stackOut_51_1 = 65280 & var5[-2 + var17.length] << -2019534360;
                            stackIn_52_0 = stackOut_51_0;
                            stackIn_52_1 = stackOut_51_1;
                            break L15;
                          }
                          var7 = stackIn_52_0 + stackIn_52_1;
                          if ((65535 & this.field_q.field_t[param1] ^ -1) == (var7 ^ -1)) {
                            L18: {
                              if ((this.field_C[param1] ^ -1) != -2) {
                                L19: {
                                  if (-1 == (this.field_C[param1] ^ -1)) {
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                this.field_C[param1] = (byte) 1;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L20: {
                              if (!((ks) (var4)).field_z) {
                                ((ks) (var4)).d(param0 ^ -99);
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            stackOut_61_0 = var4;
                            stackIn_62_0 = stackOut_61_0;
                            break L13;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L21: {
                  var6 = (Exception) (Object) decompiledCaughtException;
                  this.field_C[param1] = (byte)-1;
                  ((ks) (var4)).d(116);
                  if (((ks) (var4)).field_z) {
                    if (!this.field_x.d(18)) {
                      var4 = this.field_x.a(param1, false, this.field_r, (byte) 2, true);
                      this.field_t.a((tc) (var4), (long)param1, 98);
                      break L21;
                    } else {
                      return null;
                    }
                  } else {
                    break L21;
                  }
                }
                return null;
              }
              return (ks) ((Object) stackIn_62_0);
            }
          } else {
            return null;
          }
        } else {
          return (ks) null;
        }
    }

    final static void a(byte param0, int param1) {
        if (param0 > -43) {
            bm.e(41);
        }
    }

    final byte[] a(int param0, int param1) {
        ks var3 = this.a(1, param0, 0);
        if (var3 == null) {
            return null;
        }
        if (param1 != 4) {
            this.b(-9);
        }
        byte[] var4 = var3.d((byte) -113);
        var3.d(121);
        return var4;
    }

    final int b(int param0, int param1) {
        ks var3 = (ks) ((Object) this.field_t.a(param0 + -5958, (long)param1));
        if (var3 != null) {
            return var3.g(0);
        }
        if (param0 != 5926) {
            return 68;
        }
        return 0;
    }

    public static void e(int param0) {
        field_k = null;
        field_D = null;
        if (param0 > -33) {
            return;
        }
        field_z = null;
        field_y = (int[][]) null;
    }

    final void c(int param0) {
        jm discarded$0 = null;
        if (!(this.field_w != null)) {
            return;
        }
        this.field_u = true;
        if (param0 != 31637) {
            discarded$0 = this.a(-26);
        }
        if (!(null != this.field_i)) {
            this.field_i = new at();
        }
    }

    final void d(int param0) {
        ks discarded$4 = null;
        ks discarded$5 = null;
        tc var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_i != null) {
          if (null == this.a(20179)) {
            return;
          } else {
            var3 = 1 % ((72 - param0) / 39);
            var2 = this.field_m.e((byte) 120);
            L0: while (true) {
              L1: {
                if (var2 == null) {
                  break L1;
                } else {
                  var4 = (int)var2.field_i;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        L4: {
                          if (-1 < (var4 ^ -1)) {
                            break L4;
                          } else {
                            if ((var4 ^ -1) <= (this.field_q.field_i ^ -1)) {
                              break L4;
                            } else {
                              if ((this.field_q.field_p[var4] ^ -1) != -1) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        var2.d(-111);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                      L5: {
                        if (0 != this.field_C[var4]) {
                          break L5;
                        } else {
                          discarded$4 = this.a(1, var4, 1);
                          break L5;
                        }
                      }
                      L6: {
                        if ((this.field_C[var4] ^ -1) != 0) {
                          break L6;
                        } else {
                          discarded$5 = this.a(1, var4, 2);
                          break L6;
                        }
                      }
                      if (1 != this.field_C[var4]) {
                        break L2;
                      } else {
                        var2.d(-121);
                        break L2;
                      }
                    }
                    var2 = this.field_m.a((byte) 123);
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    bm(int param0, bc param1, bc param2, bp param3, vo param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        this.field_t = new bg(16);
        this.field_s = 0;
        this.field_m = new at();
        this.field_v = 0L;
        try {
          L0: {
            L1: {
              L2: {
                this.field_r = param0;
                this.field_w = param1;
                if (this.field_w != null) {
                  break L2;
                } else {
                  this.field_o = false;
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_o = true;
              this.field_i = new at();
              break L1;
            }
            L3: {
              this.field_B = param5;
              this.field_j = param7;
              this.field_g = param6;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              ((bm) (this)).field_l = stackIn_7_1 != 0;
              this.field_f = param2;
              this.field_x = param3;
              this.field_A = param4;
              if (null == this.field_f) {
                break L4;
              } else {
                this.field_n = (ks) ((Object) this.field_A.a(this.field_r, this.field_f, 114));
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var10);
            stackOut_10_1 = new StringBuilder().append("bm.<init>(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_y = new int[][]{new int[]{0, -10}, new int[]{-20, 0}, new int[]{20, 0}, new int[]{0, 10}};
        field_z = "Connection lost - attempting to reconnect";
        field_k = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
