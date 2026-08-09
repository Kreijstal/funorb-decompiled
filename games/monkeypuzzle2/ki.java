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
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int var3;
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
                        fieldTemp$0 = this.field_C + 1;
                        this.field_C = this.field_C + 1;
                        if (fieldTemp$0 != 4) {
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
                                fieldTemp$1 = this.field_C + 1;
                                this.field_C = this.field_C + 1;
                                if ((fieldTemp$1 ^ -1) > -5) {
                                  this.field_I = qi.field_K[this.field_C];
                                  if (var3 != 0) {
                                    L2: {
                                      if (this.field_n != 0) {
                                        break L2;
                                      } else {
                                        if ((this.field_z % 100 ^ -1) > -33) {
                                          if (-1 == (this.field_z & 7 ^ -1)) {
                                            fieldTemp$2 = this.field_C + 1;
                                            this.field_C = this.field_C + 1;
                                            if (-5 != (fieldTemp$2 ^ -1)) {
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
                                                        fieldTemp$3 = this.field_C + 1;
                                                        this.field_C = this.field_C + 1;
                                                        if (fieldTemp$3 == 4) {
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
                                            fieldTemp$4 = this.field_C + 1;
                                            this.field_C = this.field_C + 1;
                                            if (fieldTemp$4 == 4) {
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
                  fieldTemp$5 = this.field_C + 1;
                  this.field_C = this.field_C + 1;
                  if ((fieldTemp$5 ^ -1) > -5) {
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
                  fieldTemp$6 = this.field_C + 1;
                  this.field_C = this.field_C + 1;
                  if (-5 != (fieldTemp$6 ^ -1)) {
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
                              fieldTemp$7 = this.field_C + 1;
                              this.field_C = this.field_C + 1;
                              if (fieldTemp$7 == 4) {
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
                  fieldTemp$8 = this.field_C + 1;
                  this.field_C = this.field_C + 1;
                  if (fieldTemp$8 == 4) {
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
                        fieldTemp$9 = this.field_C + 1;
                        this.field_C = this.field_C + 1;
                        if (fieldTemp$9 != 4) {
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
                                  fieldTemp$10 = this.field_C + 1;
                                  this.field_C = this.field_C + 1;
                                  if ((fieldTemp$10 ^ -1) > -5) {
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
                                                fieldTemp$11 = this.field_C + 1;
                                                this.field_C = this.field_C + 1;
                                                if (-5 != (fieldTemp$11 ^ -1)) {
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
                                            fieldTemp$12 = this.field_C + 1;
                                            this.field_C = this.field_C + 1;
                                            if (fieldTemp$12 == 4) {
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
                  fieldTemp$13 = this.field_C + 1;
                  this.field_C = this.field_C + 1;
                  if ((fieldTemp$13 ^ -1) > -5) {
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
                  fieldTemp$14 = this.field_C + 1;
                  this.field_C = this.field_C + 1;
                  if (-5 != (fieldTemp$14 ^ -1)) {
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
                              fieldTemp$15 = this.field_C + 1;
                              this.field_C = this.field_C + 1;
                              if (fieldTemp$15 == 4) {
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
                  fieldTemp$16 = this.field_C + 1;
                  this.field_C = this.field_C + 1;
                  if (fieldTemp$16 == 4) {
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                stackIn_8_0 = new String(var3);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("ki.G(").append(param0).append(',');

            if (param1 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final void b(byte param0) {
        int stackIn_8_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_74_0 = 0;
        int var2;
        this.field_q = this.field_q + this.field_D;
        this.field_B = this.field_B + this.field_v;
        int fieldTemp$0 = this.field_u;
        this.field_u = this.field_u + 1;
        if (fieldTemp$0 <= 250) {
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
                      stackIn_67_0 = 0;
                      break L3;
                    } else {
                      stackIn_67_0 = 1;
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
                  stackIn_74_0 = 0;
                  break L4;
                } else {
                  stackIn_74_0 = 1;
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
                          stackIn_35_0 = 0;
                          break L7;
                        } else {
                          stackIn_35_0 = 1;
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
                      stackIn_46_0 = 0;
                      break L8;
                    } else {
                      stackIn_46_0 = 1;
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
                        stackIn_8_0 = 0;
                        break L11;
                      } else {
                        stackIn_8_0 = 1;
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
                    stackIn_19_0 = 0;
                    break L12;
                  } else {
                    stackIn_19_0 = 1;
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ki.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
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
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
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
            stackIn_27_0 = (RuntimeException) (var5);

            stackIn_27_1 = new StringBuilder().append("ki.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
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
        int var2;
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
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        L0: {
          this.field_A = false;
          stackIn_2_0 = this;

          if (!param0) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
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
          stackIn_20_0 = this;

          if ((this.field_w ^ -1) == -3) {
            stackIn_22_0 = this;
            stackIn_22_1 = 1;
            break L1;
          } else {
            stackIn_21_0 = this;

            if ((this.field_w ^ -1) != -4) {
              stackIn_22_0 = this;
              stackIn_22_1 = 0;
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
        int incrementValue$0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var14 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = MonkeyPuzzle2.field_F ? 1 : 0;
                    var2 = -84 + ((int)this.field_B - -this.field_G);
                    var3 = (int)this.field_q + this.field_y - 4;
                    var4 = 8 + this.field_I.field_m;
                    if ((var2 ^ -1) <= -1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var4 = var4 + var2;
                    var2 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = 8 + this.field_I.field_n;
                    if (-1 < (var3 ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var5 = var5 + var3;
                    var3 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (sb.field_m.field_k < var4 + var2) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var4 = sb.field_m.field_k - var2;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (sb.field_m.field_j >= var3 + var5) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var5 = sb.field_m.field_j - var3;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (param0 >= 104) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                case 12: {
                    var6 = var3 * sb.field_m.field_k + var2;
                    var7 = -var4 + sb.field_m.field_k;
                    var14 = sb.field_m.field_s;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    incrementValue$0 = var5;
                    var5--;
                    if ((incrementValue$0 ^ -1) < -1) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    return;
                }
                case 15: {
                    if (var10 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                case 17: {
                    var9 = -var4;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if ((var9 ^ -1) <= -1) {
                        statePc = 28;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_29_0 = this.field_k - -1 ^ -1;
                    stackIn_20_0 = stackIn_29_0;
                    stackIn_29_1 = var14[var6] ^ -1;
                    stackIn_20_1 = stackIn_29_1;
                    if (var10 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (stackIn_20_0 == stackIn_20_1) {
                        statePc = 22;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var14[var6] = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (this.field_w != 3) {
                        statePc = 27;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (16777212 <= var14[var6]) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var14[var6] = 0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    var6++;
                    var9++;
                    if (var10 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = var6;
                    stackIn_29_1 = var7;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var6 = stackIn_29_0 + stackIn_29_1;
                    if (var10 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, ki param1) {
        ki stackIn_5_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        ki stackOut_4_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        if (param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_v = -0.48507803678512573f;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var3_int >= this.field_m) {
                            statePc = 20;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this.field_o[var3_int];
                        stackIn_21_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var4 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 == param1) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.field_o[var3_int] = null;
                        if (this.field_l == param1.field_l) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (this.field_p == param1.field_l) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (this.field_l == param1.field_p) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param1.field_p != this.field_p) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_F = this.field_F - 1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_m = this.field_m - 1;
                        if (var3_int < 5) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((this.field_w ^ -1) != -5) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        gl.a(this.field_o, var3_int + 1, this.field_o, var3_int, -var3_int + this.field_m);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_o[this.field_m] = null;
                        if (var4 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var3_int++;
                        if (var4 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = this;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (((ki) (this)).field_m < this.field_F) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw new IllegalStateException();
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_27_0 = (RuntimeException) (var3);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = new StringBuilder().append("ki.P(").append(param0).append(',');
                    stackIn_26_1 = stackIn_27_1;
                    if (param1 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    throw la.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e(int param0) {
        int var2;
        int var3;
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
