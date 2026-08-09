/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends km {
    static int field_r;
    private int field_u;
    static int field_v;
    static String field_x;
    static String field_t;
    private int field_s;
    static String field_w;

    final static int f(byte param0) {
        int stackIn_32_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        java.awt.Component var8 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!jl.a((byte) 5)) {
                L2: {
                  if (param0 == 124) {
                    break L2;
                  } else {
                    var8 = (java.awt.Component) null;
                    md.a(22, (java.awt.Component) null);
                    break L2;
                  }
                }
                L3: {
                  mh.field_H.a(qo.b(120, po.field_a, pq.field_k), param0 + 27355, qo.b(param0 + -4, qo.field_O, tb.field_fb));
                  if (mh.field_H.a((byte) 113)) {
                    var1_int = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L5;
                    } else {
                      if (-1 >= (mh.field_H.field_j ^ -1)) {
                        var3 = ri.field_I[mh.field_H.field_j];
                        if ((var3 ^ -1) == -3) {
                          w.c((byte) 3);
                          break L4;
                        } else {
                          if (5 != var3) {
                            break L4;
                          } else {
                            w.c((byte) 3);
                            break L4;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L4;
                  } else {
                    if ((ih.field_p ^ -1) != -3) {
                      w.c((byte) 3);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L6: {
                  if (-1 != (var3 ^ -1)) {
                    break L6;
                  } else {
                    if ((ih.field_p ^ -1) == -3) {
                      var4 = ue.a(false) - un.field_g;
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (var6 <= 0) {
                        bq.a(true, 5, (byte) 104);
                        var3 = 2;
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                stackIn_32_0 = var3;
                break L0;
              } else {
                L7: {
                  mh.field_H.d(-1);
                  if (!mh.field_H.a((byte) 113)) {
                    break L7;
                  } else {
                    var1_int = 1;
                    break L7;
                  }
                }
                if (-14 == (dc.field_b ^ -1)) {
                  var2 = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "md.C(" + param0 + ')');
        }
        return stackIn_32_0;
    }

    final static int a(int param0, String param1, wq param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = param2.field_l;
            var5 = (CharSequence) ((Object) param1);
            var4 = uj.a(var5, false);
            param2.b(-1, var4.length);
            param2.field_l = param2.field_l + so.field_d.a((byte) -119, var4.length, 0, param2.field_k, param2.field_l, var4);
            if (param0 == 26152) {
              stackIn_4_0 = param2.field_l - var3_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -117;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("md.B(").append(param0).append(',');

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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final int a(boolean param0) {
        if (!param0) {
            return 71;
        }
        return this.field_s;
    }

    final boolean a(byte param0, int param1) {
        int var3;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        if (-1 < (param1 ^ -1)) {
          return false;
        } else {
          L0: {
            if (param0 > 80) {
              break L0;
            } else {
              field_v = -12;
              break L0;
            }
          }
          var3 = this.field_m[param1].field_f;
          if (-26 == (var3 ^ -1)) {
            L1: {
              if (0 >= this.field_u) {
                stackIn_20_0 = 0;
                break L1;
              } else {
                stackIn_20_0 = 1;
                break L1;
              }
            }
            return stackIn_20_0 != 0;
          } else {
            if (26 != var3) {
              if ((var3 ^ -1) != -38) {
                return true;
              } else {
                L2: {
                  L3: {
                    if (gh.field_b.length + -1 != this.field_u) {
                      break L3;
                    } else {
                      if (lm.a((byte) -10)) {
                        break L3;
                      } else {
                        stackIn_16_0 = 1;
                        break L2;
                      }
                    }
                  }
                  stackIn_16_0 = 0;
                  break L2;
                }
                return stackIn_16_0 != 0;
              }
            } else {
              L4: {
                if (gh.field_b.length - 1 <= this.field_u) {
                  stackIn_10_0 = 0;
                  break L4;
                } else {
                  stackIn_10_0 = 1;
                  break L4;
                }
              }
              return stackIn_10_0 != 0;
            }
          }
        }
    }

    final void a(int param0, int param1, char param2) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        L0: {
          var7 = BrickABrac.field_J ? 1 : 0;
          if (!this.a((byte) 113, 0)) {
            stackIn_3_0 = 1;
            break L0;
          } else {
            stackIn_3_0 = 0;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_3_0;
          if (this.a((byte) 104, 2)) {
            stackIn_6_0 = 2;
            break L1;
          } else {
            stackIn_6_0 = 1;
            break L1;
          }
        }
        L2: {
          var5 = stackIn_6_0;
          if (this.a((byte) 111, 3)) {
            stackIn_9_0 = 3;
            break L2;
          } else {
            stackIn_9_0 = var5;
            break L2;
          }
        }
        L3: {
          var5 = stackIn_9_0;
          if (!this.field_h.a(false)) {
            L4: {
              if (-97 != (param1 ^ -1)) {
                break L4;
              } else {
                L5: {
                  var6 = -1 + this.field_h.field_j;
                  if (!this.a((byte) 86, var6)) {
                    var6--;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (var4 < this.field_h.field_j) {
                  this.field_h.a(false, var6);
                  break L4;
                } else {
                  this.field_h.a(false, var5);
                  break L4;
                }
              }
            }
            if ((param1 ^ -1) == -98) {
              L6: {
                var6 = 1 + this.field_h.field_j;
                if (this.a((byte) 85, var6)) {
                  break L6;
                } else {
                  var6++;
                  break L6;
                }
              }
              if (this.field_h.field_j < 0) {
                this.field_h.a(false, var4);
                break L3;
              } else {
                if (this.field_h.field_j >= var5) {
                  this.field_h.a(false, var4);
                  break L3;
                } else {
                  this.field_h.a(false, var6);
                  break L3;
                }
              }
            } else {
              break L3;
            }
          } else {
            break L3;
          }
        }
        L7: {
          this.field_h.d((byte) -124);
          if (param0 == -120) {
            break L7;
          } else {
            field_x = (String) null;
            break L7;
          }
        }
    }

    md() {
        super(7, 38, 460, 402, 35, lc.field_n);
        m.field_j = ob.field_D.field_F + ob.field_D.field_P - -1;
    }

    final void a(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        q var6_ref_q;
        String var7_ref_String;
        int var8_int;
        int var9;
        String stackIn_5_0 = null;
        int var6;
        int var7;
        q var8;
        var9 = BrickABrac.field_J ? 1 : 0;
        super.a(param0, 2, 98);
        this.field_u = 0;
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= this.field_m.length) {
            L1: {
              var4 += 30;
              var5 = 20 + 3 * var4;
              var6 = (-var5 + 640) / 2;
              if (param2 >= 96) {
                break L1;
              } else {
                field_t = (String) null;
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var7 >= this.field_m.length) {
                this.field_s = lp.field_rb.field_a;
                return;
              } else {
                var8 = this.field_m[var7];
                var8.field_j = var4;
                var8.field_c = var6;
                if (-27 != (var8.field_f ^ -1)) {
                  var6 = var6 + (var8.field_j + 10);
                  var7++;
                  continue L2;
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          } else {
            L3: {
              var6_ref_q = this.field_m[var5];
              if (-9 != (var6_ref_q.field_f ^ -1)) {
                stackIn_5_0 = ag.field_D[var6_ref_q.field_f];
                break L3;
              } else {
                stackIn_5_0 = this.e((byte) 112);
                break L3;
              }
            }
            var7_ref_String = stackIn_5_0;
            var8_int = nn.field_g.c(var7_ref_String);
            if (var8_int > var4) {
              var4 = var8_int;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    public static void g(byte param0) {
        field_x = null;
        if (param0 <= 23) {
            return;
        }
        field_t = null;
        field_w = null;
    }

    final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        bi var5;
        int var6;
        int var7;
        int var8;
        int var9;
        L0: {
          var9 = BrickABrac.field_J ? 1 : 0;
          super.b((byte) -27);
          im.a(550, 5, 243, 5, 140, (byte) -101, 45);
          al.a(this.field_a, 19);
          if (this.field_u != 0) {
            ob.field_D.a(h.field_C, nd.field_f);
            break L0;
          } else {
            ob.field_D.a(un.field_e, vj.field_f);
            break L0;
          }
        }
        var2 = ob.field_D.a(gh.field_b[this.field_u], jq.field_t, ok.field_b);
        var3 = 145 - (-m.field_j + -4);
        var4 = 0;
        L1: while (true) {
          if (var2 <= var4) {
            L2: {
              if (param0 < -14) {
                break L2;
              } else {
                md.g((byte) 61);
                break L2;
              }
            }
            nn.field_g.a(pb.a(this.field_u, 4), 581, -12 + (nn.field_g.field_B + 373), 0, -1);
            this.a(0);
            return;
          } else {
            L3: {
              var5 = ob.field_D;
              var6 = 2;
              var7 = -1;
              var8 = 0;
              if (ok.field_b[var4].startsWith("<bab:heading1>")) {
                var5 = ce.field_e;
                var8 = 4;
                var6 = 0;
                break L3;
              } else {
                if (ok.field_b[var4].startsWith("<bab:heading2>")) {
                  var8 = 3;
                  var6 = 8;
                  var5 = ce.field_e;
                  break L3;
                } else {
                  if (ok.field_b[var4].startsWith("<bab:vspace>")) {
                    var8 = 4;
                    break L3;
                  } else {
                    if (!ok.field_b[var4].startsWith("<bab:smlvspace>")) {
                      if (!ok.field_b[var4].endsWith("<bab:smlbr><br>")) {
                        if (!ok.field_b[var4].endsWith("<bab:smlvspace><br>")) {
                          break L3;
                        } else {
                          if (ok.field_b[var4].startsWith("<bab:smlvspace>")) {
                            break L3;
                          } else {
                            var8 = 3;
                            break L3;
                          }
                        }
                      } else {
                        var8 = 9;
                        break L3;
                      }
                    } else {
                      var8 = 3;
                      break L3;
                    }
                  }
                }
              }
            }
            var5.c(ok.field_b[var4], 60, var3, var6, var7);
            var3 = var3 + (m.field_j + var8);
            var4++;
            continue L1;
          }
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            int var2_int = -107 / ((param0 - -53) / 50);
            param1.setFocusTraversalKeysEnabled(false);
            param1.addKeyListener(gp.field_c);
            param1.addFocusListener(gp.field_c);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "md.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String e(byte param0) {
        if (param0 < 53) {
            java.awt.Component var3 = (java.awt.Component) null;
            md.a(-108, (java.awt.Component) null);
        }
        return ag.field_D[7];
    }

    final boolean a(int param0, boolean param1, byte param2) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var4;
        q var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var8 = BrickABrac.field_J ? 1 : 0;
          if (param2 == 123) {
            break L0;
          } else {
            this.b(117, -99);
            break L0;
          }
        }
        L1: {
          var4 = 0;
          var5 = this.field_m[param0];
          var6 = var5.field_f;
          var7 = var6;
          if (26 == var7) {
            if (!this.field_h.a((byte) 113)) {
              break L1;
            } else {
              if (!this.a((byte) 106, param0)) {
                break L1;
              } else {
                L2: {
                  fieldTemp$2 = this.field_u + 1;
                  this.field_u = this.field_u + 1;
                  if (fieldTemp$2 >= gh.field_b.length) {
                    this.field_u = gh.field_b.length - 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (this.a((byte) 123, 2)) {
                    break L3;
                  } else {
                    this.field_h.a(false, 3);
                    if (this.a((byte) 102, 3)) {
                      break L3;
                    } else {
                      this.field_h.a(false, 1);
                      break L3;
                    }
                  }
                }
                var4 = 1;
                break L1;
              }
            }
          } else {
            if (25 != var7) {
              return super.a(param0, param1, (byte) 123);
            } else {
              if (!this.field_h.a((byte) 113)) {
                break L1;
              } else {
                if (!this.a((byte) 91, param0)) {
                  break L1;
                } else {
                  L4: {
                    fieldTemp$3 = this.field_u - 1;
                    this.field_u = this.field_u - 1;
                    if (0 <= fieldTemp$3) {
                      break L4;
                    } else {
                      this.field_u = 0;
                      break L4;
                    }
                  }
                  var4 = 1;
                  if (this.a((byte) 86, 0)) {
                    break L1;
                  } else {
                    this.field_h.a(false, 2);
                    break L1;
                  }
                }
              }
            }
          }
        }
        return var4 != 0;
    }

    final int b(int param0, int param1) {
        if (param1 != 1) {
            return 42;
        }
        return this.field_p;
    }

    final static void a(String[] args, boolean param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_t = (String) null;
                break L1;
              }
            }
            L2: {
              if (null == o.field_c) {
                break L2;
              } else {
                o.field_c.field_K.a((byte) -94, args);
                break L2;
              }
            }
            L3: {
              if (pq.field_o != null) {
                pq.field_o.field_R.a((byte) 102, args);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("md.D(");

            if (args == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    static {
        field_w = "<%0> has joined your game.";
        field_x = "Passwords must be between 5 and 20 letters and numbers";
        field_t = "This game option has not yet been unlocked for use.";
    }
}
