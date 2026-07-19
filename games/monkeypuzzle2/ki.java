/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends bf {
    private int field_i;
    int field_l;
    int field_m;
    boolean field_E;
    int field_C;
    private int field_k;
    int field_p;
    pj field_t;
    ki[] field_o;
    int field_w;
    int field_G;
    static int field_s;
    private int field_z;
    float field_v;
    int field_u;
    int field_y;
    boolean field_A;
    static le field_H;
    int field_F;
    float field_q;
    le field_I;
    int field_n;
    boolean field_x;
    static String[] field_r;
    boolean field_j;
    float field_B;
    float field_D;

    final void f(int param0) {
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        int fieldTemp$24 = 0;
        int fieldTemp$25 = 0;
        int fieldTemp$26 = 0;
        int fieldTemp$27 = 0;
        int fieldTemp$28 = 0;
        int fieldTemp$29 = 0;
        int fieldTemp$30 = 0;
        int fieldTemp$31 = 0;
        int fieldTemp$32 = 0;
        int fieldTemp$33 = 0;
        int var3 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != -7) {
          L0: {
            this.field_G = -86;
            this.field_z = this.field_z + 1;
            if (-1 == (this.field_w ^ -1)) {
              break L0;
            } else {
              L1: {
                if (this.field_w == 3) {
                  break L1;
                } else {
                  if (5 == this.field_w) {
                    if (-33 < (this.field_z % 100 ^ -1)) {
                      if (0 == (7 & this.field_z)) {
                        fieldTemp$17 = this.field_C + 1;
                        this.field_C = this.field_C + 1;
                        if (fieldTemp$17 != 4) {
                          this.field_I = hb.field_m[this.field_l][this.field_C];
                          if (var3 != 0) {
                            break L1;
                          } else {
                            return;
                          }
                        } else {
                          this.field_C = 0;
                          this.field_I = hb.field_m[this.field_l][this.field_C];
                          if (var3 != 0) {
                            if ((this.field_n ^ -1) == -2) {
                              if (-1 == (3 & this.field_z ^ -1)) {
                                fieldTemp$18 = this.field_C + 1;
                                this.field_C = this.field_C + 1;
                                if ((fieldTemp$18 ^ -1) > -5) {
                                  this.field_I = qi.field_K[this.field_C];
                                  if (var3 != 0) {
                                    L2: {
                                      if (this.field_n != 0) {
                                        break L2;
                                      } else {
                                        if ((this.field_z % 100 ^ -1) > -33) {
                                          if (-1 == (this.field_z & 7 ^ -1)) {
                                            fieldTemp$19 = this.field_C + 1;
                                            this.field_C = this.field_C + 1;
                                            if (-5 != (fieldTemp$19 ^ -1)) {
                                              this.field_I = nh.field_f[this.field_n][this.field_i][this.field_C];
                                              if (var3 != 0) {
                                                break L2;
                                              } else {
                                                return;
                                              }
                                            } else {
                                              L3: {
                                                this.field_C = 0;
                                                this.field_I = nh.field_f[this.field_n][this.field_i][this.field_C];
                                                if (var3 == 0) {
                                                  break L3;
                                                } else {
                                                  if (1 == this.field_n) {
                                                    if (-1 != (this.field_z & 7 ^ -1)) {
                                                      break L3;
                                                    } else {
                                                      L4: {
                                                        fieldTemp$20 = this.field_C + 1;
                                                        this.field_C = this.field_C + 1;
                                                        if (fieldTemp$20 == 4) {
                                                          this.field_C = 0;
                                                          break L4;
                                                        } else {
                                                          break L4;
                                                        }
                                                      }
                                                      this.field_I = nh.field_f[this.field_n][this.field_i][this.field_C];
                                                      break L3;
                                                    }
                                                  } else {
                                                    break L3;
                                                  }
                                                }
                                              }
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
                                    if (1 != this.field_n) {
                                      return;
                                    } else {
                                      L5: {
                                        if (-1 != (this.field_z & 7 ^ -1)) {
                                          break L5;
                                        } else {
                                          L6: {
                                            fieldTemp$21 = this.field_C + 1;
                                            this.field_C = this.field_C + 1;
                                            if (fieldTemp$21 == 4) {
                                              this.field_C = 0;
                                              break L6;
                                            } else {
                                              break L6;
                                            }
                                          }
                                          this.field_I = nh.field_f[this.field_n][this.field_i][this.field_C];
                                          break L5;
                                        }
                                      }
                                      return;
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
                              return;
                            }
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
              if ((this.field_n ^ -1) == -2) {
                if (-1 == (3 & this.field_z ^ -1)) {
                  fieldTemp$22 = this.field_C + 1;
                  this.field_C = this.field_C + 1;
                  if ((fieldTemp$22 ^ -1) > -5) {
                    this.field_I = qi.field_K[this.field_C];
                    if (var3 != 0) {
                      break L0;
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
                return;
              }
            }
          }
          L7: {
            if (this.field_n != 0) {
              break L7;
            } else {
              if ((this.field_z % 100 ^ -1) > -33) {
                if (-1 == (this.field_z & 7 ^ -1)) {
                  fieldTemp$23 = this.field_C + 1;
                  this.field_C = this.field_C + 1;
                  if (-5 != (fieldTemp$23 ^ -1)) {
                    this.field_I = nh.field_f[this.field_n][this.field_i][this.field_C];
                    if (var3 != 0) {
                      break L7;
                    } else {
                      return;
                    }
                  } else {
                    this.field_C = 0;
                    this.field_I = nh.field_f[this.field_n][this.field_i][this.field_C];
                    if (var3 != 0) {
                      if (1 == this.field_n) {
                        L8: {
                          if (-1 != (this.field_z & 7 ^ -1)) {
                            break L8;
                          } else {
                            L9: {
                              fieldTemp$24 = this.field_C + 1;
                              this.field_C = this.field_C + 1;
                              if (fieldTemp$24 == 4) {
                                this.field_C = 0;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            this.field_I = nh.field_f[this.field_n][this.field_i][this.field_C];
                            break L8;
                          }
                        }
                        return;
                      } else {
                        return;
                      }
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
            }
          }
          if (1 == this.field_n) {
            L10: {
              if (-1 != (this.field_z & 7 ^ -1)) {
                break L10;
              } else {
                L11: {
                  fieldTemp$25 = this.field_C + 1;
                  this.field_C = this.field_C + 1;
                  if (fieldTemp$25 == 4) {
                    this.field_C = 0;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                this.field_I = nh.field_f[this.field_n][this.field_i][this.field_C];
                break L10;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          L12: {
            this.field_z = this.field_z + 1;
            if (-1 == (this.field_w ^ -1)) {
              break L12;
            } else {
              L13: {
                if (this.field_w == 3) {
                  break L13;
                } else {
                  if (5 == this.field_w) {
                    if (-33 < (this.field_z % 100 ^ -1)) {
                      if (0 == (7 & this.field_z)) {
                        fieldTemp$26 = this.field_C + 1;
                        this.field_C = this.field_C + 1;
                        if (fieldTemp$26 != 4) {
                          this.field_I = hb.field_m[this.field_l][this.field_C];
                          if (var3 != 0) {
                            break L13;
                          } else {
                            return;
                          }
                        } else {
                          L14: {
                            this.field_C = 0;
                            this.field_I = hb.field_m[this.field_l][this.field_C];
                            if (var3 == 0) {
                              break L14;
                            } else {
                              if ((this.field_n ^ -1) == -2) {
                                if (-1 == (3 & this.field_z ^ -1)) {
                                  fieldTemp$27 = this.field_C + 1;
                                  this.field_C = this.field_C + 1;
                                  if ((fieldTemp$27 ^ -1) > -5) {
                                    this.field_I = qi.field_K[this.field_C];
                                    if (var3 == 0) {
                                      break L14;
                                    } else {
                                      L15: {
                                        if (this.field_n != 0) {
                                          break L15;
                                        } else {
                                          if ((this.field_z % 100 ^ -1) <= -33) {
                                            break L14;
                                          } else {
                                            if (-1 != (this.field_z & 7 ^ -1)) {
                                              break L14;
                                            } else {
                                              L16: {
                                                fieldTemp$28 = this.field_C + 1;
                                                this.field_C = this.field_C + 1;
                                                if (-5 != (fieldTemp$28 ^ -1)) {
                                                  break L16;
                                                } else {
                                                  this.field_C = 0;
                                                  break L16;
                                                }
                                              }
                                              this.field_I = nh.field_f[this.field_n][this.field_i][this.field_C];
                                              if (var3 == 0) {
                                                break L14;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (1 == this.field_n) {
                                        if (-1 != (this.field_z & 7 ^ -1)) {
                                          break L14;
                                        } else {
                                          L17: {
                                            fieldTemp$29 = this.field_C + 1;
                                            this.field_C = this.field_C + 1;
                                            if (fieldTemp$29 == 4) {
                                              this.field_C = 0;
                                              break L17;
                                            } else {
                                              break L17;
                                            }
                                          }
                                          this.field_I = nh.field_f[this.field_n][this.field_i][this.field_C];
                                          break L14;
                                        }
                                      } else {
                                        break L14;
                                      }
                                    }
                                  } else {
                                    break L14;
                                  }
                                } else {
                                  break L14;
                                }
                              } else {
                                break L14;
                              }
                            }
                          }
                          return;
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
              if ((this.field_n ^ -1) == -2) {
                if (-1 == (3 & this.field_z ^ -1)) {
                  fieldTemp$30 = this.field_C + 1;
                  this.field_C = this.field_C + 1;
                  if ((fieldTemp$30 ^ -1) > -5) {
                    this.field_I = qi.field_K[this.field_C];
                    if (var3 != 0) {
                      break L12;
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
                return;
              }
            }
          }
          L18: {
            if (this.field_n != 0) {
              break L18;
            } else {
              if ((this.field_z % 100 ^ -1) > -33) {
                if (-1 == (this.field_z & 7 ^ -1)) {
                  fieldTemp$31 = this.field_C + 1;
                  this.field_C = this.field_C + 1;
                  if (-5 != (fieldTemp$31 ^ -1)) {
                    this.field_I = nh.field_f[this.field_n][this.field_i][this.field_C];
                    if (var3 != 0) {
                      break L18;
                    } else {
                      return;
                    }
                  } else {
                    L19: {
                      this.field_C = 0;
                      this.field_I = nh.field_f[this.field_n][this.field_i][this.field_C];
                      if (var3 == 0) {
                        break L19;
                      } else {
                        if (1 == this.field_n) {
                          if (-1 != (this.field_z & 7 ^ -1)) {
                            break L19;
                          } else {
                            L20: {
                              fieldTemp$32 = this.field_C + 1;
                              this.field_C = this.field_C + 1;
                              if (fieldTemp$32 == 4) {
                                this.field_C = 0;
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            this.field_I = nh.field_f[this.field_n][this.field_i][this.field_C];
                            break L19;
                          }
                        } else {
                          break L19;
                        }
                      }
                    }
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
          if (1 == this.field_n) {
            L21: {
              if (-1 != (this.field_z & 7 ^ -1)) {
                break L21;
              } else {
                L22: {
                  fieldTemp$33 = this.field_C + 1;
                  this.field_C = this.field_C + 1;
                  if (fieldTemp$33 == 4) {
                    this.field_C = 0;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                this.field_I = nh.field_f[this.field_n][this.field_i][this.field_C];
                break L21;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    final static String a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 >= 20) {
              var2_int = param1.length();
              var3 = new char[var2_int];
              var4 = 0;
              L1: while (true) {
                L2: {
                  if (var2_int <= var4) {
                    break L2;
                  } else {
                    var3[-1 + (var2_int + -var4)] = param1.charAt(var4);
                    var4++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_7_0 = new String(var3);
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = (String) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("ki.G(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_74_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        this.field_q = this.field_q + this.field_D;
        this.field_B = this.field_B + this.field_v;
        int fieldTemp$1 = this.field_u;
        this.field_u = this.field_u + 1;
        if (fieldTemp$1 <= 250) {
          if (param0 <= -87) {
            L0: {
              if ((float)this.field_G + this.field_B <= 80.0f) {
                break L0;
              } else {
                if (560.0f <= this.field_B - (float)this.field_G) {
                  break L0;
                } else {
                  return;
                }
              }
            }
            L1: {
              L2: {
                var2 = 0;
                if (80.0f < (float)this.field_G + this.field_B) {
                  break L2;
                } else {
                  L3: {
                    if (!nh.a(80, 0, (int)this.field_q, (int)(this.field_q + this.field_D), -5425, 80, (int)(this.field_v + this.field_B), (int)this.field_B, 480)) {
                      stackOut_66_0 = 0;
                      stackIn_67_0 = stackOut_66_0;
                      break L3;
                    } else {
                      stackOut_65_0 = 1;
                      stackIn_67_0 = stackOut_65_0;
                      break L3;
                    }
                  }
                  var2 = stackIn_67_0;
                  if (var2 != 0) {
                    this.field_B = (float)(ll.field_a + -this.field_G);
                    if (!MonkeyPuzzle2.field_F) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    ib.c(100);
                    this.field_v = this.field_v * -1.0f;
                    return;
                  }
                }
              }
              L4: {
                if (!nh.a(560, 0, (int)this.field_q, (int)(this.field_D + this.field_q), -5425, 560, (int)(this.field_B + this.field_v), (int)this.field_B, 480)) {
                  stackOut_73_0 = 0;
                  stackIn_74_0 = stackOut_73_0;
                  break L4;
                } else {
                  stackOut_72_0 = 1;
                  stackIn_74_0 = stackOut_72_0;
                  break L4;
                }
              }
              var2 = stackIn_74_0;
              if (var2 == 0) {
                break L1;
              } else {
                this.field_B = (float)(ll.field_a - -this.field_G);
                if (Math.abs(-this.field_q + (float)ok.field_b) >= 10.0f) {
                  ib.c(100);
                  this.field_v = this.field_v * -1.0f;
                  return;
                } else {
                  this.field_q = (float)ok.field_b;
                  ib.c(100);
                  this.field_v = this.field_v * -1.0f;
                  return;
                }
              }
            }
            if (var2 != 0) {
              if (Math.abs(-this.field_q + (float)ok.field_b) >= 10.0f) {
                ib.c(100);
                this.field_v = this.field_v * -1.0f;
                return;
              } else {
                this.field_q = (float)ok.field_b;
                ib.c(100);
                this.field_v = this.field_v * -1.0f;
                return;
              }
            } else {
              ib.c(100);
              this.field_v = this.field_v * -1.0f;
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_D = this.field_D + 1.0f;
          if (param0 <= -87) {
            if ((float)this.field_G + this.field_B > 80.0f) {
              if (560.0f <= this.field_B - (float)this.field_G) {
                L5: {
                  L6: {
                    var2 = 0;
                    if (80.0f < (float)this.field_G + this.field_B) {
                      break L6;
                    } else {
                      L7: {
                        if (!nh.a(80, 0, (int)this.field_q, (int)(this.field_q + this.field_D), -5425, 80, (int)(this.field_v + this.field_B), (int)this.field_B, 480)) {
                          stackOut_34_0 = 0;
                          stackIn_35_0 = stackOut_34_0;
                          break L7;
                        } else {
                          stackOut_33_0 = 1;
                          stackIn_35_0 = stackOut_33_0;
                          break L7;
                        }
                      }
                      var2 = stackIn_35_0;
                      if (var2 != 0) {
                        this.field_B = (float)(ll.field_a + -this.field_G);
                        if (MonkeyPuzzle2.field_F) {
                          break L6;
                        } else {
                          if (var2 == 0) {
                            break L5;
                          } else {
                            if (Math.abs(-this.field_q + (float)ok.field_b) >= 10.0f) {
                              break L5;
                            } else {
                              this.field_q = (float)ok.field_b;
                              break L5;
                            }
                          }
                        }
                      } else {
                        if (var2 == 0) {
                          break L5;
                        } else {
                          if (Math.abs(-this.field_q + (float)ok.field_b) >= 10.0f) {
                            break L5;
                          } else {
                            this.field_q = (float)ok.field_b;
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  L8: {
                    if (!nh.a(560, 0, (int)this.field_q, (int)(this.field_D + this.field_q), -5425, 560, (int)(this.field_B + this.field_v), (int)this.field_B, 480)) {
                      stackOut_45_0 = 0;
                      stackIn_46_0 = stackOut_45_0;
                      break L8;
                    } else {
                      stackOut_44_0 = 1;
                      stackIn_46_0 = stackOut_44_0;
                      break L8;
                    }
                  }
                  var2 = stackIn_46_0;
                  if (var2 != 0) {
                    this.field_B = (float)(ll.field_a - -this.field_G);
                    if (var2 == 0) {
                      break L5;
                    } else {
                      if (Math.abs(-this.field_q + (float)ok.field_b) >= 10.0f) {
                        break L5;
                      } else {
                        this.field_q = (float)ok.field_b;
                        break L5;
                      }
                    }
                  } else {
                    if (var2 == 0) {
                      break L5;
                    } else {
                      if (Math.abs(-this.field_q + (float)ok.field_b) >= 10.0f) {
                        break L5;
                      } else {
                        this.field_q = (float)ok.field_b;
                        break L5;
                      }
                    }
                  }
                }
                ib.c(100);
                this.field_v = this.field_v * -1.0f;
                return;
              } else {
                return;
              }
            } else {
              L9: {
                L10: {
                  var2 = 0;
                  if (80.0f < (float)this.field_G + this.field_B) {
                    break L10;
                  } else {
                    L11: {
                      if (!nh.a(80, 0, (int)this.field_q, (int)(this.field_q + this.field_D), -5425, 80, (int)(this.field_v + this.field_B), (int)this.field_B, 480)) {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        break L11;
                      } else {
                        stackOut_6_0 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        break L11;
                      }
                    }
                    var2 = stackIn_8_0;
                    if (var2 != 0) {
                      this.field_B = (float)(ll.field_a + -this.field_G);
                      if (MonkeyPuzzle2.field_F) {
                        break L10;
                      } else {
                        if (var2 == 0) {
                          break L9;
                        } else {
                          if (Math.abs(-this.field_q + (float)ok.field_b) >= 10.0f) {
                            break L9;
                          } else {
                            this.field_q = (float)ok.field_b;
                            break L9;
                          }
                        }
                      }
                    } else {
                      if (var2 == 0) {
                        break L9;
                      } else {
                        if (Math.abs(-this.field_q + (float)ok.field_b) >= 10.0f) {
                          break L9;
                        } else {
                          this.field_q = (float)ok.field_b;
                          break L9;
                        }
                      }
                    }
                  }
                }
                L12: {
                  if (!nh.a(560, 0, (int)this.field_q, (int)(this.field_D + this.field_q), -5425, 560, (int)(this.field_B + this.field_v), (int)this.field_B, 480)) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L12;
                  } else {
                    stackOut_17_0 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    break L12;
                  }
                }
                var2 = stackIn_19_0;
                if (var2 != 0) {
                  this.field_B = (float)(ll.field_a - -this.field_G);
                  if (var2 == 0) {
                    break L9;
                  } else {
                    if (Math.abs(-this.field_q + (float)ok.field_b) >= 10.0f) {
                      break L9;
                    } else {
                      this.field_q = (float)ok.field_b;
                      break L9;
                    }
                  }
                } else {
                  if (var2 == 0) {
                    break L9;
                  } else {
                    if (Math.abs(-this.field_q + (float)ok.field_b) >= 10.0f) {
                      break L9;
                    } else {
                      this.field_q = (float)ok.field_b;
                      break L9;
                    }
                  }
                }
              }
              ib.c(100);
              this.field_v = this.field_v * -1.0f;
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(byte param0, gk param1) {
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
              this.a(param1, true);
              this.a(false);
              this.field_x = true;
              if (param0 >= 112) {
                break L1;
              } else {
                this.f(113);
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
            stackOut_3_1 = new StringBuilder().append("ki.E(").append(param0).append(',');
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
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void a(int param0, String param1) {
        try {
            int var2_int = 11 % ((-86 - param0) / 39);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ki.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, kc param1, boolean param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            e.field_b[0] = pi.field_l.nextInt();
            e.field_b[1] = pi.field_l.nextInt();
            e.field_b[3] = (int)ld.field_a;
            e.field_b[2] = (int)(ld.field_a >> -599347296);
            uc.field_a.field_h = 0;
            uc.field_a.a(-803539344, e.field_b[0]);
            uc.field_a.a(-803539344, e.field_b[1]);
            uc.field_a.a(-803539344, e.field_b[2]);
            uc.field_a.a(-803539344, e.field_b[3]);
            df.a(uc.field_a, false);
            uc.field_a.c(param0, 80);
            if (param2) {
              L1: {
                param1.a(121, uc.field_a);
                gf.field_c.field_h = 0;
                if (param3) {
                  gf.field_c.b(18, -49152);
                  break L1;
                } else {
                  gf.field_c.b(16, -49152);
                  if (!MonkeyPuzzle2.field_F) {
                    break L1;
                  } else {
                    gf.field_c.b(18, -49152);
                    break L1;
                  }
                }
              }
              L2: {
                gf.field_c.field_h = gf.field_c.field_h + 2;
                var5_int = gf.field_c.field_h;
                gf.field_c.a(-803539344, mk.field_h);
                gf.field_c.a(od.field_l, (byte) -102);
                var6 = 0;
                if (!mb.field_c) {
                  break L2;
                } else {
                  var6 = var6 | 1;
                  break L2;
                }
              }
              L3: {
                if (me.field_e) {
                  var6 = var6 | 4;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (param4) {
                  var6 = var6 | 8;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (null == df.field_o) {
                  break L5;
                } else {
                  var6 = var6 | 16;
                  break L5;
                }
              }
              L6: {
                gf.field_c.b(var6, -49152);
                var7 = lc.a(ii.a(false), (byte) -89);
                if (var7 == null) {
                  var7 = "";
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                gf.field_c.a(-119, var7);
                if (df.field_o != null) {
                  gf.field_c.a(df.field_o, -57);
                  break L7;
                } else {
                  break L7;
                }
              }
              e.a(sd.field_a, fj.field_F, (byte) 92, gf.field_c, uc.field_a);
              gf.field_c.d(6903, gf.field_c.field_h - var5_int);
              al.a((byte) -71, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var5);
            stackOut_25_1 = new StringBuilder().append("ki.D(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        if (2 != this.field_w) {
          if (-4 != (this.field_w ^ -1)) {
            var2 = -89 % ((param0 - 59) / 54);
            return;
          } else {
            sb.field_m.e();
            this.field_I.e(-80 + (int)((float)this.field_G + this.field_B) - 1, (int)(this.field_q + (float)this.field_y), 16777213);
            this.field_I.e((int)(this.field_B + (float)this.field_G) + -79, (int)((float)this.field_y + this.field_q), 16777212);
            this.field_I.e((int)((float)this.field_G + this.field_B) - 80, (int)((float)this.field_y + this.field_q - 1.0f), 16777215);
            this.field_I.e(-80 + (int)((float)this.field_G + this.field_B), (int)(1.0f + ((float)this.field_y + this.field_q)), 16777214);
            ac.field_a.a((byte) 117);
            var2 = -89 % ((param0 - 59) / 54);
            return;
          }
        } else {
          sb.field_m.e();
          this.field_I.e(-80 + (int)((float)this.field_G + this.field_B) - 1, (int)(this.field_q + (float)this.field_y), 16777213);
          this.field_I.e((int)(this.field_B + (float)this.field_G) + -79, (int)((float)this.field_y + this.field_q), 16777212);
          this.field_I.e((int)((float)this.field_G + this.field_B) - 80, (int)((float)this.field_y + this.field_q - 1.0f), 16777215);
          this.field_I.e(-80 + (int)((float)this.field_G + this.field_B), (int)(1.0f + ((float)this.field_y + this.field_q)), 16777214);
          ac.field_a.a((byte) 117);
          var2 = -89 % ((param0 - 59) / 54);
          return;
        }
    }

    final void a(byte param0) {
        L0: {
          if (this.field_w != 4) {
            if (0 != this.field_w) {
              L1: {
                if ((this.field_w ^ -1) != -6) {
                  break L1;
                } else {
                  if (1 >= this.field_m) {
                    break L1;
                  } else {
                    L2: {
                      ge.c((int)this.field_B, (int)this.field_q, 16, 16777215, 100);
                      ge.e((int)this.field_B, (int)this.field_q, 16, 1);
                      if (this.field_I != null) {
                        this.field_I.c((int)((float)this.field_G + this.field_B), (int)((float)this.field_y + this.field_q));
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    if (param0 > -10) {
                      this.c((byte) 35);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              if (this.field_I != null) {
                this.field_I.c((int)((float)this.field_G + this.field_B), (int)((float)this.field_y + this.field_q));
                break L0;
              } else {
                if (param0 <= -10) {
                  return;
                } else {
                  this.c((byte) 35);
                  return;
                }
              }
            } else {
              if (-1 > (this.field_m ^ -1)) {
                L3: {
                  ge.c((int)this.field_B, (int)this.field_q, 16, 16777215, 100);
                  ge.e((int)this.field_B, (int)this.field_q, 16, 1);
                  if (this.field_I != null) {
                    this.field_I.c((int)((float)this.field_G + this.field_B), (int)((float)this.field_y + this.field_q));
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (param0 <= -10) {
                  return;
                } else {
                  this.c((byte) 35);
                  return;
                }
              } else {
                L4: {
                  if ((this.field_w ^ -1) != -6) {
                    break L4;
                  } else {
                    if (1 >= this.field_m) {
                      break L4;
                    } else {
                      L5: {
                        ge.c((int)this.field_B, (int)this.field_q, 16, 16777215, 100);
                        ge.e((int)this.field_B, (int)this.field_q, 16, 1);
                        if (this.field_I != null) {
                          this.field_I.c((int)((float)this.field_G + this.field_B), (int)((float)this.field_y + this.field_q));
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      if (param0 > -10) {
                        this.c((byte) 35);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
                L6: {
                  if (this.field_I != null) {
                    this.field_I.c((int)((float)this.field_G + this.field_B), (int)((float)this.field_y + this.field_q));
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (param0 > -10) {
                  this.c((byte) 35);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            this.field_I.b((int)((float)this.field_G + this.field_B), (int)(this.field_q + (float)this.field_y), 180);
            if (!MonkeyPuzzle2.field_F) {
              break L0;
            } else {
              if (0 == this.field_w) {
                if (-1 <= (this.field_m ^ -1)) {
                  if ((this.field_w ^ -1) == -6) {
                    if (1 < this.field_m) {
                      L7: {
                        ge.c((int)this.field_B, (int)this.field_q, 16, 16777215, 100);
                        ge.e((int)this.field_B, (int)this.field_q, 16, 1);
                        if (this.field_I != null) {
                          this.field_I.c((int)((float)this.field_G + this.field_B), (int)((float)this.field_y + this.field_q));
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (param0 > -10) {
                        this.c((byte) 35);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L8: {
                        if (this.field_I != null) {
                          this.field_I.c((int)((float)this.field_G + this.field_B), (int)((float)this.field_y + this.field_q));
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      if (param0 > -10) {
                        this.c((byte) 35);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    L9: {
                      if (this.field_I != null) {
                        this.field_I.c((int)((float)this.field_G + this.field_B), (int)((float)this.field_y + this.field_q));
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    if (param0 > -10) {
                      this.c((byte) 35);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L10: {
                    ge.c((int)this.field_B, (int)this.field_q, 16, 16777215, 100);
                    ge.e((int)this.field_B, (int)this.field_q, 16, 1);
                    if (this.field_I != null) {
                      this.field_I.c((int)((float)this.field_G + this.field_B), (int)((float)this.field_y + this.field_q));
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  if (param0 > -10) {
                    this.c((byte) 35);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L11: {
                  if ((this.field_w ^ -1) != -6) {
                    break L11;
                  } else {
                    if (1 >= this.field_m) {
                      break L11;
                    } else {
                      ge.c((int)this.field_B, (int)this.field_q, 16, 16777215, 100);
                      ge.e((int)this.field_B, (int)this.field_q, 16, 1);
                      break L11;
                    }
                  }
                }
                L12: {
                  if (this.field_I != null) {
                    this.field_I.c((int)((float)this.field_G + this.field_B), (int)((float)this.field_y + this.field_q));
                    break L12;
                  } else {
                    break L12;
                  }
                }
                if (param0 > -10) {
                  this.c((byte) 35);
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
        if (param0 <= -10) {
          return;
        } else {
          this.c((byte) 35);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_l = param1;
        if (param2 == -1) {
          this.field_w = param0;
          this.a(false);
          return;
        } else {
          this.field_t = (pj) null;
          this.field_w = param0;
          this.a(false);
          return;
        }
    }

    private final void a(gk param0, boolean param1) {
        try {
            this.field_B = (float)param0.e(-46);
            this.field_q = (float)param0.e(127);
            this.field_l = param0.a((byte) 114);
            if (!param1) {
                this.field_y = 45;
            }
            this.field_w = param0.a((byte) 114);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ki.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void c(byte param0) {
        sb.field_m.e();
        if (param0 < -83) {
          this.field_I.e((int)((float)this.field_G + this.field_B) + -80, (int)((float)this.field_y + this.field_q), this.field_k + 1);
          ac.field_a.a((byte) 124);
          return;
        } else {
          this.field_y = -51;
          this.field_I.e((int)((float)this.field_G + this.field_B) + -80, (int)((float)this.field_y + this.field_q), this.field_k + 1);
          ac.field_a.a((byte) 124);
          return;
        }
    }

    private final void a(boolean param0) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        L0: {
          this.field_A = false;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((ki) (this)).field_E = stackIn_3_1 != 0;
          this.field_F = 0;
          this.field_i = this.field_l;
          this.field_m = 0;
          this.field_p = -this.field_k;
          this.field_z = 0;
          stackOut_3_0 = this;
          stackIn_20_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if ((this.field_w ^ -1) == -3) {
            stackOut_20_0 = this;
            stackOut_20_1 = 1;
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackIn_21_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if ((this.field_w ^ -1) != -4) {
              stackOut_21_0 = this;
              stackOut_21_1 = 0;
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              break L1;
            } else {
              ((ki) (this)).field_x = true;
              this.field_n = 0;
              this.field_t = null;
              this.field_j = false;
              this.field_C = 0;
              if (6 != this.field_w) {
                if (-5 != (this.field_w ^ -1)) {
                  if ((this.field_w ^ -1) != -3) {
                    if (3 != this.field_w) {
                      this.e(123);
                      return;
                    } else {
                      this.field_l = -this.field_k;
                      this.e(123);
                      return;
                    }
                  } else {
                    this.field_l = -this.field_k;
                    this.e(123);
                    return;
                  }
                } else {
                  this.field_l = -this.field_k;
                  this.e(123);
                  return;
                }
              } else {
                this.field_l = -this.field_k;
                this.e(123);
                return;
              }
            }
          }
        }
        ((ki) (this)).field_x = stackIn_22_1 != 0;
        this.field_n = 0;
        this.field_t = null;
        this.field_j = false;
        this.field_C = 0;
        if (6 != this.field_w) {
          if (-5 != (this.field_w ^ -1)) {
            if ((this.field_w ^ -1) != -3) {
              if (3 != this.field_w) {
                this.e(123);
                return;
              } else {
                this.field_l = -this.field_k;
                this.e(123);
                return;
              }
            } else {
              this.field_l = -this.field_k;
              this.e(123);
              return;
            }
          } else {
            this.field_l = -this.field_k;
            this.e(123);
            return;
          }
        } else {
          this.field_l = -this.field_k;
          this.e(123);
          return;
        }
    }

    public static void h(int param0) {
        if (param0 != 12950) {
            field_H = (le) null;
            field_H = null;
            field_r = null;
            return;
        }
        field_H = null;
        field_r = null;
    }

    final void g(int param0) {
        int incrementValue$1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var14 = null;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        L0: {
          var10 = MonkeyPuzzle2.field_F ? 1 : 0;
          var2 = -84 + ((int)this.field_B - -this.field_G);
          var3 = (int)this.field_q + this.field_y - 4;
          var4 = 8 + this.field_I.field_m;
          if ((var2 ^ -1) <= -1) {
            break L0;
          } else {
            var4 = var4 + var2;
            var2 = 0;
            break L0;
          }
        }
        L1: {
          var5 = 8 + this.field_I.field_n;
          if (-1 < (var3 ^ -1)) {
            var5 = var5 + var3;
            var3 = 0;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (sb.field_m.field_k < var4 + var2) {
            var4 = sb.field_m.field_k - var2;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (sb.field_m.field_j >= var3 + var5) {
            break L3;
          } else {
            var5 = sb.field_m.field_j - var3;
            break L3;
          }
        }
        if (param0 >= 104) {
          var6 = var3 * sb.field_m.field_k + var2;
          var7 = -var4 + sb.field_m.field_k;
          var14 = sb.field_m.field_s;
          L4: while (true) {
            incrementValue$1 = var5;
            var5--;
            if ((incrementValue$1 ^ -1) < -1) {
              if (var10 == 0) {
                var9 = -var4;
                L5: while (true) {
                  L6: {
                    if ((var9 ^ -1) <= -1) {
                      var6 = var6 + var7;
                      break L6;
                    } else {
                      stackOut_19_0 = this.field_k - -1 ^ -1;
                      stackOut_19_1 = var14[var6] ^ -1;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      if (var10 == 0) {
                        L7: {
                          if (stackIn_21_0 == stackIn_21_1) {
                            var14[var6] = 0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if (this.field_w != 3) {
                            break L8;
                          } else {
                            if (16777212 <= var14[var6]) {
                              var14[var6] = 0;
                              break L8;
                            } else {
                              var6++;
                              var9++;
                              continue L5;
                            }
                          }
                        }
                        var6++;
                        var9++;
                        continue L5;
                      } else {
                        var6 = stackIn_20_0 + stackIn_20_1;
                        break L6;
                      }
                    }
                  }
                  continue L4;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(boolean param0, ki param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        ki stackIn_5_0 = null;
        ki stackIn_21_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ki stackOut_4_0 = null;
        Object stackOut_20_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param0) {
                break L1;
              } else {
                this.field_v = -0.48507803678512573f;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var3_int >= this.field_m) {
                    break L4;
                  } else {
                    stackOut_4_0 = this.field_o[var3_int];
                    stackIn_21_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_5_0 == param1) {
                          L6: {
                            L7: {
                              this.field_o[var3_int] = null;
                              if (this.field_l == param1.field_l) {
                                break L7;
                              } else {
                                if (this.field_p == param1.field_l) {
                                  break L7;
                                } else {
                                  if (this.field_l == param1.field_p) {
                                    break L7;
                                  } else {
                                    if (param1.field_p != this.field_p) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                            }
                            this.field_F = this.field_F - 1;
                            break L6;
                          }
                          L8: {
                            L9: {
                              this.field_m = this.field_m - 1;
                              if (var3_int < 5) {
                                break L9;
                              } else {
                                if ((this.field_w ^ -1) != -5) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            gl.a(this.field_o, var3_int + 1, this.field_o, var3_int, -var3_int + this.field_m);
                            break L8;
                          }
                          this.field_o[this.field_m] = null;
                          if (var4 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                      var3_int++;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_20_0 = this;
                stackIn_21_0 = (ki) ((Object) stackOut_20_0);
                break L3;
              }
              if (this.field_m < this.field_F) {
                throw new IllegalStateException();
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var3);
            stackOut_25_1 = new StringBuilder().append("ki.P(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (-1 == (this.field_w ^ -1)) {
          this.field_I = nh.field_f[this.field_n][this.field_i][0];
          this.field_z = pf.a((byte) 51, 65) + 35;
          if (var3 != 0) {
            if (-2 == (this.field_w ^ -1)) {
              this.field_I = ak.field_t[this.field_i];
              var2 = -92 % ((76 - param0) / 41);
              if (this.field_I == null) {
                return;
              } else {
                this.field_G = -(this.field_I.field_m / 2);
                this.field_y = -(this.field_I.field_n / 2);
                return;
              }
            } else {
              L0: {
                if ((this.field_w ^ -1) == -3) {
                  this.field_I = qi.field_K[0];
                  if (var3 == 0) {
                    break L0;
                  } else {
                    this.field_I = ak.field_t[this.field_i];
                    var2 = -92 % ((76 - param0) / 41);
                    if (this.field_I == null) {
                      return;
                    } else {
                      this.field_G = -(this.field_I.field_m / 2);
                      this.field_y = -(this.field_I.field_n / 2);
                      return;
                    }
                  }
                } else {
                  if (-4 != (this.field_w ^ -1)) {
                    if (-5 != (this.field_w ^ -1)) {
                      L1: {
                        if (5 == this.field_w) {
                          break L1;
                        } else {
                          if (-7 == (this.field_w ^ -1)) {
                            this.field_I = tl.field_b;
                            if (var3 == 0) {
                              break L0;
                            } else {
                              break L1;
                            }
                          } else {
                            var2 = -92 % ((76 - param0) / 41);
                            if (this.field_I == null) {
                              return;
                            } else {
                              this.field_G = -(this.field_I.field_m / 2);
                              this.field_y = -(this.field_I.field_n / 2);
                              return;
                            }
                          }
                        }
                      }
                      this.field_I = hb.field_m[this.field_l][0];
                      this.field_z = pf.a((byte) -92, 2000);
                      if (var3 == 0) {
                        break L0;
                      } else {
                        this.field_I = qi.field_K[0];
                        this.field_I = ak.field_t[this.field_i];
                        var2 = -92 % ((76 - param0) / 41);
                        if (this.field_I == null) {
                          return;
                        } else {
                          this.field_G = -(this.field_I.field_m / 2);
                          this.field_y = -(this.field_I.field_n / 2);
                          return;
                        }
                      }
                    } else {
                      this.field_I = wc.field_h;
                      if (var3 != 0) {
                        L2: {
                          L3: {
                            if (5 == this.field_w) {
                              break L3;
                            } else {
                              if (-7 == (this.field_w ^ -1)) {
                                this.field_I = tl.field_b;
                                if (var3 == 0) {
                                  break L2;
                                } else {
                                  break L3;
                                }
                              } else {
                                var2 = -92 % ((76 - param0) / 41);
                                if (this.field_I == null) {
                                  return;
                                } else {
                                  this.field_G = -(this.field_I.field_m / 2);
                                  this.field_y = -(this.field_I.field_n / 2);
                                  return;
                                }
                              }
                            }
                          }
                          this.field_I = hb.field_m[this.field_l][0];
                          this.field_z = pf.a((byte) -92, 2000);
                          if (var3 == 0) {
                            break L2;
                          } else {
                            this.field_I = qi.field_K[0];
                            this.field_I = ak.field_t[this.field_i];
                            var2 = -92 % ((76 - param0) / 41);
                            if (this.field_I == null) {
                              return;
                            } else {
                              this.field_G = -(this.field_I.field_m / 2);
                              this.field_y = -(this.field_I.field_n / 2);
                              return;
                            }
                          }
                        }
                        var2 = -92 % ((76 - param0) / 41);
                        if (this.field_I == null) {
                          return;
                        } else {
                          this.field_G = -(this.field_I.field_m / 2);
                          this.field_y = -(this.field_I.field_n / 2);
                          return;
                        }
                      } else {
                        var2 = -92 % ((76 - param0) / 41);
                        if (this.field_I == null) {
                          return;
                        } else {
                          this.field_G = -(this.field_I.field_m / 2);
                          this.field_y = -(this.field_I.field_n / 2);
                          return;
                        }
                      }
                    }
                  } else {
                    this.field_I = qi.field_K[1];
                    if (var3 != 0) {
                      L4: {
                        if (-5 != (this.field_w ^ -1)) {
                          L5: {
                            if (5 == this.field_w) {
                              break L5;
                            } else {
                              if (-7 == (this.field_w ^ -1)) {
                                this.field_I = tl.field_b;
                                if (var3 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              } else {
                                var2 = -92 % ((76 - param0) / 41);
                                if (this.field_I == null) {
                                  return;
                                } else {
                                  this.field_G = -(this.field_I.field_m / 2);
                                  this.field_y = -(this.field_I.field_n / 2);
                                  return;
                                }
                              }
                            }
                          }
                          this.field_I = hb.field_m[this.field_l][0];
                          this.field_z = pf.a((byte) -92, 2000);
                          if (var3 == 0) {
                            break L4;
                          } else {
                            this.field_I = qi.field_K[0];
                            this.field_I = ak.field_t[this.field_i];
                            var2 = -92 % ((76 - param0) / 41);
                            if (this.field_I == null) {
                              return;
                            } else {
                              this.field_G = -(this.field_I.field_m / 2);
                              this.field_y = -(this.field_I.field_n / 2);
                              return;
                            }
                          }
                        } else {
                          this.field_I = wc.field_h;
                          if (var3 == 0) {
                            break L4;
                          } else {
                            L6: {
                              L7: {
                                if (5 == this.field_w) {
                                  break L7;
                                } else {
                                  if (-7 == (this.field_w ^ -1)) {
                                    this.field_I = tl.field_b;
                                    if (var3 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              this.field_I = hb.field_m[this.field_l][0];
                              this.field_z = pf.a((byte) -92, 2000);
                              if (var3 == 0) {
                                break L6;
                              } else {
                                this.field_I = qi.field_K[0];
                                this.field_I = ak.field_t[this.field_i];
                                break L6;
                              }
                            }
                            var2 = -92 % ((76 - param0) / 41);
                            if (this.field_I == null) {
                              return;
                            } else {
                              this.field_G = -(this.field_I.field_m / 2);
                              this.field_y = -(this.field_I.field_n / 2);
                              return;
                            }
                          }
                        }
                      }
                      var2 = -92 % ((76 - param0) / 41);
                      if (this.field_I == null) {
                        return;
                      } else {
                        this.field_G = -(this.field_I.field_m / 2);
                        this.field_y = -(this.field_I.field_n / 2);
                        return;
                      }
                    } else {
                      var2 = -92 % ((76 - param0) / 41);
                      if (this.field_I == null) {
                        return;
                      } else {
                        this.field_G = -(this.field_I.field_m / 2);
                        this.field_y = -(this.field_I.field_n / 2);
                        return;
                      }
                    }
                  }
                }
              }
              var2 = -92 % ((76 - param0) / 41);
              if (this.field_I == null) {
                return;
              } else {
                this.field_G = -(this.field_I.field_m / 2);
                this.field_y = -(this.field_I.field_n / 2);
                return;
              }
            }
          } else {
            var2 = -92 % ((76 - param0) / 41);
            if (this.field_I != null) {
              this.field_G = -(this.field_I.field_m / 2);
              this.field_y = -(this.field_I.field_n / 2);
              return;
            } else {
              return;
            }
          }
        } else {
          if (-2 == (this.field_w ^ -1)) {
            this.field_I = ak.field_t[this.field_i];
            var2 = -92 % ((76 - param0) / 41);
            if (this.field_I != null) {
              this.field_G = -(this.field_I.field_m / 2);
              this.field_y = -(this.field_I.field_n / 2);
              return;
            } else {
              return;
            }
          } else {
            L8: {
              if ((this.field_w ^ -1) == -3) {
                this.field_I = qi.field_K[0];
                if (var3 == 0) {
                  break L8;
                } else {
                  this.field_I = ak.field_t[this.field_i];
                  var2 = -92 % ((76 - param0) / 41);
                  if (this.field_I != null) {
                    this.field_G = -(this.field_I.field_m / 2);
                    this.field_y = -(this.field_I.field_n / 2);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (-4 != (this.field_w ^ -1)) {
                  if (-5 != (this.field_w ^ -1)) {
                    L9: {
                      if (5 == this.field_w) {
                        break L9;
                      } else {
                        if (-7 == (this.field_w ^ -1)) {
                          this.field_I = tl.field_b;
                          if (var3 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        } else {
                          var2 = -92 % ((76 - param0) / 41);
                          if (this.field_I != null) {
                            this.field_G = -(this.field_I.field_m / 2);
                            this.field_y = -(this.field_I.field_n / 2);
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    this.field_I = hb.field_m[this.field_l][0];
                    this.field_z = pf.a((byte) -92, 2000);
                    if (var3 == 0) {
                      break L8;
                    } else {
                      this.field_I = qi.field_K[0];
                      this.field_I = ak.field_t[this.field_i];
                      var2 = -92 % ((76 - param0) / 41);
                      if (this.field_I != null) {
                        this.field_G = -(this.field_I.field_m / 2);
                        this.field_y = -(this.field_I.field_n / 2);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    this.field_I = wc.field_h;
                    if (var3 == 0) {
                      break L8;
                    } else {
                      L10: {
                        L11: {
                          if (5 == this.field_w) {
                            break L11;
                          } else {
                            if (-7 == (this.field_w ^ -1)) {
                              this.field_I = tl.field_b;
                              if (var3 == 0) {
                                break L10;
                              } else {
                                break L11;
                              }
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.field_I = hb.field_m[this.field_l][0];
                        this.field_z = pf.a((byte) -92, 2000);
                        if (var3 == 0) {
                          break L10;
                        } else {
                          this.field_I = qi.field_K[0];
                          this.field_I = ak.field_t[this.field_i];
                          break L10;
                        }
                      }
                      var2 = -92 % ((76 - param0) / 41);
                      if (this.field_I != null) {
                        this.field_G = -(this.field_I.field_m / 2);
                        this.field_y = -(this.field_I.field_n / 2);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  this.field_I = qi.field_K[1];
                  if (var3 == 0) {
                    break L8;
                  } else {
                    L12: {
                      if (-5 != (this.field_w ^ -1)) {
                        break L12;
                      } else {
                        this.field_I = wc.field_h;
                        break L12;
                      }
                    }
                    L13: {
                      L14: {
                        if (5 == this.field_w) {
                          break L14;
                        } else {
                          if (-7 == (this.field_w ^ -1)) {
                            this.field_I = tl.field_b;
                            if (var3 == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          } else {
                            break L13;
                          }
                        }
                      }
                      this.field_I = hb.field_m[this.field_l][0];
                      this.field_z = pf.a((byte) -92, 2000);
                      if (var3 == 0) {
                        break L13;
                      } else {
                        this.field_I = qi.field_K[0];
                        this.field_I = ak.field_t[this.field_i];
                        break L13;
                      }
                    }
                    var2 = -92 % ((76 - param0) / 41);
                    if (this.field_I != null) {
                      this.field_G = -(this.field_I.field_m / 2);
                      this.field_y = -(this.field_I.field_n / 2);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            var2 = -92 % ((76 - param0) / 41);
            if (this.field_I != null) {
              this.field_G = -(this.field_I.field_m / 2);
              this.field_y = -(this.field_I.field_n / 2);
              return;
            } else {
              return;
            }
          }
        }
    }

    ki(int param0, int param1, int param2) {
        this.field_t = null;
        this.field_o = new ki[6];
        this.field_m = 0;
        this.field_F = 0;
        this.field_k = param2;
        this.field_l = param1;
        this.field_w = param0;
        this.a(false);
    }

    static {
        field_r = new String[]{"Fire 300 nuts on one level", "Complete the game", "Dislodge 30 nuts at once", "Dislodge 4 monkeys in a row without interruption", "Dislodge 5 monkeys in a row without interruption", "Dislodge 6 monkeys in a row without interruption", "Dislodge any set of non-monkey objects 50 times, without clearing a monkey", "Dislodge a monkey with 10 or more nuts attatched", "Dislodge a monkey with 15 or more nuts attatched", "Dislodge a monkey with 20 or more nuts attatched"};
    }
}
