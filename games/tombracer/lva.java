/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lva extends ci {
    private short[] field_r;
    int field_w;
    int field_n;
    boolean field_s;
    private byte[] field_p;
    int field_z;
    static nh[] field_m;
    static String field_o;
    static String field_v;
    static String field_y;
    static jea field_t;
    int field_x;
    int field_u;
    private short[] field_q;

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var3 = TombRacer.field_G ? 1 : 0;
            if (param0 < this.field_x) {
              this.field_q = new short[this.field_n];
              this.field_r = new short[this.field_n];
              var2 = 0;
              L2: while (true) {
                if ((this.field_n ^ -1) >= (var2 ^ -1)) {
                  break L1;
                } else {
                  this.field_q[var2] = (short)(int)(Math.pow((double)((float)this.field_x / 4096.0f), (double)var2) * 4096.0);
                  this.field_r[var2] = (short)(int)Math.pow(2.0, (double)var2);
                  var2++;
                  if (var3 != 0) {
                    break L0;
                  } else {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            } else {
              if (null == this.field_q) {
                break L1;
              } else {
                if ((this.field_q.length ^ -1) != (this.field_n ^ -1)) {
                  break L1;
                } else {
                  this.field_r = new short[this.field_n];
                  var2 = 0;
                  L3: while (true) {
                    L4: {
                      if ((this.field_n ^ -1) >= (var2 ^ -1)) {
                        break L4;
                      } else {
                        this.field_r[var2] = (short)(int)Math.pow(2.0, (double)var2);
                        var2++;
                        if (var3 != 0) {
                          break L1;
                        } else {
                          if (var3 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var3 == 0) {
                      break L1;
                    } else {
                      this.field_q = new short[this.field_n];
                      this.field_r = new short[this.field_n];
                      var2 = 0;
                      L5: while (true) {
                        if ((this.field_n ^ -1) >= (var2 ^ -1)) {
                          break L1;
                        } else {
                          this.field_q[var2] = (short)(int)(Math.pow((double)((float)this.field_x / 4096.0f), (double)var2) * 4096.0);
                          this.field_r[var2] = (short)(int)Math.pow(2.0, (double)var2);
                          var2++;
                          if (var3 != 0) {
                            break L0;
                          } else {
                            if (var3 == 0) {
                              continue L5;
                            } else {
                              break L0;
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
          break L0;
        }
    }

    final void a(byte param0, uia param1, int param2) {
        int dupTemp$1 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            L9: {
                              var4_int = param2;
                              if (-1 != (var4_int ^ -1)) {
                                break L9;
                              } else {
                                if (var5 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (1 != var4_int) {
                                break L10;
                              } else {
                                if (var5 == 0) {
                                  break L7;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if ((var4_int ^ -1) != -3) {
                                break L11;
                              } else {
                                if (var5 == 0) {
                                  break L6;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (-4 == (var4_int ^ -1)) {
                              break L5;
                            } else {
                              L12: {
                                if ((var4_int ^ -1) != -5) {
                                  break L12;
                                } else {
                                  if (var5 == 0) {
                                    break L4;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              if (5 == var4_int) {
                                break L3;
                              } else {
                                if (-7 != (var4_int ^ -1)) {
                                  break L1;
                                } else {
                                  if (var5 == 0) {
                                    break L2;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                          L13: {
                            stackOut_18_0 = this;
                            stackIn_20_0 = stackOut_18_0;
                            stackIn_19_0 = stackOut_18_0;
                            if (param1.h(255) != 1) {
                              stackOut_20_0 = this;
                              stackOut_20_1 = 0;
                              stackIn_21_0 = stackOut_20_0;
                              stackIn_21_1 = stackOut_20_1;
                              break L13;
                            } else {
                              stackOut_19_0 = this;
                              stackOut_19_1 = 1;
                              stackIn_21_0 = stackOut_19_0;
                              stackIn_21_1 = stackOut_19_1;
                              break L13;
                            }
                          }
                          ((lva) (this)).field_s = stackIn_21_1 != 0;
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L7;
                          }
                        }
                        this.field_n = param1.h(255);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L6;
                        }
                      }
                      this.field_x = param1.b(false);
                      if (-1 >= (this.field_x ^ -1)) {
                        break L1;
                      } else {
                        this.field_q = new short[this.field_n];
                        var4_int = 0;
                        L14: while (true) {
                          L15: {
                            if (var4_int >= this.field_n) {
                              break L15;
                            } else {
                              this.field_q[var4_int] = (short)param1.b(false);
                              var4_int++;
                              if (var5 != 0) {
                                break L1;
                              } else {
                                if (var5 == 0) {
                                  continue L14;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    dupTemp$1 = param1.h(255);
                    this.field_w = dupTemp$1;
                    this.field_u = dupTemp$1;
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                  this.field_z = param1.h(255);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
                this.field_u = param1.h(255);
                if (var5 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              this.field_w = param1.h(255);
              break L1;
            }
            L16: {
              if (param0 == 107) {
                break L16;
              } else {
                this.field_u = -71;
                break L16;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var4 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) (var4);
            stackOut_41_1 = new StringBuilder().append("lva.A(").append(param0).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L17;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L17;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param2 + ')');
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
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        uia var20 = null;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      var5 = sj.field_b[param2] * this.field_w;
                      if (-2 != (this.field_n ^ -1)) {
                        break L5;
                      } else {
                        L6: {
                          var8 = this.field_r[0] << -2065260724;
                          var9 = this.field_q[0];
                          var12 = var8 * this.field_u >> 1942397100;
                          var11 = var8 * var5 >> 89401164;
                          var13 = this.field_w * var8 >> -1388217204;
                          var15 = var11 >> -1894182836;
                          var16 = 1 + var15;
                          if ((var16 ^ -1) <= (var13 ^ -1)) {
                            var16 = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          var11 = var11 & 4095;
                          var17 = this.field_p[255 & var15] & 255;
                          var14 = pba.field_b[var11];
                          var18 = this.field_p[var16 & 255] & 255;
                          if (!this.field_s) {
                            break L7;
                          } else {
                            var10 = 0;
                            L8: while (true) {
                              if (ns.field_g <= var10) {
                                break L4;
                              } else {
                                var4_int = ht.field_Fb[var10] * this.field_u;
                                var6 = this.a(var17, false, var14, var11, var4_int * var8 >> -1888172212, var12, var18);
                                var6 = var6 * var9 >> 1930719308;
                                param0[var10] = 2048 - -(var6 >> -1023230719);
                                var10++;
                                if (var19 != 0) {
                                  break L2;
                                } else {
                                  if (var19 == 0) {
                                    continue L8;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var10 = 0;
                        L9: while (true) {
                          if (var10 >= ns.field_g) {
                            break L4;
                          } else {
                            var4_int = ht.field_Fb[var10] * this.field_u;
                            var6 = this.a(var17, false, var14, var11, var4_int * var8 >> 450044812, var12, var18);
                            param0[var10] = var9 * var6 >> -809375316;
                            var10++;
                            if (var19 != 0) {
                              break L2;
                            } else {
                              if (var19 == 0) {
                                continue L9;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                    }
                    L10: {
                      L11: {
                        var9 = this.field_q[0];
                        if ((var9 ^ -1) < -9) {
                          break L11;
                        } else {
                          if (var9 >= -8) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L12: {
                        var8 = this.field_r[0] << -973322228;
                        var12 = this.field_u * var8 >> 769815052;
                        var11 = var5 * var8 >> -488072148;
                        var13 = this.field_w * var8 >> -541816724;
                        var15 = var11 >> 697473132;
                        var16 = 1 + var15;
                        var11 = var11 & 4095;
                        if (var13 <= var16) {
                          var16 = 0;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      var18 = 255 & this.field_p[255 & var16];
                      var17 = this.field_p[var15 & 255] & 255;
                      var14 = pba.field_b[var11];
                      var10 = 0;
                      L13: while (true) {
                        if (ns.field_g <= var10) {
                          break L10;
                        } else {
                          var4_int = this.field_u * ht.field_Fb[var10];
                          var6 = this.a(var17, false, var14, var11, var8 * var4_int >> 1782175724, var12, var18);
                          param0[var10] = var6 * var9 >> 1965694156;
                          var10++;
                          if (var19 != 0) {
                            break L4;
                          } else {
                            if (var19 == 0) {
                              continue L13;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                    }
                    var7 = 1;
                    L14: while (true) {
                      if ((this.field_n ^ -1) >= (var7 ^ -1)) {
                        break L4;
                      } else {
                        var9 = this.field_q[var7];
                        stackOut_29_0 = var9 ^ -1;
                        stackOut_29_1 = -9;
                        stackIn_52_0 = stackOut_29_0;
                        stackIn_52_1 = stackOut_29_1;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        if (var19 != 0) {
                          break L3;
                        } else {
                          L15: {
                            L16: {
                              L17: {
                                if (stackIn_30_0 < stackIn_30_1) {
                                  break L17;
                                } else {
                                  if (var9 < -8) {
                                    break L17;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              L18: {
                                var8 = this.field_r[var7] << -1484201140;
                                var12 = var8 * this.field_u >> -1962821908;
                                var11 = var8 * var5 >> 791864492;
                                var13 = this.field_w * var8 >> 959129612;
                                var15 = var11 >> -1090151316;
                                var16 = var15 - -1;
                                var11 = var11 & 4095;
                                if (var16 >= var13) {
                                  var16 = 0;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              L19: {
                                L20: {
                                  var18 = this.field_p[255 & var16] & 255;
                                  var17 = this.field_p[255 & var15] & 255;
                                  var14 = pba.field_b[var11];
                                  if (!this.field_s) {
                                    break L20;
                                  } else {
                                    if ((this.field_n + -1 ^ -1) == (var7 ^ -1)) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                var10 = 0;
                                L21: while (true) {
                                  if (var10 >= ns.field_g) {
                                    break L16;
                                  } else {
                                    var4_int = this.field_u * ht.field_Fb[var10];
                                    var6 = this.a(var17, false, var14, var11, var4_int * var8 >> -973656244, var12, var18);
                                    param0[var10] = param0[var10] + (var9 * var6 >> 2027859756);
                                    var10++;
                                    if (var19 != 0) {
                                      break L15;
                                    } else {
                                      if (var19 == 0) {
                                        continue L21;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                }
                              }
                              var10 = 0;
                              L22: while (true) {
                                if ((ns.field_g ^ -1) >= (var10 ^ -1)) {
                                  break L16;
                                } else {
                                  var4_int = this.field_u * ht.field_Fb[var10];
                                  var6 = this.a(var17, false, var14, var11, var8 * var4_int >> -1115609108, var12, var18);
                                  var6 = (var6 * var9 >> 1811384652) + param0[var10];
                                  param0[var10] = (var6 >> 1789871265) + 2048;
                                  var10++;
                                  if (var19 != 0) {
                                    break L15;
                                  } else {
                                    if (var19 == 0) {
                                      continue L22;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                            }
                            var7++;
                            break L15;
                          }
                          if (var19 == 0) {
                            continue L14;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_51_0 = param1;
                  stackOut_51_1 = -1;
                  stackIn_52_0 = stackOut_51_0;
                  stackIn_52_1 = stackOut_51_1;
                  break L3;
                }
                if (stackIn_52_0 == stackIn_52_1) {
                  break L2;
                } else {
                  var20 = (uia) null;
                  this.a((byte) 111, (uia) null, 5);
                  break L1;
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var4 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) (var4);
            stackOut_55_1 = new StringBuilder().append("lva.I(");
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param0 == null) {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L23;
            } else {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L23;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 >= -34) {
            lva.d((byte) 124);
        }
        field_o = null;
        field_m = null;
        field_y = null;
        field_t = null;
        field_v = null;
    }

    final static boolean a(int param0, byte param1, int param2) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 == -21) {
            break L0;
          } else {
            field_v = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (hh.a(param0, (byte) 5, param2)) {
              break L2;
            } else {
              if (!upa.a(param2, 0, param0)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          this.field_p = pca.a(this.field_z, (byte) 109);
          if (param0 == 116) {
            break L0;
          } else {
            this.b((byte) 55);
            break L0;
          }
        }
        this.c(0);
        var2 = this.field_n - 1;
        L1: while (true) {
          L2: {
            L3: {
              if (var2 < 1) {
                break L3;
              } else {
                var3 = this.field_q[var2];
                if (var4 != 0) {
                  break L2;
                } else {
                  if (-9 > (var3 ^ -1)) {
                    break L3;
                  } else {
                    L4: {
                      if (7 >= (var3 ^ -1)) {
                        break L4;
                      } else {
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_n = this.field_n - 1;
                    var2--;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            break L2;
          }
          return;
        }
    }

    final int[] c(int param0, int param1) {
        int[] var4 = this.field_i.a((byte) -119, param1);
        int[] var3 = var4;
        if (param0 != 1) {
            this.field_q = (short[]) null;
        }
        if (!(!this.field_i.field_d)) {
            this.a(var4, param0 + -2, param1);
        }
        return var4;
    }

    final static void a(g[] param0, int param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        if (!((param1 ^ -1) > (param2 ^ -1))) {
            return;
        }
        try {
            var4_int = param1;
            var5 = po.a(param2, var4_int, param1, (byte) -65, param0);
            lva.a(param0, param1, -1 + var5, param3);
            lva.a(param0, 1 + var5, param2, param3 + 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lva.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        var18 = TombRacer.field_G ? 1 : 0;
        if (!param1) {
          L0: {
            var13 = param4 >> -902739956;
            var12 = 1 + var13;
            var13 = var13 & 255;
            param4 = param4 & 4095;
            if ((param5 ^ -1) < (var12 ^ -1)) {
              break L0;
            } else {
              var12 = 0;
              break L0;
            }
          }
          L1: {
            L2: {
              var10 = -4096 + param3;
              var12 = var12 & 255;
              var11 = -4096 + param4;
              var15 = pba.field_b[param4];
              var14 = 3 & this.field_p[param0 + var13];
              if (var14 > 1) {
                break L2;
              } else {
                L3: {
                  if (0 == var14) {
                    stackOut_7_0 = param3 + param4;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = -param4 + param3;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                var8 = stackIn_8_0;
                if (var18 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L4: {
              if ((var14 ^ -1) == -3) {
                stackOut_11_0 = param4 + -param3;
                stackIn_12_0 = stackOut_11_0;
                break L4;
              } else {
                stackOut_10_0 = -param4 + -param3;
                stackIn_12_0 = stackOut_10_0;
                break L4;
              }
            }
            var8 = stackIn_12_0;
            break L1;
          }
          L5: {
            L6: {
              var14 = 3 & this.field_p[var12 + param0];
              if (var14 > 1) {
                break L6;
              } else {
                L7: {
                  if (-1 != (var14 ^ -1)) {
                    stackOut_16_0 = -var11 + param3;
                    stackIn_17_0 = stackOut_16_0;
                    break L7;
                  } else {
                    stackOut_15_0 = param3 + var11;
                    stackIn_17_0 = stackOut_15_0;
                    break L7;
                  }
                }
                var9 = stackIn_17_0;
                if (var18 == 0) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (2 == var14) {
                stackOut_20_0 = var11 + -param3;
                stackIn_21_0 = stackOut_20_0;
                break L8;
              } else {
                stackOut_19_0 = -param3 + -var11;
                stackIn_21_0 = stackOut_19_0;
                break L8;
              }
            }
            var9 = stackIn_21_0;
            break L5;
          }
          L9: {
            L10: {
              var16 = var8 - -((var9 - var8) * var15 >> 1632800428);
              var14 = this.field_p[var13 + param6] & 3;
              if (1 >= var14) {
                break L10;
              } else {
                L11: {
                  if (2 != var14) {
                    stackOut_25_0 = -var10 + -param4;
                    stackIn_26_0 = stackOut_25_0;
                    break L11;
                  } else {
                    stackOut_24_0 = -var10 + param4;
                    stackIn_26_0 = stackOut_24_0;
                    break L11;
                  }
                }
                var8 = stackIn_26_0;
                if (var18 == 0) {
                  break L9;
                } else {
                  break L10;
                }
              }
            }
            L12: {
              if (-1 == (var14 ^ -1)) {
                stackOut_29_0 = param4 + var10;
                stackIn_30_0 = stackOut_29_0;
                break L12;
              } else {
                stackOut_28_0 = -param4 + var10;
                stackIn_30_0 = stackOut_28_0;
                break L12;
              }
            }
            var8 = stackIn_30_0;
            break L9;
          }
          L13: {
            L14: {
              var14 = this.field_p[param6 + var12] & 3;
              if ((var14 ^ -1) >= -2) {
                break L14;
              } else {
                L15: {
                  if (2 == var14) {
                    stackOut_34_0 = -var10 + var11;
                    stackIn_35_0 = stackOut_34_0;
                    break L15;
                  } else {
                    stackOut_33_0 = -var11 - var10;
                    stackIn_35_0 = stackOut_33_0;
                    break L15;
                  }
                }
                var9 = stackIn_35_0;
                if (var18 == 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            L16: {
              if (0 != var14) {
                stackOut_38_0 = -var11 + var10;
                stackIn_39_0 = stackOut_38_0;
                break L16;
              } else {
                stackOut_37_0 = var11 + var10;
                stackIn_39_0 = stackOut_37_0;
                break L16;
              }
            }
            var9 = stackIn_39_0;
            break L13;
          }
          var17 = ((-var8 + var9) * var15 >> 2051106956) + var8;
          return var16 - -(param2 * (-var16 + var17) >> -387161428);
        } else {
          return -28;
        }
    }

    public lva() {
        super(0, true);
        this.field_s = true;
        this.field_z = 0;
        this.field_x = 1638;
        this.field_n = 4;
        this.field_p = new byte[512];
        this.field_u = 4;
        this.field_w = 4;
    }

    static {
        field_o = "Click or press F10 to open Quick Chat";
        field_y = "Arrow";
        field_v = "You cannot join this game - it is in progress";
    }
}
