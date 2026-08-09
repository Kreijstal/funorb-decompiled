/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends tl {
    static lg field_t;
    static String field_y;
    private byte[] field_E;
    private int field_i;
    static qb[] field_A;
    private di field_n;
    private byte[] field_w;
    private int field_q;
    static int field_C;
    private pa field_s;
    static int[] field_u;
    private int field_v;
    static kc field_o;
    private be field_D;
    private be field_F;
    private jk field_k;
    private ve field_x;
    private lk field_B;
    private vn field_h;
    private int field_p;
    private vn field_m;
    private boolean field_l;
    private boolean field_j;
    private boolean field_z;
    private long field_r;

    final static fe a(int param0, int param1) {
        fe var2 = new fe();
        if (param1 != -21402) {
            tj.b(68);
        }
        i.field_e.b(var2, -1);
        gb.a(param0, true);
        return var2;
    }

    final void g(byte param0) {
        if (!(null != this.field_F)) {
            return;
        }
        this.field_l = true;
        if (param0 != 53) {
            this.field_x = (ve) null;
        }
        if (!(null != this.field_h)) {
            this.field_h = new vn();
        }
    }

    final void a(boolean param0) {
        ve discarded$0 = null;
        ve discarded$1 = null;
        pg var2;
        int var3;
        int var4;
        pg stackIn_15_0 = null;
        pg stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.field_h != null) {
          if (this.d((byte) 122) == null) {
            return;
          } else {
            if (!param0) {
              var2 = this.field_m.b(12623);
              L0: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  L1: {
                    L2: {
                      var3 = (int)var2.field_e;
                      if (var3 < 0) {
                        break L2;
                      } else {
                        if (this.field_k.field_f <= var3) {
                          break L2;
                        } else {
                          if (-1 != (this.field_k.field_b[var3] ^ -1)) {
                            L3: {
                              if (0 == this.field_E[var3]) {
                                discarded$0 = this.a(1, -103, var3);
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            L4: {
                              if (0 != (this.field_E[var3] ^ -1)) {
                                break L4;
                              } else {
                                discarded$1 = this.a(2, 62, var3);
                                break L4;
                              }
                            }
                            if (this.field_E[var3] != 1) {
                              break L1;
                            } else {
                              var2.a(true);
                              break L1;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    L5: {
                      stackIn_15_0 = (pg) (var2);

                      if (param0) {
                        stackIn_16_0 = (pg) ((Object) stackIn_15_0);
                        stackIn_16_1 = 0;
                        break L5;
                      } else {
                        stackIn_16_0 = (pg) ((Object) stackIn_15_0);
                        stackIn_16_1 = 1;
                        break L5;
                      }
                    }
                    ((pg) (Object) stackIn_16_0).a(stackIn_16_1 != 0);
                    break L1;
                  }
                  var2 = this.field_m.a(0);
                  continue L0;
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static String a(int param0, String[] param1, String param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_6_0 = 0;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        StringBuilder var7 = null;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        String var14 = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = param2.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6 = param2.indexOf("<%", var5);
              if (-1 >= (var6 ^ -1)) {
                stackIn_6_0 = var6 + 2;
                var5 = stackIn_6_0;
                L2: while (true) {
                  L3: {
                    if (var3_int <= var5) {
                      break L3;
                    } else {
                      if (!e.a(30, param2.charAt(var5))) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var14 = param2.substring(var6 + 2, var5);
                  var14 = var14;
                  if (!fi.a((CharSequence) ((Object) var14), 10)) {
                    continue L1;
                  } else {
                    if ((var5 ^ -1) <= (var3_int ^ -1)) {
                      continue L1;
                    } else {
                      if (param2.charAt(var5) != 62) {
                        continue L1;
                      } else {
                        var5++;
                        var8 = dc.a((CharSequence) ((Object) var14), 126);
                        var4 = var4 + (param1[var8].length() + -var5 - -var6);
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                var6 = -96 % ((param0 - 51) / 62);
                var7 = new StringBuilder(var4);
                var8 = 0;
                var5 = 0;
                L4: while (true) {
                  var9 = param2.indexOf("<%", var5);
                  if (-1 < (var9 ^ -1)) {
                    discarded$0 = var7.append(param2.substring(var8));
                    stackIn_27_0 = var7.toString();
                    break L0;
                  } else {
                    var5 = var9 - -2;
                    L5: while (true) {
                      L6: {
                        if (var3_int <= var5) {
                          break L6;
                        } else {
                          if (!e.a(30, param2.charAt(var5))) {
                            break L6;
                          } else {
                            var5++;
                            continue L5;
                          }
                        }
                      }
                      var10 = param2.substring(2 + var9, var5);
                      if (fi.a((CharSequence) ((Object) var10), 10)) {
                        if (var5 >= var3_int) {
                          continue L4;
                        } else {
                          if (param2.charAt(var5) == 62) {
                            var5++;
                            var11 = dc.a((CharSequence) ((Object) var10), 127);
                            discarded$1 = var7.append(param2.substring(var8, var9));
                            var8 = var5;
                            discarded$2 = var7.append(param1[var11]);
                            continue L4;
                          } else {
                            continue L4;
                          }
                        }
                      } else {
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("tj.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L7;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ')');
        }
        return stackIn_27_0;
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -69) {
                break L1;
              } else {
                tj.a(118, 80);
                break L1;
              }
            }
            stackIn_3_0 = gn.field_e.a(param0, "", -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("tj.Q(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, byte param1) {
        sc.a(false, false, param0);
        if (param1 >= -93) {
            field_t = (lg) null;
        }
    }

    final void f(byte param0) {
        ve discarded$0 = null;
        ve discarded$1 = null;
        ve discarded$2 = null;
        ve discarded$3 = null;
        int var2_int;
        ve var2;
        pg var3;
        int var4;
        int var5;
        pg var6;
        pg var7;
        L0: {
          L1: {
            L2: {
              var5 = ArcanistsMulti.field_G ? 1 : 0;
              if (null == this.field_h) {
                break L2;
              } else {
                if (null == this.d((byte) 119)) {
                  return;
                } else {
                  if (!this.field_j) {
                    if (this.field_l) {
                      var2_int = 1;
                      var3 = this.field_h.b(12623);
                      L3: while (true) {
                        if (var3 == null) {
                          L4: while (true) {
                            L5: {
                              if (this.field_k.field_b.length <= this.field_p) {
                                break L5;
                              } else {
                                if (-1 != (this.field_k.field_b[this.field_p] ^ -1)) {
                                  if (!this.field_B.b(-21)) {
                                    L6: {
                                      if (1 != this.field_E[this.field_p]) {
                                        discarded$0 = this.a(2, 61, this.field_p);
                                        break L6;
                                      } else {
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if ((this.field_E[this.field_p] ^ -1) == -2) {
                                        break L7;
                                      } else {
                                        var7 = new pg();
                                        var7.field_e = (long)this.field_p;
                                        this.field_h.b(var7, -1);
                                        var2_int = 0;
                                        break L7;
                                      }
                                    }
                                    this.field_p = this.field_p + 1;
                                    continue L4;
                                  } else {
                                    var2_int = 0;
                                    break L5;
                                  }
                                } else {
                                  this.field_p = this.field_p + 1;
                                  continue L4;
                                }
                              }
                            }
                            if (var2_int == 0) {
                              break L2;
                            } else {
                              this.field_p = 0;
                              this.field_l = false;
                              break L2;
                            }
                          }
                        } else {
                          L8: {
                            var4 = (int)var3.field_e;
                            if (1 == this.field_E[var4]) {
                              break L8;
                            } else {
                              discarded$1 = this.a(2, -114, var4);
                              break L8;
                            }
                          }
                          L9: {
                            if ((this.field_E[var4] ^ -1) != -2) {
                              var2_int = 0;
                              break L9;
                            } else {
                              var3.a(true);
                              break L9;
                            }
                          }
                          var3 = this.field_h.a(0);
                          continue L3;
                        }
                      }
                    } else {
                      this.field_h = null;
                      break L2;
                    }
                  } else {
                    var2_int = 1;
                    var3 = this.field_h.b(12623);
                    L10: while (true) {
                      if (var3 == null) {
                        L11: while (true) {
                          L12: {
                            if (this.field_p >= this.field_k.field_b.length) {
                              break L12;
                            } else {
                              if ((this.field_k.field_b[this.field_p] ^ -1) != -1) {
                                if (250 <= this.field_s.field_d) {
                                  var2_int = 0;
                                  break L12;
                                } else {
                                  L13: {
                                    if (-1 == (this.field_E[this.field_p] ^ -1)) {
                                      discarded$2 = this.a(1, 85, this.field_p);
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    if (0 == this.field_E[this.field_p]) {
                                      var6 = new pg();
                                      var6.field_e = (long)this.field_p;
                                      this.field_h.b(var6, -1);
                                      var2_int = 0;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  this.field_p = this.field_p + 1;
                                  continue L11;
                                }
                              } else {
                                this.field_p = this.field_p + 1;
                                continue L11;
                              }
                            }
                          }
                          if (var2_int != 0) {
                            this.field_p = 0;
                            this.field_j = false;
                            break L2;
                          } else {
                            if (!this.field_z) {
                              break L0;
                            } else {
                              if ((this.field_r ^ -1L) >= (qj.b(-26572) ^ -1L)) {
                                var2 = (ve) ((Object) this.field_n.a(10));
                                L15: while (true) {
                                  if (var2 == null) {
                                    break L1;
                                  } else {
                                    L16: {
                                      if (!var2.field_p) {
                                        if (!var2.field_n) {
                                          var2.field_n = true;
                                          break L16;
                                        } else {
                                          if (!var2.field_q) {
                                            throw new RuntimeException();
                                          } else {
                                            var2.a(true);
                                            break L16;
                                          }
                                        }
                                      } else {
                                        break L16;
                                      }
                                    }
                                    var2 = (ve) ((Object) this.field_n.c(-87));
                                    continue L15;
                                  }
                                }
                              } else {
                                break L0;
                              }
                            }
                          }
                        }
                      } else {
                        L17: {
                          var4 = (int)var3.field_e;
                          if (-1 == (this.field_E[var4] ^ -1)) {
                            discarded$3 = this.a(1, 96, var4);
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        L18: {
                          if (this.field_E[var4] != 0) {
                            var3.a(true);
                            break L18;
                          } else {
                            var2_int = 0;
                            break L18;
                          }
                        }
                        var3 = this.field_h.a(0);
                        continue L10;
                      }
                    }
                  }
                }
              }
            }
            if (!this.field_z) {
              break L0;
            } else {
              if ((this.field_r ^ -1L) >= (qj.b(-26572) ^ -1L)) {
                var2 = (ve) ((Object) this.field_n.a(10));
                L19: while (true) {
                  if (var2 == null) {
                    break L1;
                  } else {
                    L20: {
                      if (!var2.field_p) {
                        if (!var2.field_n) {
                          var2.field_n = true;
                          break L20;
                        } else {
                          if (!var2.field_q) {
                            throw new RuntimeException();
                          } else {
                            var2.a(true);
                            break L20;
                          }
                        }
                      } else {
                        break L20;
                      }
                    }
                    var2 = (ve) ((Object) this.field_n.c(-87));
                    continue L19;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          this.field_r = qj.b(-26572) - -1000L;
          break L0;
        }
        L21: {
          if (param0 >= 54) {
            break L21;
          } else {
            this.a(15, (byte) -128);
            break L21;
          }
        }
    }

    final jk d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (null != this.field_k) {
          return this.field_k;
        } else {
          L0: {
            if (this.field_x == null) {
              if (!this.field_B.c((byte) -66)) {
                this.field_x = (ve) ((Object) this.field_B.a(this.field_i, true, 255, (byte) -80, (byte) 0));
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_x.field_p) {
            var7 = this.field_x.c(-42);
            var6 = var7;
            var5 = var6;
            var2 = var5;
            if (param0 > 74) {
              L1: {
                if (this.field_x instanceof ea) {
                  try {
                    L2: {
                      if (var5 == null) {
                        throw new RuntimeException();
                      } else {
                        this.field_k = new jk(var7, this.field_q, this.field_w);
                        if (this.field_v != this.field_k.field_g) {
                          throw new RuntimeException();
                        } else {
                          break L2;
                        }
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3 = decompiledCaughtException;
                      this.field_k = null;
                      if (this.field_B.c((byte) 52)) {
                        this.field_x = null;
                        break L3;
                      } else {
                        this.field_x = (ve) ((Object) this.field_B.a(this.field_i, true, 255, (byte) -80, (byte) 0));
                        break L3;
                      }
                    }
                    return null;
                  }
                  break L1;
                } else {
                  try {
                    L4: {
                      if (var5 == null) {
                        throw new RuntimeException();
                      } else {
                        this.field_k = new jk(var7, this.field_q, this.field_w);
                        break L4;
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3 = decompiledCaughtException;
                      this.field_B.a((byte) 0);
                      this.field_k = null;
                      if (this.field_B.c((byte) -71)) {
                        this.field_x = null;
                        break L5;
                      } else {
                        this.field_x = (ve) ((Object) this.field_B.a(this.field_i, true, 255, (byte) -80, (byte) 0));
                        break L5;
                      }
                    }
                    return null;
                  }
                  if (null != this.field_D) {
                    this.field_s.a(this.field_i, 93, var7, this.field_D);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L6: {
                this.field_x = null;
                if (this.field_F == null) {
                  break L6;
                } else {
                  this.field_E = new byte[this.field_k.field_f];
                  break L6;
                }
              }
              return this.field_k;
            } else {
              return (jk) null;
            }
          } else {
            return null;
          }
        }
    }

    final static void c(int param0) {
        rk.field_O = null;
        if (param0 < 62) {
            field_C = -45;
        }
        qn.field_ob = null;
        mj.field_p = -1;
    }

    private final ve a(int param0, int param1, int param2) {
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        Object stackIn_87_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6 = 0;
        int var7_int = 0;
        Exception var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ve var13 = null;
        byte[] var14 = null;
        byte[] var19 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        byte[] var31 = null;
        L0: {
          var11 = ArcanistsMulti.field_G ? 1 : 0;
          var13 = (ve) ((Object) this.field_n.a((long)param2, -77));
          var4 = var13;
          if (var13 == null) {
            break L0;
          } else {
            if (param0 != 0) {
              break L0;
            } else {
              if (var13.field_q) {
                break L0;
              } else {
                if (!var13.field_p) {
                  break L0;
                } else {
                  var13.a(true);
                  var4 = null;
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
              if (0 != param0) {
                if (param0 != 1) {
                  if (-3 == (param0 ^ -1)) {
                    if (null != this.field_F) {
                      if ((this.field_E[param2] ^ -1) == 0) {
                        if (!this.field_B.b(-21)) {
                          var4 = this.field_B.a(param2, false, this.field_i, (byte) -80, (byte) 2);
                          break L2;
                        } else {
                          return null;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  if (null == this.field_F) {
                    throw new RuntimeException();
                  } else {
                    var4 = this.field_s.a(param2, true, this.field_F);
                    break L2;
                  }
                }
              } else {
                L3: {
                  if (this.field_F == null) {
                    break L3;
                  } else {
                    if (0 == (this.field_E[param2] ^ -1)) {
                      break L3;
                    } else {
                      var4 = this.field_s.a(this.field_F, param2, -6833);
                      break L2;
                    }
                  }
                }
                if (!this.field_B.c((byte) -91)) {
                  var4 = this.field_B.a(param2, true, this.field_i, (byte) -80, (byte) 2);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            this.field_n.a((pg) (var4), true, (long)param2);
            break L1;
          }
        }
        if (!((ve) (var4)).field_p) {
          var6 = 103 / ((param1 - -54) / 43);
          var19 = ((ve) (var4)).c(-74);
          var14 = var19;
          var5 = var14;
          if (var4 instanceof ea) {
            try {
              L4: {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (-3 <= (var19.length ^ -1)) {
                      break L5;
                    } else {
                      co.field_g.reset();
                      co.field_g.update(var5, 0, var19.length + -2);
                      var7_int = (int)co.field_g.getValue();
                      if (var7_int != this.field_k.field_h[param2]) {
                        throw new RuntimeException();
                      } else {
                        L6: {
                          if (this.field_k.field_k == null) {
                            break L6;
                          } else {
                            if (null == this.field_k.field_k[param2]) {
                              break L6;
                            } else {
                              var31 = this.field_k.field_k[param2];
                              var30 = nn.a(-2 + var19.length, (byte) -93, var19, 0);
                              var12 = 0;
                              var10 = var12;
                              L7: while (true) {
                                if (64 <= var12) {
                                  break L6;
                                } else {
                                  if (var30[var12] != var31[var12]) {
                                    throw new RuntimeException();
                                  } else {
                                    var12++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var8 = ((var5[var19.length + -2] & 255) << 828893896) + (255 & var5[-1 + var19.length]);
                        if (var8 == (this.field_k.field_y[param2] & 65535)) {
                          L8: {
                            if (-2 == (this.field_E[param2] ^ -1)) {
                              break L8;
                            } else {
                              L9: {
                                if (this.field_E[param2] != 0) {
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              this.field_E[param2] = (byte) 1;
                              break L8;
                            }
                          }
                          L10: {
                            if (!((ve) (var4)).field_q) {
                              ((ve) (var4)).a(true);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          stackIn_87_0 = var4;
                          break L4;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L11: {
                var7 = (Exception) (Object) decompiledCaughtException;
                this.field_E[param2] = (byte)-1;
                ((ve) (var4)).a(true);
                if (((ve) (var4)).field_q) {
                  if (!this.field_B.c((byte) 67)) {
                    var4 = this.field_B.a(param2, true, this.field_i, (byte) -80, (byte) 2);
                    this.field_n.a((pg) (var4), true, (long)param2);
                    break L11;
                  } else {
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
              return null;
            }
            return (ve) ((Object) stackIn_87_0);
          } else {
            try {
              L12: {
                L13: {
                  if (var5 == null) {
                    break L13;
                  } else {
                    if (var19.length > 2) {
                      co.field_g.reset();
                      co.field_g.update(var5, 0, -2 + var19.length);
                      var7_int = (int)co.field_g.getValue();
                      if (this.field_k.field_h[param2] != var7_int) {
                        throw new RuntimeException();
                      } else {
                        L14: {
                          if (this.field_k.field_k == null) {
                            break L14;
                          } else {
                            if (this.field_k.field_k[param2] == null) {
                              break L14;
                            } else {
                              var29 = this.field_k.field_k[param2];
                              var28 = nn.a(var19.length - 2, (byte) -93, var19, 0);
                              var10 = 0;
                              L15: while (true) {
                                if (-65 >= (var10 ^ -1)) {
                                  break L14;
                                } else {
                                  if (var28[var10] != var29[var10]) {
                                    throw new RuntimeException();
                                  } else {
                                    var10++;
                                    continue L15;
                                  }
                                }
                              }
                            }
                          }
                        }
                        this.field_B.field_i = 0;
                        this.field_B.field_o = 0;
                        break L12;
                      }
                    } else {
                      break L13;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var7_ref = (RuntimeException) (Object) decompiledCaughtException;
              this.field_B.a((byte) 0);
              ((ve) (var4)).a(true);
              if (((ve) (var4)).field_q) {
                L16: {
                  if (!this.field_B.c((byte) 16)) {
                    var4 = this.field_B.a(param2, true, this.field_i, (byte) -80, (byte) 2);
                    this.field_n.a((pg) (var4), true, (long)param2);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            L17: {
              var5[var19.length - 2] = (byte)(this.field_k.field_y[param2] >>> -886375416);
              var5[-1 + var19.length] = (byte)this.field_k.field_y[param2];
              if (this.field_F == null) {
                break L17;
              } else {
                this.field_s.a(param2, 115, var19, this.field_F);
                stackIn_56_0 = -2;
                stackIn_56_1 = this.field_E[param2] ^ -1;
                if (stackIn_56_0 != stackIn_56_1) {
                  this.field_E[param2] = (byte) 1;
                  break L17;
                } else {
                  break L17;
                }
              }
            }
            L18: {
              if (((ve) (var4)).field_q) {
                break L18;
              } else {
                ((ve) (var4)).a(true);
                break L18;
              }
            }
            return (ve) (var4);
          }
        } else {
          return null;
        }
    }

    final byte[] a(int param0, boolean param1) {
        ve var3 = this.a(0, 55, param0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.c(-108);
        var3.a(param1);
        return var4;
    }

    public static void b(int param0) {
        field_A = null;
        field_u = null;
        field_o = null;
        if (param0 < 65) {
            tj.a(true, (byte) -36);
        }
        field_t = null;
        field_y = null;
    }

    final int a(int param0, byte param1) {
        ve var3 = (ve) ((Object) this.field_n.a((long)param0, -43));
        if (param1 < 119) {
            this.f((byte) -99);
        }
        if (var3 == null) {
            return 0;
        }
        return var3.e((byte) -121);
    }

    tj(int param0, be param1, be param2, lk param3, pa param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_n = new di(16);
        this.field_p = 0;
        this.field_m = new vn();
        this.field_r = 0L;
        try {
          L0: {
            L1: {
              this.field_F = param1;
              this.field_i = param0;
              if (this.field_F != null) {
                this.field_j = true;
                this.field_h = new vn();
                break L1;
              } else {
                this.field_j = false;
                break L1;
              }
            }
            L2: {
              stackIn_6_0 = this;

              if (!param8) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              ((tj) (this)).field_z = stackIn_7_1 != 0;
              this.field_D = param2;
              this.field_v = param7;
              this.field_s = param4;
              this.field_w = param6;
              this.field_q = param5;
              this.field_B = param3;
              if (this.field_D == null) {
                break L3;
              } else {
                this.field_x = (ve) ((Object) this.field_s.a(this.field_D, this.field_i, -6833));
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var10);

            stackIn_12_1 = new StringBuilder().append("tj.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_y = "<%0> is offering a rematch.";
        field_C = 9;
    }
}
