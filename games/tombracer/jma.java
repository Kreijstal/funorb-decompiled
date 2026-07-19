/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jma implements noa {
    private int field_l;
    private int field_i;
    static ka[] field_a;
    private boolean field_m;
    private int field_c;
    private int field_e;
    static String field_o;
    private boolean field_p;
    static cn field_j;
    private int field_f;
    private int field_n;
    private boolean field_g;
    private koa field_d;
    private int field_k;
    static String field_h;
    private int field_b;

    final void a(ew param0, byte param1, kh param2) {
        try {
            this.field_d.a(30489, param0, param2);
            param2.a((byte) -127, this.field_e, 8);
            param2.a((byte) -45, this.field_k, 8);
            param2.a((byte) -125, this.field_i, 8);
            if (param1 <= 65) {
                kh var5 = (kh) null;
                this.a((ew) null, (byte) 97, (kh) null);
            }
            param2.a((byte) -126, this.field_l, 8);
            param2.a((byte) -45, this.field_f, 8);
            param2.a((byte) 77, this.field_m ? 1 : 0, 1);
            param2.a((byte) -127, this.field_p ? 1 : 0, 1);
            param2.a((byte) -126, this.field_c, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "jma.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(byte param0) {
        if (param0 >= -63) {
            return;
        }
        this.field_n = 3;
    }

    final void b(int param0, int param1) {
        if (param1 < 50) {
            return;
        }
        this.field_c = param0;
    }

    private final void e(byte param0) {
        if (param0 == -102) {
          if ((this.field_l ^ -1) >= -1) {
            this.a(8);
            if (TombRacer.field_G) {
              this.field_n = 4;
              this.field_b = this.field_l;
              return;
            } else {
              return;
            }
          } else {
            this.field_n = 4;
            this.field_b = this.field_l;
            return;
          }
        } else {
          this.a(-19, 46, -116, 50, -114, 44);
          if ((this.field_l ^ -1) >= -1) {
            this.a(8);
            if (!TombRacer.field_G) {
              return;
            } else {
              this.field_n = 4;
              this.field_b = this.field_l;
              return;
            }
          } else {
            this.field_n = 4;
            this.field_b = this.field_l;
            return;
          }
        }
    }

    public static void e(int param0) {
        field_a = null;
        field_h = null;
        if (param0 <= 39) {
            return;
        }
        field_o = null;
        field_j = null;
    }

    final boolean b(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 4) {
          if ((this.field_n ^ -1) != -2) {
            if (this.field_n != 2) {
              if (this.field_n == 3) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_j = (cn) null;
          if ((this.field_n ^ -1) != -2) {
            if (this.field_n == 2) {
              return true;
            } else {
              L0: {
                if (this.field_n != 3) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    jma(int param0) {
        this(param0, new lj[]{});
    }

    private final void a(int param0) {
        if (param0 == 8) {
          if ((this.field_k ^ -1) < -1) {
            this.field_b = this.field_k;
            this.field_n = 5;
            if (TombRacer.field_G) {
              this.a((byte) 63);
              return;
            } else {
              return;
            }
          } else {
            this.a((byte) 63);
            return;
          }
        } else {
          this.e((byte) 60);
          if ((this.field_k ^ -1) < -1) {
            this.field_b = this.field_k;
            this.field_n = 5;
            if (!TombRacer.field_G) {
              return;
            } else {
              this.a((byte) 63);
              return;
            }
          } else {
            this.a((byte) 63);
            return;
          }
        }
    }

    private final void g(int param0) {
        this.field_n = 3;
        if (!(!this.field_m)) {
            this.d((byte) -70);
        }
        if (param0 <= 49) {
            this.f(95);
            return;
        }
    }

    private final void a(byte param0) {
        this.field_n = 0;
        this.field_b = this.field_f;
        int var2 = 101 % ((param0 - -2) / 52);
        if (!(!this.field_p)) {
            this.d((byte) -70);
        }
    }

    final void a(byte param0, ew param1) {
        try {
            if (param0 != 48) {
                field_j = (cn) null;
            }
            this.field_d.a(param1, 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "jma.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final koa h(int param0) {
        if (param0 != 1) {
            this.e((byte) -23);
            return this.field_d;
        }
        return this.field_d;
    }

    private final boolean b(boolean param0) {
        if (-1 > (this.field_b ^ -1)) {
          this.field_b = this.field_b - 1;
          if (!param0) {
            this.field_b = 15;
            return false;
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final boolean b(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 >= 70) {
          if (this.field_n != 3) {
            if ((this.field_n ^ -1) != -5) {
              if (5 == this.field_n) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_h = (String) null;
          if (this.field_n != 3) {
            if ((this.field_n ^ -1) == -5) {
              return true;
            } else {
              L0: {
                if (5 != this.field_n) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (this.field_g) {
          return;
        } else {
          if (param0 == -14) {
            L0: {
              L1: {
                var3 = this.field_n;
                if (var3 == 0) {
                  if (this.b(true)) {
                    if (param1) {
                      this.f(param0 + -86);
                      if (var4 != 0) {
                        break L1;
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
                  if (1 == var3) {
                    if (var4 == 0) {
                      break L1;
                    } else {
                      L2: {
                        if ((var3 ^ -1) == -3) {
                          if (this.b(true)) {
                            this.g(103);
                            if (var4 == 0) {
                              break L0;
                            } else {
                              break L2;
                            }
                          } else {
                            return;
                          }
                        } else {
                          if (var3 == 3) {
                            if (var4 == 0) {
                              break L2;
                            } else {
                              if (4 != var3) {
                                if (5 == var3) {
                                  if (this.b(true)) {
                                    this.a((byte) 122);
                                    break L0;
                                  } else {
                                    return;
                                  }
                                } else {
                                  return;
                                }
                              } else {
                                if (5 == var3) {
                                  if (this.b(true)) {
                                    this.a((byte) 122);
                                    return;
                                  } else {
                                    return;
                                  }
                                } else {
                                  return;
                                }
                              }
                            }
                          } else {
                            L3: {
                              if (4 != var3) {
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            if (5 == var3) {
                              if (!this.b(true)) {
                                return;
                              } else {
                                this.a((byte) 122);
                                return;
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      if (!param1) {
                        this.e((byte) -102);
                        if (var4 == 0) {
                          break L0;
                        } else {
                          L4: {
                            if (param1) {
                              break L4;
                            } else {
                              if (this.b(true)) {
                                this.a(8);
                                if (var4 == 0) {
                                  break L0;
                                } else {
                                  break L4;
                                }
                              } else {
                                return;
                              }
                            }
                          }
                          this.c((byte) -69);
                          if (var4 == 0) {
                            break L0;
                          } else {
                            L5: {
                              if (this.b(true)) {
                                this.a((byte) 122);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    L6: {
                      L7: {
                        if ((var3 ^ -1) == -3) {
                          if (this.b(true)) {
                            this.g(103);
                            if (var4 != 0) {
                              break L7;
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          L8: {
                            if (var3 != 3) {
                              break L8;
                            } else {
                              if (var4 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (4 != var3) {
                              break L9;
                            } else {
                              if (var4 == 0) {
                                break L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (5 == var3) {
                            if (!this.b(true)) {
                              return;
                            } else {
                              this.a((byte) 122);
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                      if (!param1) {
                        this.e((byte) -102);
                        if (var4 != 0) {
                          break L6;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                    L10: {
                      if (param1) {
                        break L10;
                      } else {
                        if (this.b(true)) {
                          this.a(8);
                          if (var4 != 0) {
                            break L10;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                    this.c((byte) -69);
                    if (var4 != 0) {
                      L11: {
                        if (this.b(true)) {
                          this.a((byte) 122);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              if (!param1) {
                this.c(param0 ^ 8182);
                if (var4 == 0) {
                  break L0;
                } else {
                  if (this.b(true)) {
                    L12: {
                      this.g(103);
                      if (var4 == 0) {
                        break L12;
                      } else {
                        if (!param1) {
                          this.e((byte) -102);
                          if (var4 == 0) {
                            break L12;
                          } else {
                            L13: {
                              if (param1) {
                                break L13;
                              } else {
                                if (this.b(true)) {
                                  this.a(8);
                                  if (var4 == 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                } else {
                                  return;
                                }
                              }
                            }
                            this.c((byte) -69);
                            if (var4 == 0) {
                              break L12;
                            } else {
                              if (this.b(true)) {
                                this.a((byte) 122);
                                break L12;
                              } else {
                                return;
                              }
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (this.b(true)) {
                  this.d(-121);
                  if (var4 != 0) {
                    this.c(param0 ^ 8182);
                    if (this.b(true)) {
                      this.g(103);
                      if (var4 != 0) {
                        if (!param1) {
                          this.e((byte) -102);
                          if (var4 != 0) {
                            L14: {
                              L15: {
                                if (param1) {
                                  break L15;
                                } else {
                                  if (this.b(true)) {
                                    this.a(8);
                                    if (var4 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  } else {
                                    return;
                                  }
                                }
                              }
                              this.c((byte) -69);
                              if (var4 == 0) {
                                break L14;
                              } else {
                                if (this.b(true)) {
                                  this.a((byte) 122);
                                  break L14;
                                } else {
                                  return;
                                }
                              }
                            }
                            return;
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
                } else {
                  return;
                }
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            this.field_g = true;
            return this.field_p;
        }
        return this.field_p;
    }

    final boolean f(byte param0) {
        if (param0 != -56) {
            return true;
        }
        return false;
    }

    private final void f(int param0) {
        int var2 = 0;
        if (this.field_i <= 0) {
          this.d(-125);
          if (TombRacer.field_G) {
            this.field_n = 1;
            this.field_b = this.field_i;
            var2 = 109 % ((param0 - -20) / 61);
            return;
          } else {
            var2 = 109 % ((param0 - -20) / 61);
            return;
          }
        } else {
          this.field_n = 1;
          this.field_b = this.field_i;
          var2 = 109 % ((param0 - -20) / 61);
          return;
        }
    }

    private final void d(byte param0) {
        lj[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        lj[] var7 = null;
        lj[] var8 = null;
        lj var9 = null;
        lj[] var10 = null;
        lj var11 = null;
        lj[] var12 = null;
        lj var13 = null;
        lj[] var14 = null;
        lj var15 = null;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if ((this.field_c ^ -1) >= -1) {
            break L0;
          } else {
            this.field_c = this.field_c - 1;
            if (-1 == (this.field_c ^ -1)) {
              this.field_g = true;
              break L0;
            } else {
              if (param0 != -70) {
                field_o = (String) null;
                if (null != this.field_d) {
                  var7 = this.field_d.c(1);
                  var10 = var7;
                  var3 = var7;
                  var4 = 0;
                  L1: while (true) {
                    if (var10.length > var4) {
                      var11 = var10[var4];
                      if (var6 == 0) {
                        L2: {
                          if (var11 != null) {
                            var11.m(119);
                            break L2;
                          } else {
                            if (var6 == 0) {
                              break L2;
                            } else {
                              var11.m(119);
                              break L2;
                            }
                          }
                        }
                        var4++;
                        continue L1;
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
                if (null != this.field_d) {
                  var7 = this.field_d.c(1);
                  var8 = var7;
                  var3 = var7;
                  var4 = 0;
                  L3: while (true) {
                    if (var8.length > var4) {
                      var9 = var8[var4];
                      if (var6 == 0) {
                        L4: {
                          if (var9 != null) {
                            var9.m(119);
                            break L4;
                          } else {
                            if (var6 == 0) {
                              break L4;
                            } else {
                              var9.m(119);
                              break L4;
                            }
                          }
                        }
                        var4++;
                        continue L3;
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
            }
          }
        }
        if (param0 == -70) {
          if (null != this.field_d) {
            var7 = this.field_d.c(1);
            var14 = var7;
            var4 = 0;
            L5: while (true) {
              if (var14.length > var4) {
                var15 = var14[var4];
                if (var6 == 0) {
                  L6: {
                    if (var15 != null) {
                      var15.m(119);
                      break L6;
                    } else {
                      if (var6 == 0) {
                        break L6;
                      } else {
                        var15.m(119);
                        break L6;
                      }
                    }
                  }
                  var4++;
                  continue L5;
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
          field_o = (String) null;
          if (null != this.field_d) {
            var7 = this.field_d.c(1);
            var12 = var7;
            var4 = 0;
            L7: while (true) {
              if (var12.length > var4) {
                var13 = var12[var4];
                if (var6 == 0) {
                  L8: {
                    if (var13 != null) {
                      var13.m(119);
                      break L8;
                    } else {
                      if (var6 == 0) {
                        break L8;
                      } else {
                        var13.m(119);
                        break L8;
                      }
                    }
                  }
                  var4++;
                  continue L7;
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
    }

    private final void c(int param0) {
        if (param0 != -8188) {
            return;
        }
        this.field_n = 0;
    }

    private final void d(int param0) {
        if (param0 <= -119) {
          if (-1 > (this.field_e ^ -1)) {
            this.field_b = this.field_e;
            this.field_n = 2;
            if (TombRacer.field_G) {
              this.g(69);
              return;
            } else {
              return;
            }
          } else {
            this.g(69);
            return;
          }
        } else {
          this.field_b = -37;
          if (-1 > (this.field_e ^ -1)) {
            this.field_b = this.field_e;
            this.field_n = 2;
            if (!TombRacer.field_G) {
              return;
            } else {
              this.g(69);
              return;
            }
          } else {
            this.g(69);
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_l = param1;
        if (param4 != 5) {
          this.d((byte) -52);
          this.field_f = param2;
          this.field_k = param3;
          this.field_i = param0;
          this.field_e = param5;
          return;
        } else {
          this.field_f = param2;
          this.field_k = param3;
          this.field_i = param0;
          this.field_e = param5;
          return;
        }
    }

    private jma(int param0, lj[] param1) {
        this.field_p = false;
        this.field_m = true;
        try {
            this.field_d = new koa(param0, 0);
            this.field_d.a(9, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "jma.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 85, param1, this.field_n);
        if (param0 <= 59) {
          this.field_c = 32;
          param1 = fs.a((byte) 93, param1, this.field_b);
          return param1;
        } else {
          param1 = fs.a((byte) 93, param1, this.field_b);
          return param1;
        }
    }

    jma(int param0, la param1, kh param2) {
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        this.field_p = false;
        this.field_m = true;
        try {
          L0: {
            L1: {
              L2: {
                this.field_d = new koa(param0, 0, param1.field_E, param2);
                if (param1.field_E > 9) {
                  break L2;
                } else {
                  this.field_e = param2.b((byte) 44, 8);
                  this.field_k = param2.b((byte) 44, 8);
                  if (!TombRacer.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_e = param2.b((byte) 44, 8);
              this.field_k = param2.b((byte) 44, 8);
              this.field_i = param2.b((byte) 44, 8);
              this.field_l = param2.b((byte) 44, 8);
              this.field_f = param2.b((byte) 44, 8);
              break L1;
            }
            L3: {
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (1 == param2.b((byte) 44, 1)) {
                stackOut_6_0 = this;
                stackOut_6_1 = 1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              ((jma) (this)).field_m = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if ((param2.b((byte) 44, 1) ^ -1) == -2) {
                stackOut_9_0 = this;
                stackOut_9_1 = 1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L4;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 0;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L4;
              }
            }
            ((jma) (this)).field_p = stackIn_10_1 != 0;
            this.field_c = param2.b((byte) 44, 4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("jma.<init>(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        boolean discarded$4 = false;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 != -2) {
          L0: {
            discarded$4 = this.b(true);
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((jma) (this)).field_p = stackIn_8_1 != 0;
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((jma) (this)).field_p = stackIn_4_1 != 0;
          return;
        }
    }

    static {
        field_o = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_h = "Create unrated game";
    }
}
