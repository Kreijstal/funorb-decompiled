/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class qm extends jb {
    int field_s;
    String field_t;
    wo field_i;
    static int field_n;
    static int[] field_q;
    tb field_p;
    int field_j;
    String field_o;
    int field_f;
    int field_r;
    bi field_l;
    boolean field_m;
    int field_h;
    int field_g;
    int field_k;

    final void a(byte param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        int var7;
        var7 = CrazyCrystals.field_B;
        var4 = this.c((byte) 38);
        var5_int = 0;
        L0: while (true) {
          L1: {
            if (var4 < var5_int) {
              break L1;
            } else {
              this.a(param2, (byte) -77, param1, var5_int);
              var5_int++;
              if (var7 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var5 = mc.a((byte) 6);
            if (var5 != null) {
              pi.field_j.a(var5, 3370, ni.field_b, rf.field_G);
              break L2;
            } else {
              break L2;
            }
          }
          var6 = 8 % ((param0 - 66) / 48);
          return;
        }
    }

    boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 1) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.a(-81, 38, true, -102, 61);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("qm.FB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3, qm param4, int param5) {
        try {
            this.field_s = param5;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "qm.PA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    String a(byte param0) {
        if (param0 < -23) {
          if (!this.field_m) {
            return null;
          } else {
            return this.field_t;
          }
        } else {
          this.field_f = 96;
          if (!this.field_m) {
            return null;
          } else {
            return this.field_t;
          }
        }
    }

    void a(qm param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              var5_int = this.a(bm.field_h, param3, false, param2, qh.field_i) ? 1 : 0;
              var6 = 125 % ((-50 - param1) / 59);
              if ((this.field_m ? 1 : 0) != var5_int) {
                L2: {
                  stackIn_4_0 = this;

                  if (var5_int == 0) {
                    stackIn_5_0 = this;
                    stackIn_5_1 = 0;
                    break L2;
                  } else {
                    stackIn_5_0 = this;
                    stackIn_5_1 = 1;
                    break L2;
                  }
                }
                ((qm) (this)).field_m = stackIn_5_1 != 0;
                if (this.field_l == null) {
                  break L1;
                } else {
                  if (!(this.field_l instanceof t)) {
                    break L1;
                  } else {
                    ((t) ((Object) this.field_l)).a(var5_int != 0, -2095, (qm) (this));
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("qm.N(");

            if (param0 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, byte param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              discarded$0 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_r).append(",").append(this.field_j).append(" ").append(this.field_g).append("x").append(this.field_f);
              if (this.field_o == null) {
                break L1;
              } else {
                discarded$1 = param2.append(" text=\"").append(this.field_o).append('"');
                break L1;
              }
            }
            L2: {
              if (!this.field_m) {
                break L2;
              } else {
                discarded$2 = param2.append(" mouseover");
                break L2;
              }
            }
            if (param1 >= 119) {
              L3: {
                if (this.e(-111)) {
                  discarded$3 = param2.append(" focused");
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (this.field_i != null) {
                  L5: {
                    discarded$4 = param2.append(" renderer=");
                    if (!(this.field_i instanceof qm)) {
                      break L5;
                    } else {
                      param2 = this.a(param0 + 1, -86, param3, param2);
                      if (var6 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  discarded$5 = param2.append(this.field_i);
                  break L4;
                } else {
                  break L4;
                }
              }
              L6: {
                if (null != this.field_l) {
                  L7: {
                    discarded$6 = param2.append(" listener=");
                    if (!(this.field_l instanceof qm)) {
                      break L7;
                    } else {
                      param2 = this.a(1 + param0, -124, param3, param2);
                      if (var6 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  discarded$7 = param2.append(this.field_l);
                  break L6;
                } else {
                  break L6;
                }
              }
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
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("qm.QB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static jm d(int param0) {
        try {
            Throwable var1 = null;
            jm stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param0 == 1) {
                    break L1;
                  } else {
                    field_q = (int[]) null;
                    break L1;
                  }
                }
                stackIn_3_0 = (jm) (Class.forName("sf").newInstance());
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return this.a(0, -115, new Hashtable(), new StringBuilder()).toString();
    }

    StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(0, param0, param3, param2)) {
                break L1;
              } else {
                this.a(param0, (byte) 123, param3, param2);
                break L1;
              }
            }
            L2: {
              if (param1 <= -85) {
                break L2;
              } else {
                this.field_k = 84;
                break L2;
              }
            }
            stackIn_5_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("qm.MA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        return stackIn_5_0;
    }

    void a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != -52) {
          field_q = (int[]) null;
          this.field_j = param2;
          this.field_g = param3;
          this.field_f = param0;
          this.field_r = param1;
          return;
        } else {
          this.field_j = param2;
          this.field_g = param3;
          this.field_f = param0;
          this.field_r = param1;
          return;
        }
    }

    void b(byte param0) {
        if (param0 > -84) {
            this.field_k = 97;
        }
    }

    final boolean a(int param0, boolean param1, char param2) {
        int var4;
        if (!this.e(-121)) {
          var4 = param0;
          if (-81 != (var4 ^ -1)) {
            if (param1) {
              this.a((byte) -42);
              return false;
            } else {
              return false;
            }
          } else {
            return this.a(true, (qm) (this));
          }
        } else {
          if (!this.a(param0, 19279, (qm) (this), param2)) {
            var4 = param0;
            if (-81 != (var4 ^ -1)) {
              if (!param1) {
                return false;
              } else {
                this.a((byte) -42);
                return false;
              }
            } else {
              return this.a(true, (qm) (this));
            }
          } else {
            return true;
          }
        }
    }

    public static void g(int param0) {
        if (param0 != 1) {
            qm.d(38);
            field_q = null;
            return;
        }
        field_q = null;
    }

    void a(int param0, byte param1, int param2, int param3) {
        L0: {
          if (param3 != 0) {
            break L0;
          } else {
            if (this.field_i != null) {
              this.field_i.a(param0, false, param2, (qm) (this), true);
              break L0;
            } else {
              if (param1 <= -12) {
                return;
              } else {
                this.field_h = -114;
                return;
              }
            }
          }
        }
        if (param1 > -12) {
          this.field_h = -114;
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, boolean param1, boolean param2, int param3) {
        int var5;
        oj var6;
        int var7;
        oj var8;
        oj var9;
        oj var10;
        oj var11;
        oj var12;
        oj var13;
        L0: {
          L1: {
            var7 = CrazyCrystals.field_B;
            this.a((qm) (this), -125, param0, param3);
            var5 = this.e(-111) ? 1 : 0;
            if (!param2) {
              break L1;
            } else {
              L2: {
                if (of.field_H == 0) {
                  break L2;
                } else {
                  if (var5 != 0) {
                    this.a(1, bm.field_h, (qm) (this), qh.field_i, param0, param3, of.field_H);
                    break L2;
                  } else {
                    if (pj.field_v != 0) {
                      L3: {
                        if (!this.a(param3, dp.field_h, (qm) (this), false, param0, pj.field_v, to.field_a)) {
                          break L3;
                        } else {
                          param2 = false;
                          if (var7 != 0) {
                            break L3;
                          } else {
                            L4: {
                              if (gg.field_c != 0) {
                                break L4;
                              } else {
                                if (-1 != (qk.field_D ^ -1)) {
                                  L5: {
                                    this.a(bm.field_h, param0, param3, qh.field_i, (qm) (this), 0);
                                    var9 = ok.field_e;
                                    var6 = var9;
                                    if (var9 == null) {
                                      break L5;
                                    } else {
                                      L6: {
                                        if (var9.field_l instanceof sk) {
                                          ((sk) ((Object) var9.field_l)).a((ed) null, -27167, var9);
                                          break L6;
                                        } else {
                                          break L6;
                                        }
                                      }
                                      ok.field_e = null;
                                      break L5;
                                    }
                                  }
                                  if (var7 == 0) {
                                    break L4;
                                  } else {
                                    if (var5 == 0) {
                                      break L4;
                                    } else {
                                      if (pj.field_v != 0) {
                                        this.b((byte) -110);
                                        break L4;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                            qk.field_D = gg.field_c;
                            if (param1) {
                              return true;
                            } else {
                              ia.a((byte) -47, this.a((byte) -54));
                              return param2;
                            }
                          }
                        }
                      }
                      if (var5 == 0) {
                        if (gg.field_c == 0) {
                          if (-1 != (qk.field_D ^ -1)) {
                            L7: {
                              this.a(bm.field_h, param0, param3, qh.field_i, (qm) (this), 0);
                              var11 = ok.field_e;
                              var6 = var11;
                              if (var11 == null) {
                                break L7;
                              } else {
                                L8: {
                                  if (var11.field_l instanceof sk) {
                                    ((sk) ((Object) var11.field_l)).a((ed) null, -27167, var11);
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                ok.field_e = null;
                                break L7;
                              }
                            }
                            if (var7 != 0) {
                              L9: {
                                if (var5 == 0) {
                                  break L9;
                                } else {
                                  if (pj.field_v != 0) {
                                    this.b((byte) -110);
                                    break L9;
                                  } else {
                                    qk.field_D = gg.field_c;
                                    if (param1) {
                                      return true;
                                    } else {
                                      ia.a((byte) -47, this.a((byte) -54));
                                      return param2;
                                    }
                                  }
                                }
                              }
                              qk.field_D = gg.field_c;
                              if (param1) {
                                return true;
                              } else {
                                ia.a((byte) -47, this.a((byte) -54));
                                return param2;
                              }
                            } else {
                              qk.field_D = gg.field_c;
                              if (param1) {
                                return true;
                              } else {
                                ia.a((byte) -47, this.a((byte) -54));
                                return param2;
                              }
                            }
                          } else {
                            qk.field_D = gg.field_c;
                            if (param1) {
                              return true;
                            } else {
                              ia.a((byte) -47, this.a((byte) -54));
                              return param2;
                            }
                          }
                        } else {
                          qk.field_D = gg.field_c;
                          if (param1) {
                            return true;
                          } else {
                            ia.a((byte) -47, this.a((byte) -54));
                            return param2;
                          }
                        }
                      } else {
                        L10: {
                          this.b((byte) -118);
                          if (gg.field_c != 0) {
                            break L10;
                          } else {
                            if (-1 != (qk.field_D ^ -1)) {
                              L11: {
                                this.a(bm.field_h, param0, param3, qh.field_i, (qm) (this), 0);
                                var10 = ok.field_e;
                                var6 = var10;
                                if (var10 == null) {
                                  break L11;
                                } else {
                                  L12: {
                                    if (var10.field_l instanceof sk) {
                                      ((sk) ((Object) var10.field_l)).a((ed) null, -27167, var10);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  ok.field_e = null;
                                  break L11;
                                }
                              }
                              if (var7 == 0) {
                                break L10;
                              } else {
                                if (var5 == 0) {
                                  break L10;
                                } else {
                                  if (pj.field_v != 0) {
                                    this.b((byte) -110);
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            } else {
                              break L10;
                            }
                          }
                        }
                        qk.field_D = gg.field_c;
                        if (param1) {
                          return true;
                        } else {
                          ia.a((byte) -47, this.a((byte) -54));
                          return param2;
                        }
                      }
                    } else {
                      L13: {
                        if (gg.field_c != 0) {
                          break L13;
                        } else {
                          if (-1 != (qk.field_D ^ -1)) {
                            L14: {
                              this.a(bm.field_h, param0, param3, qh.field_i, (qm) (this), 0);
                              var8 = ok.field_e;
                              var6 = var8;
                              if (var8 == null) {
                                break L14;
                              } else {
                                L15: {
                                  if (var8.field_l instanceof sk) {
                                    ((sk) ((Object) var8.field_l)).a((ed) null, -27167, var8);
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                                ok.field_e = null;
                                break L14;
                              }
                            }
                            if (var7 == 0) {
                              break L13;
                            } else {
                              if (var5 == 0) {
                                break L13;
                              } else {
                                if (pj.field_v != 0) {
                                  this.b((byte) -110);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          } else {
                            break L13;
                          }
                        }
                      }
                      qk.field_D = gg.field_c;
                      if (param1) {
                        return true;
                      } else {
                        ia.a((byte) -47, this.a((byte) -54));
                        return param2;
                      }
                    }
                  }
                }
              }
              L16: {
                if (pj.field_v == 0) {
                  break L16;
                } else {
                  L17: {
                    if (!this.a(param3, dp.field_h, (qm) (this), false, param0, pj.field_v, to.field_a)) {
                      break L17;
                    } else {
                      param2 = false;
                      if (var7 == 0) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  if (var5 == 0) {
                    break L16;
                  } else {
                    L18: {
                      this.b((byte) -118);
                      if (gg.field_c != 0) {
                        break L18;
                      } else {
                        if (-1 != (qk.field_D ^ -1)) {
                          L19: {
                            this.a(bm.field_h, param0, param3, qh.field_i, (qm) (this), 0);
                            var12 = ok.field_e;
                            if (var12 == null) {
                              break L19;
                            } else {
                              L20: {
                                if (var12.field_l instanceof sk) {
                                  ((sk) ((Object) var12.field_l)).a((ed) null, -27167, var12);
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              ok.field_e = null;
                              break L19;
                            }
                          }
                          if (var7 == 0) {
                            break L18;
                          } else {
                            if (var5 == 0) {
                              break L18;
                            } else {
                              if (pj.field_v != 0) {
                                this.b((byte) -110);
                                break L18;
                              } else {
                                qk.field_D = gg.field_c;
                                if (!param1) {
                                  ia.a((byte) -47, this.a((byte) -54));
                                  return param2;
                                } else {
                                  return true;
                                }
                              }
                            }
                          }
                        } else {
                          qk.field_D = gg.field_c;
                          if (!param1) {
                            ia.a((byte) -47, this.a((byte) -54));
                            return param2;
                          } else {
                            return true;
                          }
                        }
                      }
                    }
                    qk.field_D = gg.field_c;
                    if (!param1) {
                      ia.a((byte) -47, this.a((byte) -54));
                      return param2;
                    } else {
                      return true;
                    }
                  }
                }
              }
              if (gg.field_c != 0) {
                break L0;
              } else {
                if (-1 != (qk.field_D ^ -1)) {
                  L21: {
                    this.a(bm.field_h, param0, param3, qh.field_i, (qm) (this), 0);
                    var13 = ok.field_e;
                    if (var13 == null) {
                      break L21;
                    } else {
                      L22: {
                        if (var13.field_l instanceof sk) {
                          ((sk) ((Object) var13.field_l)).a((ed) null, -27167, var13);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      ok.field_e = null;
                      break L21;
                    }
                  }
                  if (var7 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  qk.field_D = gg.field_c;
                  if (!param1) {
                    ia.a((byte) -47, this.a((byte) -54));
                    return param2;
                  } else {
                    return true;
                  }
                }
              }
            }
          }
          if (var5 == 0) {
            break L0;
          } else {
            if (pj.field_v != 0) {
              this.b((byte) -110);
              break L0;
            } else {
              qk.field_D = gg.field_c;
              if (!param1) {
                ia.a((byte) -47, this.a((byte) -54));
                return param2;
              } else {
                return true;
              }
            }
          }
        }
        qk.field_D = gg.field_c;
        if (!param1) {
          ia.a((byte) -47, this.a((byte) -54));
          return param2;
        } else {
          return true;
        }
    }

    final void f(int param0) {
        this.a(this.field_f, this.field_r, this.field_j, this.field_g, (byte) -52);
        if (param0 > -27) {
            this.e(-107);
        }
    }

    boolean e(int param0) {
        if (param0 >= -107) {
            return true;
        }
        return false;
    }

    boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a(param1, param0, param3, param4, param6)) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_s = param5;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("qm.KA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean a(boolean param0, qm param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("qm.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    boolean a(int param0, int param1, qm param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 19279) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("qm.AA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    int c(byte param0) {
        if (param0 < 30) {
            this.a(-13, -26, (Hashtable) null, (StringBuilder) null);
            return 0;
        }
        return 0;
    }

    qm(String param0, bi param1) {
        this(param0, pi.field_j.field_n, param1);
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4) {
        if (!param2) {
          if (param1 + this.field_r <= param4) {
            if (this.field_j + param3 <= param0) {
              if (param1 - (-this.field_r - this.field_g) > param4) {
                if (param3 - -this.field_j - -this.field_f <= param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 0) {
              if (param3.containsKey(this)) {
                discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                param3.put(this, this);
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("qm.IB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_7_0 != 0;
          }
        }
    }

    protected qm() {
        this.field_h = 0;
        this.field_k = 0;
    }

    qm(String param0, wo param1, bi param2) {
        RuntimeException runtimeException = null;
        fi var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_h = 0;
        this.field_k = 0;
        try {
          L0: {
            L1: {
              this.field_l = param2;
              this.field_o = param0;
              this.field_i = param1;
              if (!(this.field_i instanceof fi)) {
                break L1;
              } else {
                var4 = (fi) ((Object) this.field_i);
                this.field_g = var4.b((qm) (this), -12817);
                this.field_f = var4.c((qm) (this), -1);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("qm.<init>(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
    }

    final static int a(rh param0, int param1, rh param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 84) {
                break L1;
              } else {
                qm.g(-54);
                break L1;
              }
            }
            stackIn_3_0 = ai.a(param2, false, (String) null, 0, param0, (byte) 84, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("qm.HB(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    qm(int param0, int param1, int param2, int param3, wo param4, bi param5) {
        this.field_h = 0;
        this.field_k = 0;
        try {
            this.field_g = param2;
            this.field_i = param4;
            this.field_r = param0;
            this.field_l = param5;
            this.field_f = param3;
            this.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "qm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = new int[8192];
    }
}
