/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends ue {
    static String[] field_e;
    private boolean field_o;
    private int field_h;
    private boolean field_q;
    private int field_t;
    static int[] field_l;
    private boolean field_p;
    private boolean field_s;
    private re field_g;
    static am field_n;
    private int field_i;
    static String field_m;
    private String field_j;
    private String field_r;
    private ak field_k;
    private boolean field_f;

    m(re param0, int param1, String param2, int param3, int param4, boolean param5) {
        super(5);
        try {
            if (!(a.field_b instanceof m)) {
                gh.field_B = 0;
            }
            this.field_t = param4;
            this.field_q = param5 ? true : false;
            this.field_i = param3;
            this.field_j = param2;
            this.field_g = param0;
            this.field_b.field_c = -1;
            this.field_h = param1;
            this.d(136);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "m.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(boolean param0) {
        int var3;
        var3 = CrazyCrystals.field_B;
        if (this.field_s) {
          L0: {
            if (0 >= gh.field_B) {
              break L0;
            } else {
              gh.field_B = gh.field_B - 1;
              break L0;
            }
          }
          L1: {
            if (0 != gh.field_B) {
              break L1;
            } else {
              a.field_b = (ue) ((Object) this.field_g);
              this.field_g.a(this.field_b.field_i, -13880);
              break L1;
            }
          }
          this.field_g.a(false);
          return;
        } else {
          L2: {
            if (!this.field_q) {
              this.field_g.f(-112);
              this.field_g.c((byte) 73);
              this.field_g.a((byte) 20, this.field_h);
              break L2;
            } else {
              break L2;
            }
          }
          if (!this.field_p) {
            L3: {
              if (!this.field_f) {
                break L3;
              } else {
                L4: {
                  if (gh.field_B > 0) {
                    gh.field_B = gh.field_B - 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                this.field_g.c(2, 40, 180);
                if ((this.field_g.field_f ^ -1) <= -41) {
                  if (!this.field_o) {
                    rk.a(0);
                    this.field_b.a(-1, true, -1);
                    this.field_o = true;
                    return;
                  } else {
                    this.field_f = false;
                    this.field_o = false;
                    if (!rc.a(-98)) {
                      this.d(136);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            L5: {
              if ((gh.field_B ^ -1) > -21) {
                gh.field_B = gh.field_B + 1;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (!param0) {
                break L6;
              } else {
                this.field_q = true;
                break L6;
              }
            }
            this.field_g.c(-1);
            L7: while (true) {
              if (!ge.b(-59)) {
                this.a((byte) 118);
                return;
              } else {
                L8: {
                  if (!rc.a(-93)) {
                    L9: {
                      if (-97 == (pj.field_q ^ -1)) {
                        al.field_c = (al.field_c + 3 - 1) % 3;
                        this.field_b.field_c = al.field_c;
                        this.field_b.field_i = false;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (97 != pj.field_q) {
                        break L10;
                      } else {
                        al.field_c = (al.field_c - -1) % 3;
                        this.field_b.field_i = false;
                        this.field_b.field_c = al.field_c;
                        break L10;
                      }
                    }
                    L11: {
                      if ((pj.field_q ^ -1) == -99) {
                        L12: {
                          if (4 != this.field_b.field_c) {
                            this.field_b.field_c = 4;
                            break L12;
                          } else {
                            this.field_b.field_c = al.field_c;
                            break L12;
                          }
                        }
                        this.field_b.field_i = false;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    if (-100 == (pj.field_q ^ -1)) {
                      L13: {
                        if (al.field_c == this.field_b.field_c) {
                          this.field_b.field_c = 4;
                          break L13;
                        } else {
                          this.field_b.field_c = al.field_c;
                          break L13;
                        }
                      }
                      this.field_b.field_i = false;
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    L14: {
                      if (pj.field_q != 98) {
                        break L14;
                      } else {
                        L15: {
                          if (4 == this.field_b.field_c) {
                            this.field_b.field_c = 3;
                            break L15;
                          } else {
                            this.field_b.field_c = 4;
                            break L15;
                          }
                        }
                        this.field_b.field_i = false;
                        break L14;
                      }
                    }
                    if (99 != pj.field_q) {
                      break L8;
                    } else {
                      L16: {
                        if (3 == this.field_b.field_c) {
                          this.field_b.field_c = 4;
                          break L16;
                        } else {
                          this.field_b.field_c = 3;
                          break L16;
                        }
                      }
                      this.field_b.field_i = false;
                      break L8;
                    }
                  }
                }
                this.field_b.a((byte) 57);
                if (!this.a(106)) {
                  L17: {
                    if ((pj.field_q ^ -1) == -14) {
                      break L17;
                    } else {
                      if (!this.field_b.a(true)) {
                        continue L7;
                      } else {
                        break L17;
                      }
                    }
                  }
                  L18: {
                    L19: {
                      if (!this.field_q) {
                        break L19;
                      } else {
                        if (mo.field_l != 0) {
                          break L19;
                        } else {
                          if (dk.field_h >= uo.field_o) {
                            break L19;
                          } else {
                            this.field_p = true;
                            break L18;
                          }
                        }
                      }
                    }
                    this.field_s = true;
                    break L18;
                  }
                  this.field_b.field_i = false;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            L20: {
              if (gh.field_B <= 0) {
                break L20;
              } else {
                gh.field_B = gh.field_B - 1;
                break L20;
              }
            }
            L21: {
              if (0 == gh.field_B) {
                a.field_b = (ue) ((Object) new rb(this.field_g, this.field_b.field_i));
                break L21;
              } else {
                break L21;
              }
            }
            return;
          }
        }
    }

    public static void c(byte param0) {
        if (param0 >= -122) {
            return;
        }
        field_l = null;
        field_m = null;
        field_e = null;
        field_n = null;
    }

    final static void c(int param0) {
        if (param0 != 29537) {
            String var2 = (String) null;
            m.a((byte) 17, (String) null);
        }
    }

    final boolean a(int param0) {
        if (this.field_b.field_c >= 0 && -3 <= (this.field_b.field_c ^ -1) && this.field_b.a(true)) {
            al.field_c = this.field_b.field_c;
            return false;
        }
        if ((this.field_b.field_c ^ -1) == -4 && this.field_b.a(true) && rc.a(-59)) {
            this.field_f = true;
            return true;
        }
        if (4 == this.field_b.field_c && this.field_b.a(true)) {
            if (!this.field_q || mo.field_l != 0 || dk.field_h >= uo.field_o) {
                this.field_s = true;
                return true;
            }
            this.field_p = true;
            return true;
        }
        if (param0 <= 99) {
            this.field_f = false;
        }
        return false;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -72) {
              L1: {
                if (null == rg.a(param1, (byte) 120)) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
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
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("m.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final void b(int param0) {
        int stackIn_6_0 = 0;
        re stackIn_10_0 = null;
        re stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ef stackIn_36_0 = null;
        ef stackIn_37_0 = null;
        String stackIn_37_1 = null;
        ef stackIn_44_0 = null;
        ef stackIn_45_0 = null;
        String stackIn_45_1 = null;
        ik stackIn_54_0 = null;
        ik stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_60_2 = 0;
        int var2;
        int var3;
        Object var4;
        int var5;
        int var6;
        String[] var6_ref_String__;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int[] var19;
        L0: {
          var14 = CrazyCrystals.field_B;
          if (this.field_k != null) {
            break L0;
          } else {
            if (rc.a(-56)) {
              break L0;
            } else {
              this.field_k = jp.a(this.field_i, 125, 3, 10, 1);
              break L0;
            }
          }
        }
        L1: {
          this.field_g.e(75);
          var2 = gh.field_B * (580 * gh.field_B) / 400 + 30;
          if (!this.field_q) {
            stackIn_6_0 = 110;
            break L1;
          } else {
            stackIn_6_0 = 80;
            break L1;
          }
        }
        var3 = stackIn_6_0;
        wi.a(30, jn.field_o, var3, -var3 + 407, (byte) -71, -30 + var2);
        kh.d(38, param0 + var3, var2 - 46, -var3 + 407 + -16, 0, 192);
        if (this.field_g.field_f == 0) {
          L2: {
            stackIn_10_0 = this.field_g;

            if (this.field_s) {
              stackIn_11_0 = (re) ((Object) stackIn_10_0);
              stackIn_11_1 = -1;
              break L2;
            } else {
              stackIn_11_0 = (re) ((Object) stackIn_10_0);
              stackIn_11_1 = this.field_h;
              break L2;
            }
          }
          ((re) (Object) stackIn_11_0).a(stackIn_11_1, false);
          if ((gh.field_B ^ -1) != -21) {
            return;
          } else {
            L3: {
              if (this.field_q) {
                go.field_l.c(this.field_j, 320, 106, 16777215, -1);
                break L3;
              } else {
                break L3;
              }
            }
            var4 = CrazyCrystals.field_C;
            var5 = qk.a(al.field_c, param0 ^ 119, this.field_k, lo.field_b);
            go.field_l.a(ae.field_G, 100, 136, 16760896, -1);
            go.field_l.b(vn.field_m, 340, 136, 16760896, -1);
            go.field_l.b(tg.field_a, 440, 136, 16760896, -1);
            go.field_l.b(ff.field_d, 560, 136, 16760896, -1);
            var6 = 0;
            L4: while (true) {
              if (var6 >= 10) {
                L5: {
                  if (null != this.field_k) {
                    if (this.field_k.field_n) {
                      L6: {
                        if (this.field_k.field_i != null) {
                          var6_ref_String__ = this.field_k.field_i[al.field_c];
                          var19 = this.field_k.field_l[al.field_c];
                          var8 = 0;
                          L7: while (true) {
                            if (-11 >= (var8 ^ -1)) {
                              break L6;
                            } else {
                              if (null != var6_ref_String__[var8]) {
                                L8: {
                                  var4 = null;
                                  var9 = 8438015;
                                  if (var5 != var8) {
                                    break L8;
                                  } else {
                                    var9 = 16777215;
                                    break L8;
                                  }
                                }
                                L9: {
                                  go.field_l.a(var6_ref_String__[var8], 100, 161 - -(var8 * 20), var9, -1);
                                  var10 = var19[var8];
                                  var11 = var10 % 100;
                                  var10 = var10 / 100;
                                  var12 = var10 % 100;
                                  var10 = var10 / 100;
                                  var13 = -var11 + var12;
                                  go.field_l.b(Integer.toString(1 + var13), 340, 161 + 20 * var8, var9, -1);
                                  stackIn_36_0 = go.field_l;

                                  if (-1 + this.field_t != var12) {
                                    stackIn_37_0 = (ef) ((Object) stackIn_36_0);
                                    stackIn_37_1 = Integer.toString(var12 - -1);
                                    break L9;
                                  } else {
                                    stackIn_37_0 = (ef) ((Object) stackIn_36_0);
                                    stackIn_37_1 = ah.field_d;
                                    break L9;
                                  }
                                }
                                ((ef) (Object) stackIn_37_0).b(stackIn_37_1, 440, 161 + 20 * var8, var9, -1);
                                go.field_l.b(Integer.toString(var10), 560, 161 + 20 * var8, var9, -1);
                                var8++;
                                continue L7;
                              } else {
                                var8++;
                                continue L7;
                              }
                            }
                          }
                        } else {
                          var4 = ke.field_a;
                          break L6;
                        }
                      }
                      if (-1 >= (var5 ^ -1)) {
                        break L5;
                      } else {
                        if (null == lo.field_b) {
                          break L5;
                        } else {
                          if (lo.field_b.field_k == this.field_k.field_g) {
                            L10: {
                              go.field_l.a(je.field_g, 100, 366, 16777215, -1);
                              go.field_l.b(Integer.toString(dk.field_q - -1), 340, 366, 16777215, -1);
                              stackIn_44_0 = go.field_l;

                              if (this.field_t + -1 == oc.field_b) {
                                stackIn_45_0 = (ef) ((Object) stackIn_44_0);
                                stackIn_45_1 = ah.field_d;
                                break L10;
                              } else {
                                stackIn_45_0 = (ef) ((Object) stackIn_44_0);
                                stackIn_45_1 = Integer.toString(1 + oc.field_b);
                                break L10;
                              }
                            }
                            ((ef) (Object) stackIn_45_0).b(stackIn_45_1, 440, 366, 16777215, -1);
                            go.field_l.b(Integer.toString(kp.field_m), 560, 366, 16777215, -1);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                    } else {
                      var4 = wp.field_a;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L11: {
                  if (null == var4) {
                    break L11;
                  } else {
                    go.field_l.c((String) (var4), 320, 251, 16777215, -1);
                    break L11;
                  }
                }
                go.field_l.c(this.field_r, 320, 391, 16760896, -1);
                var15 = 0;
                var6 = var15;
                L12: while (true) {
                  if (this.field_d.length <= var15) {
                    return;
                  } else {
                    if (this.field_d[var15] != null) {
                      L13: {
                        stackIn_54_0 = this.field_d[var15];

                        if (var15 != this.field_b.field_c) {
                          stackIn_55_0 = (ik) ((Object) stackIn_54_0);
                          stackIn_55_1 = 0;
                          break L13;
                        } else {
                          stackIn_55_0 = (ik) ((Object) stackIn_54_0);
                          stackIn_55_1 = 1;
                          break L13;
                        }
                      }




                      if (var15 != this.field_b.field_c) {
                        L14: {




                          if (al.field_c == var15) {
                            stackIn_55_0 = (ik) ((Object) stackIn_55_0);

                            stackIn_60_2 = 16760896;
                            break L14;
                          } else {
                            stackIn_55_0 = (ik) ((Object) stackIn_55_0);

                            stackIn_60_2 = 12640511;
                            break L14;
                          }
                        }
                        ((ik) (Object) stackIn_55_0).a(stackIn_55_1 != 0, stackIn_60_2, 1);
                        var15++;
                        continue L12;
                      } else {
                        ((ik) (Object) stackIn_55_0).a(stackIn_55_1 != 0, 16777215, 1);
                        var15++;
                        continue L12;
                      }
                    } else {
                      var15++;
                      continue L12;
                    }
                  }
                }
              } else {
                L15: {
                  var7 = 8438015;
                  if ((var6 ^ -1) != (var5 ^ -1)) {
                    break L15;
                  } else {
                    var7 = 16777215;
                    break L15;
                  }
                }
                go.field_l.b(1 + var6 + ". ", 100, 161 - -(20 * var6), var7, -1);
                var6++;
                continue L4;
              }
            }
          }
        } else {
          return;
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        this.field_d = new ik[5];
        if (param0 != 136) {
            m.c((byte) -42);
        }
        if (!rc.a(param0 ^ -163)) {
            this.field_r = nl.field_g;
            var2 = go.field_l.a(ga.field_Q[0]);
            var3 = go.field_l.a(ga.field_Q[1]);
            var4 = go.field_l.a(ga.field_Q[2]);
            var5 = 60 + (var2 - -60 + var3 - -var4);
            var6 = (640 + -var5) / 2;
            this.field_d[0] = (ik) ((Object) new mh(var6, 417, ga.field_Q[0], 0));
            var6 = var6 + (var2 - -60);
            this.field_d[1] = (ik) ((Object) new mh(var6, 417, ga.field_Q[1], 0));
            var6 = var6 + (var3 + 60);
            this.field_d[2] = (ik) ((Object) new mh(var6, 417, ga.field_Q[2], 0));
        } else {
            this.field_r = el.field_f;
            this.field_d[3] = (ik) ((Object) new mh(200, 417, 240, si.field_a, 2));
        }
        this.field_d[4] = (ik) ((Object) new mh(200, 450, 240, ag.field_a, 2));
    }

    static {
        field_e = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_m = "Push this rock left or right to break one of the logs.";
    }
}
