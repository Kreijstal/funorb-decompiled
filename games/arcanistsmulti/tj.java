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
        fe var2 = null;
        RuntimeException var2_ref = null;
        fe stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = new fe();
              if (param1 == -21402) {
                break L1;
              } else {
                tj.b(68);
                break L1;
              }
            }
            i.field_e.b(var2, -1);
            gb.a(param0, true);
            stackIn_3_0 = (fe) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "tj.L(" + param0 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void g(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (null == this.field_F) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_l = true;
                if (param0 == 53) {
                  break L1;
                } else {
                  this.field_x = (ve) null;
                  break L1;
                }
              }
              L2: {
                if (null == this.field_h) {
                  this.field_h = new vn();
                  break L2;
                } else {
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "tj.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        ve discarded$0 = null;
        ve discarded$1 = null;
        pg var2 = null;
        int var3 = 0;
        int var4 = 0;
        pg stackIn_17_0 = null;
        pg stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_h != null) {
              if (this.d((byte) 122) == null) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!param0) {
                  var2 = this.field_m.b(12623);
                  L1: while (true) {
                    if (var2 == null) {
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L2: {
                        L3: {
                          var3 = (int)var2.field_e;
                          if (var3 < 0) {
                            break L3;
                          } else {
                            if (this.field_k.field_f <= var3) {
                              break L3;
                            } else {
                              if (-1 != (this.field_k.field_b[var3] ^ -1)) {
                                L4: {
                                  if (0 == this.field_E[var3]) {
                                    discarded$0 = this.a(1, -103, var3);
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                                L5: {
                                  if (0 != (this.field_E[var3] ^ -1)) {
                                    break L5;
                                  } else {
                                    discarded$1 = this.a(2, 62, var3);
                                    break L5;
                                  }
                                }
                                if (this.field_E[var3] != 1) {
                                  break L2;
                                } else {
                                  var2.a(true);
                                  break L2;
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        L6: {
                          stackIn_17_0 = (pg) (var2);

                          if (param0) {
                            stackIn_18_0 = (pg) ((Object) stackIn_17_0);
                            stackIn_18_1 = 0;
                            break L6;
                          } else {
                            stackIn_18_0 = (pg) ((Object) stackIn_17_0);
                            stackIn_18_1 = 1;
                            break L6;
                          }
                        }
                        ((pg) (Object) stackIn_18_0).a(stackIn_18_1 != 0);
                        break L2;
                      }
                      var2 = this.field_m.a(0);
                      continue L1;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "tj.P(" + param0 + ')');
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

    final static String a(int param0, String[] param1, String param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_6_0 = 0;
        String stackIn_31_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        StringBuilder var14 = null;
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
                  var13 = param2.substring(var6 + 2, var5);
                  var7 = var13;
                  if (!fi.a((CharSequence) ((Object) var7), 10)) {
                    continue L1;
                  } else {
                    if ((var5 ^ -1) <= (var3_int ^ -1)) {
                      continue L1;
                    } else {
                      if (param2.charAt(var5) != 62) {
                        continue L1;
                      } else {
                        var5++;
                        var8 = dc.a((CharSequence) ((Object) var13), 126);
                        var4 = var4 + (param1[var8].length() + -var5 - -var6);
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                var6 = -96 % ((param0 - 51) / 62);
                var14 = new StringBuilder(var4);
                var8 = 0;
                var5 = 0;
                L4: while (true) {
                  var9 = param2.indexOf("<%", var5);
                  if (-1 < (var9 ^ -1)) {
                    discarded$0 = var14.append(param2.substring(var8));
                    stackIn_31_0 = var14.toString();
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
                            discarded$1 = var14.append(param2.substring(var8, var9));
                            var8 = var5;
                            discarded$2 = var14.append(param1[var11]);
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
            stackIn_35_0 = (RuntimeException) (var3);

            stackIn_35_1 = new StringBuilder().append("tj.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L7;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L7;
            }
          }
          L8: {
            stackIn_39_0 = (RuntimeException) ((Object) stackIn_36_0);

            stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');

            if (param2 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L8;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
        }
        return stackIn_31_0;
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
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
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("tj.Q(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, byte param1) {
        try {
            sc.a(false, false, param0);
            if (param1 >= -93) {
                field_t = (lg) null;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "tj.R(" + param0 + ',' + param1 + ')');
        }
    }

    final void f(byte param0) {
        ve discarded$0 = null;
        ve discarded$1 = null;
        ve discarded$2 = null;
        ve discarded$3 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var2_int = 0;
        ve var2_ref = null;
        RuntimeException var2_ref2 = null;
        pg var3 = null;
        int var4 = 0;
        int var5 = 0;
        pg var6 = null;
        pg var7 = null;
        var2 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == this.field_h) {
                break L1;
              } else {
                if (null == this.d((byte) 119)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (!this.field_j) {
                    if (this.field_l) {
                      var2_int = 1;
                      var3 = this.field_h.b(12623);
                      L2: while (true) {
                        if (var3 == null) {
                          L3: while (true) {
                            L4: {
                              if (this.field_k.field_b.length <= this.field_p) {
                                break L4;
                              } else {
                                if (-1 != (this.field_k.field_b[this.field_p] ^ -1)) {
                                  if (!this.field_B.b(-21)) {
                                    L5: {
                                      if (1 != this.field_E[this.field_p]) {
                                        discarded$0 = this.a(2, 61, this.field_p);
                                        break L5;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if ((this.field_E[this.field_p] ^ -1) == -2) {
                                        break L6;
                                      } else {
                                        var7 = new pg();
                                        var7.field_e = (long)this.field_p;
                                        this.field_h.b(var7, -1);
                                        var2_int = 0;
                                        break L6;
                                      }
                                    }
                                    this.field_p = this.field_p + 1;
                                    continue L3;
                                  } else {
                                    var2_int = 0;
                                    break L4;
                                  }
                                } else {
                                  this.field_p = this.field_p + 1;
                                  continue L3;
                                }
                              }
                            }
                            if (var2_int == 0) {
                              break L1;
                            } else {
                              this.field_p = 0;
                              this.field_l = false;
                              break L1;
                            }
                          }
                        } else {
                          L7: {
                            var4 = (int)var3.field_e;
                            if (1 == this.field_E[var4]) {
                              break L7;
                            } else {
                              discarded$1 = this.a(2, -114, var4);
                              break L7;
                            }
                          }
                          L8: {
                            if ((this.field_E[var4] ^ -1) != -2) {
                              var2_int = 0;
                              break L8;
                            } else {
                              var3.a(true);
                              break L8;
                            }
                          }
                          var3 = this.field_h.a(0);
                          continue L2;
                        }
                      }
                    } else {
                      this.field_h = null;
                      break L1;
                    }
                  } else {
                    var2_int = 1;
                    var3 = this.field_h.b(12623);
                    L9: while (true) {
                      if (var3 == null) {
                        L10: while (true) {
                          L11: {
                            if (this.field_p >= this.field_k.field_b.length) {
                              break L11;
                            } else {
                              if ((this.field_k.field_b[this.field_p] ^ -1) != -1) {
                                if (250 <= this.field_s.field_d) {
                                  var2_int = 0;
                                  break L11;
                                } else {
                                  L12: {
                                    if (-1 == (this.field_E[this.field_p] ^ -1)) {
                                      discarded$2 = this.a(1, 85, this.field_p);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (0 == this.field_E[this.field_p]) {
                                      var6 = new pg();
                                      var6.field_e = (long)this.field_p;
                                      this.field_h.b(var6, -1);
                                      var2_int = 0;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  this.field_p = this.field_p + 1;
                                  continue L10;
                                }
                              } else {
                                this.field_p = this.field_p + 1;
                                continue L10;
                              }
                            }
                          }
                          if (var2_int != 0) {
                            this.field_p = 0;
                            this.field_j = false;
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        L14: {
                          var4 = (int)var3.field_e;
                          if (-1 == (this.field_E[var4] ^ -1)) {
                            discarded$3 = this.a(1, 96, var4);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          if (this.field_E[var4] != 0) {
                            var3.a(true);
                            break L15;
                          } else {
                            var2_int = 0;
                            break L15;
                          }
                        }
                        var3 = this.field_h.a(0);
                        continue L9;
                      }
                    }
                  }
                }
              }
            }
            L16: {
              if (!this.field_z) {
                break L16;
              } else {
                if ((this.field_r ^ -1L) >= (qj.b(-26572) ^ -1L)) {
                  var2_ref = (ve) ((Object) this.field_n.a(10));
                  L17: while (true) {
                    if (var2_ref == null) {
                      this.field_r = qj.b(-26572) - -1000L;
                      break L16;
                    } else {
                      L18: {
                        if (!var2_ref.field_p) {
                          if (!var2_ref.field_n) {
                            var2_ref.field_n = true;
                            break L18;
                          } else {
                            if (!var2_ref.field_q) {
                              throw new RuntimeException();
                            } else {
                              var2_ref.a(true);
                              break L18;
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                      var2_ref = (ve) ((Object) this.field_n.c(-87));
                      continue L17;
                    }
                  }
                } else {
                  break L16;
                }
              }
            }
            L19: {
              if (param0 >= 54) {
                break L19;
              } else {
                this.a(15, (byte) -128);
                break L19;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref2), "tj.O(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final jk d(byte param0) {
        jk stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        jk stackIn_18_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_50_0 = null;
        jk stackIn_54_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (null != this.field_k) {
              stackIn_5_0 = this.field_k;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_x == null) {
                  if (!this.field_B.c((byte) -66)) {
                    this.field_x = (ve) ((Object) this.field_B.a(this.field_i, true, 255, (byte) -80, (byte) 0));
                    break L1;
                  } else {
                    stackIn_11_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              if (!this.field_x.field_p) {
                var7 = this.field_x.c(-42);
                var6 = var7;
                var5 = var6;
                var2 = var5;
                if (param0 > 74) {
                  L2: {
                    if (this.field_x instanceof ea) {
                      try {
                        L3: {
                          if (var5 == null) {
                            throw new RuntimeException();
                          } else {
                            this.field_k = new jk(var7, this.field_q, this.field_w);
                            if (this.field_v != this.field_k.field_g) {
                              throw new RuntimeException();
                            } else {
                              break L3;
                            }
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L4: {
                          var3 = decompiledCaughtException;
                          this.field_k = null;
                          if (this.field_B.c((byte) 52)) {
                            this.field_x = null;
                            break L4;
                          } else {
                            this.field_x = (ve) ((Object) this.field_B.a(this.field_i, true, 255, (byte) -80, (byte) 0));
                            break L4;
                          }
                        }
                        stackIn_50_0 = null;
                        return (jk) ((Object) stackIn_50_0);
                      }
                      break L2;
                    } else {
                      try {
                        L5: {
                          if (var5 == null) {
                            throw new RuntimeException();
                          } else {
                            this.field_k = new jk(var7, this.field_q, this.field_w);
                            break L5;
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L6: {
                          var3 = decompiledCaughtException;
                          this.field_B.a((byte) 0);
                          this.field_k = null;
                          if (this.field_B.c((byte) -71)) {
                            this.field_x = null;
                            break L6;
                          } else {
                            this.field_x = (ve) ((Object) this.field_B.a(this.field_i, true, 255, (byte) -80, (byte) 0));
                            break L6;
                          }
                        }
                        stackIn_31_0 = null;
                        return (jk) ((Object) stackIn_31_0);
                      }
                      if (null != this.field_D) {
                        this.field_s.a(this.field_i, 93, var7, this.field_D);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L7: {
                    this.field_x = null;
                    if (this.field_F == null) {
                      break L7;
                    } else {
                      this.field_E = new byte[this.field_k.field_f];
                      break L7;
                    }
                  }
                  stackIn_54_0 = this.field_k;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  stackIn_18_0 = (jk) null;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_15_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "tj.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (jk) ((Object) stackIn_11_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (jk) ((Object) stackIn_15_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                return stackIn_54_0;
              }
            }
          }
        }
    }

    final static void c(int param0) {
        try {
            rk.field_O = null;
            if (param0 < 62) {
                field_C = -45;
            }
            qn.field_ob = null;
            mj.field_p = -1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "tj.I(" + param0 + ')');
        }
    }

    private final ve a(int param0, int param1, int param2) {
        Object stackIn_38_0 = null;
        Object stackIn_67_0 = null;
        Object stackIn_75_0 = null;
        Object stackIn_106_0 = null;
        Object stackIn_115_0 = null;
        int decompiledRegionSelector0 = 0;
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
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = (ve) ((Object) this.field_n.a((long)param2, -77));
              var4 = var13;
              if (var13 == null) {
                break L1;
              } else {
                if (param0 != 0) {
                  break L1;
                } else {
                  if (var13.field_q) {
                    break L1;
                  } else {
                    if (!var13.field_p) {
                      break L1;
                    } else {
                      var13.a(true);
                      var4 = null;
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (var4 != null) {
                break L2;
              } else {
                L3: {
                  if (0 != param0) {
                    if (param0 != 1) {
                      if (-3 == (param0 ^ -1)) {
                        if (null != this.field_F) {
                          if ((this.field_E[param2] ^ -1) == 0) {
                            if (!this.field_B.b(-21)) {
                              var4 = this.field_B.a(param2, false, this.field_i, (byte) -80, (byte) 2);
                              break L3;
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
                        break L3;
                      }
                    }
                  } else {
                    L4: {
                      if (this.field_F == null) {
                        break L4;
                      } else {
                        if (0 == (this.field_E[param2] ^ -1)) {
                          break L4;
                        } else {
                          var4 = this.field_s.a(this.field_F, param2, -6833);
                          break L3;
                        }
                      }
                    }
                    if (!this.field_B.c((byte) -91)) {
                      var4 = this.field_B.a(param2, true, this.field_i, (byte) -80, (byte) 2);
                      break L3;
                    } else {
                      return null;
                    }
                  }
                }
                this.field_n.a((pg) (var4), true, (long)param2);
                break L2;
              }
            }
            if (!((ve) (var4)).field_p) {
              var6 = 103 / ((param1 - -54) / 43);
              var19 = ((ve) (var4)).c(-74);
              var14 = var19;
              var5 = var14;
              if (var4 instanceof ea) {
                try {
                  L5: {
                    L6: {
                      if (var5 == null) {
                        break L6;
                      } else {
                        if (-3 <= (var19.length ^ -1)) {
                          break L6;
                        } else {
                          co.field_g.reset();
                          co.field_g.update(var5, 0, var19.length + -2);
                          var7_int = (int)co.field_g.getValue();
                          if (var7_int != this.field_k.field_h[param2]) {
                            throw new RuntimeException();
                          } else {
                            L7: {
                              if (this.field_k.field_k == null) {
                                break L7;
                              } else {
                                if (null == this.field_k.field_k[param2]) {
                                  break L7;
                                } else {
                                  var31 = this.field_k.field_k[param2];
                                  var30 = nn.a(-2 + var19.length, (byte) -93, var19, 0);
                                  var12 = 0;
                                  var10 = var12;
                                  L8: while (true) {
                                    if (64 <= var12) {
                                      break L7;
                                    } else {
                                      if (var30[var12] != var31[var12]) {
                                        throw new RuntimeException();
                                      } else {
                                        var12++;
                                        continue L8;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var8 = ((var5[var19.length + -2] & 255) << 828893896) + (255 & var5[-1 + var19.length]);
                            if (var8 == (this.field_k.field_y[param2] & 65535)) {
                              L9: {
                                if (-2 == (this.field_E[param2] ^ -1)) {
                                  break L9;
                                } else {
                                  L10: {
                                    if (this.field_E[param2] != 0) {
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  this.field_E[param2] = (byte) 1;
                                  break L9;
                                }
                              }
                              L11: {
                                if (!((ve) (var4)).field_q) {
                                  ((ve) (var4)).a(true);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              stackIn_106_0 = var4;
                              break L5;
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
                  L12: {
                    var7 = (Exception) (Object) decompiledCaughtException;
                    this.field_E[param2] = (byte)-1;
                    ((ve) (var4)).a(true);
                    if (((ve) (var4)).field_q) {
                      if (!this.field_B.c((byte) 67)) {
                        var4 = this.field_B.a(param2, true, this.field_i, (byte) -80, (byte) 2);
                        this.field_n.a((pg) (var4), true, (long)param2);
                        break L12;
                      } else {
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                  stackIn_115_0 = null;
                  return (ve) ((Object) stackIn_115_0);
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                try {
                  L13: {
                    L14: {
                      if (var5 == null) {
                        break L14;
                      } else {
                        if (var19.length > 2) {
                          co.field_g.reset();
                          co.field_g.update(var5, 0, -2 + var19.length);
                          var7_int = (int)co.field_g.getValue();
                          if (this.field_k.field_h[param2] != var7_int) {
                            throw new RuntimeException();
                          } else {
                            L15: {
                              if (this.field_k.field_k == null) {
                                break L15;
                              } else {
                                if (this.field_k.field_k[param2] == null) {
                                  break L15;
                                } else {
                                  var29 = this.field_k.field_k[param2];
                                  var28 = nn.a(var19.length - 2, (byte) -93, var19, 0);
                                  var10 = 0;
                                  L16: while (true) {
                                    if (-65 >= (var10 ^ -1)) {
                                      break L15;
                                    } else {
                                      if (var28[var10] != var29[var10]) {
                                        throw new RuntimeException();
                                      } else {
                                        var10++;
                                        continue L16;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            this.field_B.field_i = 0;
                            this.field_B.field_o = 0;
                            break L13;
                          }
                        } else {
                          break L14;
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
                    L17: {
                      if (!this.field_B.c((byte) 16)) {
                        var4 = this.field_B.a(param2, true, this.field_i, (byte) -80, (byte) 2);
                        this.field_n.a((pg) (var4), true, (long)param2);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    stackIn_67_0 = null;
                    return (ve) ((Object) stackIn_67_0);
                  } else {
                    return null;
                  }
                }
                L18: {
                  var5[var19.length - 2] = (byte)(this.field_k.field_y[param2] >>> -886375416);
                  var5[-1 + var19.length] = (byte)this.field_k.field_y[param2];
                  if (this.field_F == null) {
                    break L18;
                  } else {
                    this.field_s.a(param2, 115, var19, this.field_F);
                    if (-2 != (this.field_E[param2] ^ -1)) {
                      this.field_E[param2] = (byte) 1;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                }
                L19: {
                  if (((ve) (var4)).field_q) {
                    break L19;
                  } else {
                    ((ve) (var4)).a(true);
                    break L19;
                  }
                }
                stackIn_75_0 = var4;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_38_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          throw aa.a((Throwable) (var4), "tj.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ve) ((Object) stackIn_38_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ve) ((Object) stackIn_75_0);
          } else {
            return (ve) ((Object) stackIn_106_0);
          }
        }
    }

    final byte[] a(int param0, boolean param1) {
        ve var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.a(0, 55, param0);
            if (var3 != null) {
              var4 = var3.c(-108);
              var3.a(param1);
              stackIn_4_0 = (byte[]) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3_ref), "tj.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    public static void b(int param0) {
        try {
            field_A = null;
            field_u = null;
            field_o = null;
            if (param0 < 65) {
                tj.a(true, (byte) -36);
            }
            field_t = null;
            field_y = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "tj.N(" + param0 + ')');
        }
    }

    final int a(int param0, byte param1) {
        ve var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = (ve) ((Object) this.field_n.a((long)param0, -43));
              if (param1 >= 119) {
                break L1;
              } else {
                this.f((byte) -99);
                break L1;
              }
            }
            if (var3 != null) {
              stackIn_6_0 = var3.e((byte) -121);
              break L0;
            } else {
              return 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3_ref), "tj.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    tj(int param0, be param1, be param2, lk param3, pa param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
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
            stackIn_13_0 = (RuntimeException) (var10);

            stackIn_13_1 = new StringBuilder().append("tj.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {
            stackIn_17_0 = (RuntimeException) ((Object) stackIn_14_0);

            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_18_0);

            stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          L7: {
            stackIn_25_0 = (RuntimeException) ((Object) stackIn_22_0);

            stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param4 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          L8: {
            stackIn_29_0 = (RuntimeException) ((Object) stackIn_26_0);

            stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_y = "<%0> is offering a rematch.";
        field_C = 9;
    }
}
