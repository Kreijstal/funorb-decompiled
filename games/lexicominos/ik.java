/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class ik implements rd, ub {
    int field_r;
    int field_o;
    int field_l;
    int field_a;
    int field_e;
    private boolean field_i;
    int field_p;
    static int field_j;
    static int[] field_b;
    private int field_q;
    static int[] field_s;
    static b field_h;
    le field_f;
    int field_n;
    static String field_k;
    int field_d;
    static int[] field_g;
    int field_c;
    int field_m;

    final static String a(byte param0) {
        if (-3 >= (wf.field_i ^ -1)) {
          if (eh.field_d != null) {
            if (!eh.field_d.c(81)) {
              return oh.field_a;
            } else {
              return we.field_c;
            }
          } else {
            if (we.field_h.c(83)) {
              L0: {
                if (param0 >= 63) {
                  break L0;
                } else {
                  ik.b((byte) -17);
                  break L0;
                }
              }
              if (!we.field_h.a("commonui", 10762)) {
                return pe.field_e + " - " + we.field_h.b("commonui", (byte) 118) + "%";
              } else {
                if (!gk.field_a.c(-75)) {
                  return li.field_P;
                } else {
                  if (gk.field_a.a("commonui", 10762)) {
                    if (ej.field_d.c(-116)) {
                      if (!ej.field_d.a((byte) -114)) {
                        return ck.field_c + " - " + ej.field_d.a(false) + "%";
                      } else {
                        return ta.field_b;
                      }
                    } else {
                      return ef.field_c;
                    }
                  } else {
                    return v.field_t + " - " + gk.field_a.b("commonui", (byte) 118) + "%";
                  }
                }
              }
            } else {
              return qf.field_s;
            }
          }
        } else {
          return ui.field_w;
        }
    }

    public final int a(w param0, int param1, int param2) {
        if (param1 != 20340) {
            return 57;
        }
        return this.a(param0, param1 ^ -20344, 0, param2);
    }

    public final void a(int param0, int param1, w param2, byte param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        rj var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ve var17 = null;
        ve var18 = null;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var16 = Lexicominos.field_L ? 1 : 0;
        if (param5 == param4) {
          return;
        } else {
          L0: {
            if (param2.a(18337)) {
              L1: {
                var17 = ((ik) this).a(param2, (byte) 63);
                var18 = var17;
                if (param5 > param4) {
                  var9 = param5;
                  var8 = param4;
                  break L1;
                } else {
                  var8 = param5;
                  var9 = param4;
                  break L1;
                }
              }
              var10 = var18.a(28276, var8);
              var11 = var18.a(28276, var9);
              ca.a(param2.field_j + param2.field_t + param1, param0 + param2.field_o, param1 - -param2.field_t, param0 + param2.field_o - -param2.field_v, false);
              var12 = var10;
              L2: while (true) {
                if (var11 < var12) {
                  pd.a(param3 ^ -22972);
                  break L0;
                } else {
                  L3: {
                    var13 = var17.field_c[var12];
                    if (var12 == var10) {
                      stackOut_12_0 = var18.a((byte) -114, var8);
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      stackOut_11_0 = var13.field_a[0];
                      stackIn_13_0 = stackOut_11_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_13_0;
                    if (var11 == var12) {
                      stackOut_17_0 = var18.a((byte) -116, var9);
                      stackIn_18_0 = stackOut_17_0;
                      break L4;
                    } else {
                      if (var13 != null) {
                        stackOut_16_0 = var13.field_a[var13.field_a.length + -1];
                        stackIn_18_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_18_0 = stackOut_15_0;
                        break L4;
                      }
                    }
                  }
                  var15 = stackIn_18_0;
                  nb.field_z.a(((ik) this).field_l >>> -2096420200, -var14 + var15, var13.field_d + (param2.field_l + param0) + param2.field_o + ((ik) this).field_d, var13.field_c, this.a(40, param2, param1, var14), 5092, ((ik) this).field_l);
                  var12++;
                  continue L2;
                }
              }
            } else {
              break L0;
            }
          }
          if (param3 != 31) {
            ((ik) this).field_r = 69;
            return;
          } else {
            return;
          }
        }
    }

    public final int a(int param0, w param1) {
        Object var4 = null;
        ve discarded$9 = ((ik) this).a(param1, (byte) 99);
        if (param0 != -13293) {
          var4 = null;
          String discarded$10 = ((ik) this).c(-125, (w) null);
          return param1.field_w.a(0) - -((ik) this).field_d + ((ik) this).field_o;
        } else {
          return param1.field_w.a(0) - -((ik) this).field_d + ((ik) this).field_o;
        }
    }

    public final int b(int param0, w param1) {
        if (param0 != 8089) {
          field_h = null;
          ve discarded$4 = ((ik) this).a(param1, (byte) -109);
          return param1.field_w.a((byte) 94) + ((ik) this).field_a + ((ik) this).field_r;
        } else {
          ve discarded$5 = ((ik) this).a(param1, (byte) -109);
          return param1.field_w.a((byte) 94) + ((ik) this).field_a + ((ik) this).field_r;
        }
    }

    public final void a(int param0, int param1, int param2, w param3, boolean param4) {
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ve var15 = null;
        ve var16 = null;
        rj var17 = null;
        ve var18 = null;
        ve var19 = null;
        rj var20 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        if (!param4) {
          L0: {
            ((ik) this).field_q = -122;
            if (param3.a(18337)) {
              L1: {
                var16 = ((ik) this).a(param3, (byte) -102);
                var15 = var16;
                var7 = var15.a(28276, param0);
                var17 = var16.field_c[var7];
                var9 = var15.a((byte) -125, param0);
                var10 = this.a(40, param3, param1, var9);
                var11 = ((ik) this).a(param3, 20340, param2) + Math.max(0, var17.field_d);
                stackOut_10_0 = ((ik) this).a(param3, 20340, param2);
                stackOut_10_1 = this.a((byte) -52, param3);
                stackOut_10_2 = var17.field_c;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                if (var15.field_c.length <= var7 + 1) {
                  stackOut_12_0 = stackIn_12_0;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = stackIn_12_2;
                  stackOut_12_3 = var17.field_c;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  stackIn_13_3 = stackOut_12_3;
                  break L1;
                } else {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = stackIn_11_2;
                  stackOut_11_3 = var16.field_c[var7 - -1].field_d;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  stackIn_13_3 = stackOut_11_3;
                  break L1;
                }
              }
              var12 = stackIn_13_0 - -Math.min(stackIn_13_1, Math.min(stackIn_13_2, stackIn_13_3));
              ca.a(param1 - -param3.field_t - -param3.field_j, param2 + param3.field_o, param3.field_t + param1, param2 - (-param3.field_o - param3.field_v), false);
              nb.field_z.a((byte) 10, var12, ((ik) this).field_c, var10, var10, var11);
              pd.a(-22949);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L2: {
            if (param3.a(18337)) {
              L3: {
                var19 = ((ik) this).a(param3, (byte) -102);
                var18 = var19;
                var7 = var18.a(28276, param0);
                var20 = var19.field_c[var7];
                var9 = var18.a((byte) -125, param0);
                var10 = this.a(40, param3, param1, var9);
                var11 = ((ik) this).a(param3, 20340, param2) + Math.max(0, var20.field_d);
                stackOut_3_0 = ((ik) this).a(param3, 20340, param2);
                stackOut_3_1 = this.a((byte) -52, param3);
                stackOut_3_2 = var20.field_c;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                if (var18.field_c.length <= var7 + 1) {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = stackIn_5_2;
                  stackOut_5_3 = var20.field_c;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  stackIn_6_3 = stackOut_5_3;
                  break L3;
                } else {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = stackIn_4_2;
                  stackOut_4_3 = var19.field_c[var7 - -1].field_d;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  stackIn_6_3 = stackOut_4_3;
                  break L3;
                }
              }
              var12 = stackIn_6_0 - -Math.min(stackIn_6_1, Math.min(stackIn_6_2, stackIn_6_3));
              ca.a(param1 - -param3.field_t - -param3.field_j, param2 + param3.field_o, param3.field_t + param1, param2 - (-param3.field_o - param3.field_v), false);
              nb.field_z.a((byte) 10, var12, ((ik) this).field_c, var10, var10, var11);
              pd.a(-22949);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    private final void b(w param0, int param1, int param2, int param3) {
        if (param2 != -30065) {
          int discarded$2 = ((ik) this).a(28);
          this.a(param0, 0, ((ik) this).field_e, 0, param1, ((ik) this).field_q, param3, -124);
          return;
        } else {
          this.a(param0, 0, ((ik) this).field_e, 0, param1, ((ik) this).field_q, param3, -124);
          return;
        }
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        de var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = Lexicominos.field_L ? 1 : 0;
          if (!(param1 instanceof de)) {
            var2 = "";
            var11 = var2;
            break L0;
          } else {
            var14 = (de) (Object) param1;
            var2 = var14.field_a + " | ";
            param1 = var14.field_c;
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        param1.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var2 = var5;
        var11 = var5;
        if (param0 > -21) {
          return null;
        } else {
          var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
          var7 = var6.readLine();
          var2 = var7;
          var11 = var7;
          L1: while (true) {
            var8 = var6.readLine();
            var2 = var8;
            var11 = var8;
            var2 = var11;
            if (var8 != null) {
              L2: {
                var9 = var8.indexOf('(');
                var10 = var8.indexOf(')', 1 + var9);
                if (0 == (var9 ^ -1)) {
                  var11 = var8;
                  var2 = var11;
                  var2 = var11;
                  break L2;
                } else {
                  var11 = var8.substring(0, var9);
                  break L2;
                }
              }
              L3: {
                var16 = var11.trim();
                var2 = var16;
                var2 = var16;
                var17 = var16.substring(var16.lastIndexOf(' ') - -1);
                var2 = var17;
                var2 = var17;
                var18 = var17.substring(1 + var17.lastIndexOf('\t'));
                var2 = var18;
                var2 = var18;
                var19 = var2 + var18;
                var2 = var19;
                var2 = var19;
                if (0 == (var9 ^ -1)) {
                  break L3;
                } else {
                  if ((var10 ^ -1) != 0) {
                    var12 = var8.indexOf(".java:", var9);
                    if (-1 < (var12 ^ -1)) {
                      break L3;
                    } else {
                      var2 = var19 + var8.substring(5 + var12, var10);
                      break L3;
                    }
                  } else {
                    var2 = var2 + 32;
                    continue L1;
                  }
                }
              }
              var2 = var2 + 32;
              continue L1;
            } else {
              var2 = var11;
              var11 = var2;
              var2 = var11;
              var2 = var2 + "| " + var7;
              return var2;
            }
          }
        }
    }

    public void a(int param0, int param1, boolean param2, w param3, int param4) {
        Object var7 = null;
        if (((ik) this).field_f != null) {
          if (param4 != -3284) {
            var7 = null;
            int discarded$2 = ((ik) this).a((w) null, -24, -67);
            this.b(param3, param0, param4 + -26781, param1);
            return;
          } else {
            this.b(param3, param0, param4 + -26781, param1);
            return;
          }
        } else {
          return;
        }
    }

    private final void a(w param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Lexicominos.field_L ? 1 : 0;
        ca.a(param0.field_t + (param6 - -param0.field_j), param0.field_o + param4, param6 + param0.field_t, param0.field_v + (param4 - -param0.field_o), false);
        var9 = ((ik) this).a(param0, 227);
        if (param7 <= -67) {
          var10 = this.a((byte) -83, param0);
          if (!((ik) this).field_i) {
            var12 = ((ik) this).field_m;
            if (-1 == (var12 ^ -1)) {
              L0: {
                L1: {
                  var11 = ((ik) this).field_f.field_E;
                  var12 = ((ik) this).field_p;
                  if (-1 == (var12 ^ -1)) {
                    break L1;
                  } else {
                    if ((var12 ^ -1) != -4) {
                      if (1 == var12) {
                        ((ik) this).field_f.a(((ik) this).c(349, param0), (var9 >> 625279489) + this.a(40, param0, param6, param1), this.a(param0, -4, param3, param4) - -var11, param2, param5);
                        break L0;
                      } else {
                        if (var12 != 2) {
                          pd.a(-22949);
                          return;
                        } else {
                          ((ik) this).field_f.c(((ik) this).c(349, param0), var9 + this.a(40, param0, param6, param1), var11 + this.a(param0, -4, param3, param4), param2, param5);
                          pd.a(-22949);
                          return;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                ((ik) this).field_f.b(((ik) this).c(349, param0), this.a(40, param0, param6, param1), var11 + this.a(param0, -4, param3, param4), param2, param5);
                break L0;
              }
              pd.a(-22949);
              return;
            } else {
              if (var12 == 2) {
                var11 = var10 + -((ik) this).field_f.field_G;
                var12 = ((ik) this).field_p;
                if (-1 != (var12 ^ -1)) {
                  if ((var12 ^ -1) != -4) {
                    if (1 != var12) {
                      if (var12 != 2) {
                        pd.a(-22949);
                        return;
                      } else {
                        ((ik) this).field_f.c(((ik) this).c(349, param0), var9 + this.a(40, param0, param6, param1), var11 + this.a(param0, -4, param3, param4), param2, param5);
                        pd.a(-22949);
                        return;
                      }
                    } else {
                      ((ik) this).field_f.a(((ik) this).c(349, param0), (var9 >> 625279489) + this.a(40, param0, param6, param1), this.a(param0, -4, param3, param4) - -var11, param2, param5);
                      pd.a(-22949);
                      return;
                    }
                  } else {
                    ((ik) this).field_f.b(((ik) this).c(349, param0), this.a(40, param0, param6, param1), var11 + this.a(param0, -4, param3, param4), param2, param5);
                    pd.a(-22949);
                    return;
                  }
                } else {
                  ((ik) this).field_f.b(((ik) this).c(349, param0), this.a(40, param0, param6, param1), var11 + this.a(param0, -4, param3, param4), param2, param5);
                  pd.a(-22949);
                  return;
                }
              } else {
                if ((var12 ^ -1) != -4) {
                  if (-2 == (var12 ^ -1)) {
                    var11 = ((ik) this).field_f.field_E + (-((ik) this).field_f.field_E + (var10 + -((ik) this).field_f.field_G) >> 1737110049);
                    var12 = ((ik) this).field_p;
                    if (-1 != (var12 ^ -1)) {
                      if ((var12 ^ -1) != -4) {
                        if (1 != var12) {
                          if (var12 != 2) {
                            pd.a(-22949);
                            return;
                          } else {
                            ((ik) this).field_f.c(((ik) this).c(349, param0), var9 + this.a(40, param0, param6, param1), var11 + this.a(param0, -4, param3, param4), param2, param5);
                            pd.a(-22949);
                            return;
                          }
                        } else {
                          ((ik) this).field_f.a(((ik) this).c(349, param0), (var9 >> 625279489) + this.a(40, param0, param6, param1), this.a(param0, -4, param3, param4) - -var11, param2, param5);
                          pd.a(-22949);
                          return;
                        }
                      } else {
                        ((ik) this).field_f.b(((ik) this).c(349, param0), this.a(40, param0, param6, param1), var11 + this.a(param0, -4, param3, param4), param2, param5);
                        pd.a(-22949);
                        return;
                      }
                    } else {
                      ((ik) this).field_f.b(((ik) this).c(349, param0), this.a(40, param0, param6, param1), var11 + this.a(param0, -4, param3, param4), param2, param5);
                      pd.a(-22949);
                      return;
                    }
                  } else {
                    var11 = ((ik) this).field_f.field_E + (-((ik) this).field_f.field_E + (var10 + -((ik) this).field_f.field_G) >> 1737110049);
                    var12 = ((ik) this).field_p;
                    if (-1 != (var12 ^ -1)) {
                      if ((var12 ^ -1) != -4) {
                        if (1 != var12) {
                          if (var12 == 2) {
                            ((ik) this).field_f.c(((ik) this).c(349, param0), var9 + this.a(40, param0, param6, param1), var11 + this.a(param0, -4, param3, param4), param2, param5);
                            pd.a(-22949);
                            return;
                          } else {
                            pd.a(-22949);
                            return;
                          }
                        } else {
                          ((ik) this).field_f.a(((ik) this).c(349, param0), (var9 >> 625279489) + this.a(40, param0, param6, param1), this.a(param0, -4, param3, param4) - -var11, param2, param5);
                          pd.a(-22949);
                          return;
                        }
                      } else {
                        ((ik) this).field_f.b(((ik) this).c(349, param0), this.a(40, param0, param6, param1), var11 + this.a(param0, -4, param3, param4), param2, param5);
                        pd.a(-22949);
                        return;
                      }
                    } else {
                      ((ik) this).field_f.b(((ik) this).c(349, param0), this.a(40, param0, param6, param1), var11 + this.a(param0, -4, param3, param4), param2, param5);
                      pd.a(-22949);
                      return;
                    }
                  }
                } else {
                  var11 = ((ik) this).field_f.field_E + (-((ik) this).field_f.field_E + (var10 + -((ik) this).field_f.field_G) >> 1737110049);
                  var12 = ((ik) this).field_p;
                  if (-1 != (var12 ^ -1)) {
                    if ((var12 ^ -1) != -4) {
                      if (1 != var12) {
                        if (var12 == 2) {
                          ((ik) this).field_f.c(((ik) this).c(349, param0), var9 + this.a(40, param0, param6, param1), var11 + this.a(param0, -4, param3, param4), param2, param5);
                          pd.a(-22949);
                          return;
                        } else {
                          pd.a(-22949);
                          return;
                        }
                      } else {
                        ((ik) this).field_f.a(((ik) this).c(349, param0), (var9 >> 625279489) + this.a(40, param0, param6, param1), this.a(param0, -4, param3, param4) - -var11, param2, param5);
                        pd.a(-22949);
                        return;
                      }
                    } else {
                      ((ik) this).field_f.b(((ik) this).c(349, param0), this.a(40, param0, param6, param1), var11 + this.a(param0, -4, param3, param4), param2, param5);
                      pd.a(-22949);
                      return;
                    }
                  } else {
                    ((ik) this).field_f.b(((ik) this).c(349, param0), this.a(40, param0, param6, param1), var11 + this.a(param0, -4, param3, param4), param2, param5);
                    pd.a(-22949);
                    return;
                  }
                }
              }
            }
          } else {
            int discarded$1 = ((ik) this).field_f.a(((ik) this).c(349, param0), this.a(40, param0, param6, param1), this.a(param0, -4, param3, param4), var9, var10, param2, param5, ((ik) this).field_p, ((ik) this).field_m, ((ik) this).field_n);
            pd.a(-22949);
            return;
          }
        } else {
          return;
        }
    }

    public final int a(w param0, int param1, int param2, int param3, int param4, int param5) {
        if (param2 != 9) {
          return -31;
        } else {
          ve discarded$2 = ((ik) this).a(param0, (byte) 55);
          return param0.field_w.a(param4 - ((ik) this).b(param0, 101, param3), (byte) -100, param5 + -((ik) this).a(param0, param2 + 20331, param1));
        }
    }

    private final int a(w param0, int param1, int param2, int param3) {
        if (param1 != -4) {
          ((ik) this).field_q = -12;
          return ((ik) this).field_d + (param0.field_o + param3) + (param0.field_l - -param2);
        } else {
          return ((ik) this).field_d + (param0.field_o + param3) + (param0.field_l - -param2);
        }
    }

    public final ve a(w param0, byte param1) {
        int var3 = 0;
        var3 = 2 / ((param1 - -22) / 59);
        if (param0.field_w != null) {
          if (((ik) this).field_i) {
            ((kk) (Object) param0.field_w).a(((ik) this).field_f, ((ik) this).field_p, ((ik) this).field_n, ((ik) this).field_m, ((ik) this).a(param0, 227), this.a((byte) -49, param0), -125, ((ik) this).c(349, param0));
            return param0.field_w;
          } else {
            this.b(param0, -54);
            return param0.field_w;
          }
        } else {
          param0.field_w = (ve) (Object) new kk();
          if (((ik) this).field_i) {
            ((kk) (Object) param0.field_w).a(((ik) this).field_f, ((ik) this).field_p, ((ik) this).field_n, ((ik) this).field_m, ((ik) this).a(param0, 227), this.a((byte) -49, param0), -125, ((ik) this).c(349, param0));
            return param0.field_w;
          } else {
            this.b(param0, -54);
            return param0.field_w;
          }
        }
    }

    final void a(ik param0, boolean param1) {
        Object var4 = null;
        param0.field_q = ((ik) this).field_q;
        param0.field_a = ((ik) this).field_a;
        param0.field_i = ((ik) this).field_i;
        if (param1) {
          var4 = null;
          ((ik) this).a(39, 3, (w) null, (byte) -96, -55, -81);
          param0.field_d = ((ik) this).field_d;
          param0.field_e = ((ik) this).field_e;
          param0.field_f = ((ik) this).field_f;
          param0.field_c = ((ik) this).field_c;
          param0.field_l = ((ik) this).field_l;
          param0.field_p = ((ik) this).field_p;
          param0.field_m = ((ik) this).field_m;
          param0.field_r = ((ik) this).field_r;
          param0.field_n = ((ik) this).field_n;
          param0.field_o = ((ik) this).field_o;
          return;
        } else {
          param0.field_d = ((ik) this).field_d;
          param0.field_e = ((ik) this).field_e;
          param0.field_f = ((ik) this).field_f;
          param0.field_c = ((ik) this).field_c;
          param0.field_l = ((ik) this).field_l;
          param0.field_p = ((ik) this).field_p;
          param0.field_m = ((ik) this).field_m;
          param0.field_r = ((ik) this).field_r;
          param0.field_n = ((ik) this).field_n;
          param0.field_o = ((ik) this).field_o;
          return;
        }
    }

    public static void b(byte param0) {
        field_h = null;
        field_b = null;
        field_g = null;
        if (param0 != -108) {
          String discarded$2 = ik.a((byte) 33);
          field_k = null;
          field_s = null;
          return;
        } else {
          field_k = null;
          field_s = null;
          return;
        }
    }

    private final int a(int param0, w param1, int param2, int param3) {
        if (param0 != 40) {
          field_g = null;
          return param3 + param1.field_p + (param2 + param1.field_t + ((ik) this).field_a);
        } else {
          return param3 + param1.field_p + (param2 + param1.field_t + ((ik) this).field_a);
        }
    }

    public final int a(w param0, int param1) {
        Object var4 = null;
        if (param1 != 227) {
          var4 = null;
          ve discarded$2 = ((ik) this).a((w) null, (byte) 102);
          return -((ik) this).field_r + (-((ik) this).field_a + param0.field_j);
        } else {
          return -((ik) this).field_r + (-((ik) this).field_a + param0.field_j);
        }
    }

    public final int a(int param0) {
        if (param0 != 2) {
          field_s = null;
          return ((ik) this).field_f.field_G + ((ik) this).field_f.field_E;
        } else {
          return ((ik) this).field_f.field_G + ((ik) this).field_f.field_E;
        }
    }

    public final int b(w param0, int param1, int param2) {
        Object var5 = null;
        if (param1 < 93) {
          var5 = null;
          this.a((w) null, 21, -11, 2, -8, -25, -110, 81);
          return this.a(40, param0, param2, 0);
        } else {
          return this.a(40, param0, param2, 0);
        }
    }

    private final void b(w param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        if (param0.field_w == null) {
          L0: {
            param0.field_w = (ve) (Object) new kk();
            var3 = ((ik) this).a(param0, 227);
            var6 = -35 % ((13 - param1) / 61);
            var4 = this.a((byte) -114, param0);
            var7 = ((ik) this).field_m;
            if (-1 == var7) {
              var5 = ((ik) this).field_f.field_E;
              break L0;
            } else {
              if (-3 != var7) {
                if (3 != var7) {
                  if ((var7 ^ -1) != -2) {
                    var5 = (-((ik) this).field_f.field_E + (var4 + -((ik) this).field_f.field_G) >> -1558565567) + ((ik) this).field_f.field_E;
                    break L0;
                  } else {
                    L1: {
                      var5 = (-((ik) this).field_f.field_E + (var4 + -((ik) this).field_f.field_G) >> -1558565567) + ((ik) this).field_f.field_E;
                      var7 = ((ik) this).field_p;
                      if (var7 == 0) {
                        break L1;
                      } else {
                        if (var7 == -4) {
                          break L1;
                        } else {
                          if (-2 == var7) {
                            if (!(param0.field_w instanceof kk)) {
                              return;
                            } else {
                              ((kk) (Object) param0.field_w).a(var5, ((ik) this).field_f, ((ik) this).c(349, param0), var3 >> -1157494559, (byte) -11);
                              return;
                            }
                          } else {
                            if (-3 == (var7 ^ -1)) {
                              if (!(param0.field_w instanceof kk)) {
                                return;
                              } else {
                                ((kk) (Object) param0.field_w).a(((ik) this).field_f, ((ik) this).c(349, param0), (byte) -125, var3, var5);
                                return;
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                    if (param0.field_w instanceof kk) {
                      ((kk) (Object) param0.field_w).a(118, 0, ((ik) this).c(349, param0), ((ik) this).field_f, var5);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L2: {
                    var5 = (-((ik) this).field_f.field_E + (var4 + -((ik) this).field_f.field_G) >> -1558565567) + ((ik) this).field_f.field_E;
                    var7 = ((ik) this).field_p;
                    if (var7 == 0) {
                      break L2;
                    } else {
                      if (var7 == -4) {
                        break L2;
                      } else {
                        if (-2 == var7) {
                          if (!(param0.field_w instanceof kk)) {
                            return;
                          } else {
                            ((kk) (Object) param0.field_w).a(var5, ((ik) this).field_f, ((ik) this).c(349, param0), var3 >> -1157494559, (byte) -11);
                            return;
                          }
                        } else {
                          if (-3 == (var7 ^ -1)) {
                            if (param0.field_w instanceof kk) {
                              ((kk) (Object) param0.field_w).a(((ik) this).field_f, ((ik) this).c(349, param0), (byte) -125, var3, var5);
                              return;
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                  if (param0.field_w instanceof kk) {
                    ((kk) (Object) param0.field_w).a(118, 0, ((ik) this).c(349, param0), ((ik) this).field_f, var5);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L3: {
                  var5 = -((ik) this).field_f.field_G + var4;
                  var7 = ((ik) this).field_p;
                  if (var7 == 0) {
                    break L3;
                  } else {
                    if (var7 == -4) {
                      break L3;
                    } else {
                      if (-2 == var7) {
                        if (param0.field_w instanceof kk) {
                          ((kk) (Object) param0.field_w).a(var5, ((ik) this).field_f, ((ik) this).c(349, param0), var3 >> -1157494559, (byte) -11);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (-3 == (var7 ^ -1)) {
                          if (!(param0.field_w instanceof kk)) {
                            return;
                          } else {
                            ((kk) (Object) param0.field_w).a(((ik) this).field_f, ((ik) this).c(349, param0), (byte) -125, var3, var5);
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                if (param0.field_w instanceof kk) {
                  ((kk) (Object) param0.field_w).a(118, 0, ((ik) this).c(349, param0), ((ik) this).field_f, var5);
                  return;
                } else {
                  return;
                }
              }
            }
          }
          L4: {
            L5: {
              var7 = ((ik) this).field_p;
              if (var7 == 0) {
                break L5;
              } else {
                if (var7 == -4) {
                  break L5;
                } else {
                  if (-2 == var7) {
                    if (param0.field_w instanceof kk) {
                      ((kk) (Object) param0.field_w).a(var5, ((ik) this).field_f, ((ik) this).c(349, param0), var3 >> -1157494559, (byte) -11);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (-3 == (var7 ^ -1)) {
                      if (!(param0.field_w instanceof kk)) {
                        break L4;
                      } else {
                        ((kk) (Object) param0.field_w).a(((ik) this).field_f, ((ik) this).c(349, param0), (byte) -125, var3, var5);
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            if (!(param0.field_w instanceof kk)) {
              break L4;
            } else {
              ((kk) (Object) param0.field_w).a(118, 0, ((ik) this).c(349, param0), ((ik) this).field_f, var5);
              return;
            }
          }
          return;
        } else {
          L6: {
            var3 = ((ik) this).a(param0, 227);
            var6 = -35 % ((13 - param1) / 61);
            var4 = this.a((byte) -114, param0);
            var7 = ((ik) this).field_m;
            if (-1 == var7) {
              var5 = ((ik) this).field_f.field_E;
              break L6;
            } else {
              if (-3 != var7) {
                L7: {
                  if (3 == var7) {
                    break L7;
                  } else {
                    if ((var7 ^ -1) != -2) {
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                var5 = (-((ik) this).field_f.field_E + (var4 + -((ik) this).field_f.field_G) >> -1558565567) + ((ik) this).field_f.field_E;
                break L6;
              } else {
                L8: {
                  L9: {
                    var5 = -((ik) this).field_f.field_G + var4;
                    var7 = ((ik) this).field_p;
                    if (var7 == 0) {
                      break L9;
                    } else {
                      if (var7 == -4) {
                        break L9;
                      } else {
                        if (-2 == var7) {
                          if (param0.field_w instanceof kk) {
                            ((kk) (Object) param0.field_w).a(var5, ((ik) this).field_f, ((ik) this).c(349, param0), var3 >> -1157494559, (byte) -11);
                            break L8;
                          } else {
                            break L8;
                          }
                        } else {
                          if (-3 == (var7 ^ -1)) {
                            if (!(param0.field_w instanceof kk)) {
                              break L8;
                            } else {
                              ((kk) (Object) param0.field_w).a(((ik) this).field_f, ((ik) this).c(349, param0), (byte) -125, var3, var5);
                              break L8;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  if (!(param0.field_w instanceof kk)) {
                    break L8;
                  } else {
                    ((kk) (Object) param0.field_w).a(118, 0, ((ik) this).c(349, param0), ((ik) this).field_f, var5);
                    break L8;
                  }
                }
                return;
              }
            }
          }
          L10: {
            var7 = ((ik) this).field_p;
            if (var7 == 0) {
              break L10;
            } else {
              if (var7 == -4) {
                break L10;
              } else {
                if (-2 == var7) {
                  if (!(param0.field_w instanceof kk)) {
                    return;
                  } else {
                    ((kk) (Object) param0.field_w).a(var5, ((ik) this).field_f, ((ik) this).c(349, param0), var3 >> -1157494559, (byte) -11);
                    return;
                  }
                } else {
                  if (-3 == (var7 ^ -1)) {
                    if (param0.field_w instanceof kk) {
                      ((kk) (Object) param0.field_w).a(((ik) this).field_f, ((ik) this).c(349, param0), (byte) -125, var3, var5);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          if (param0.field_w instanceof kk) {
            ((kk) (Object) param0.field_w).a(118, 0, ((ik) this).c(349, param0), ((ik) this).field_f, var5);
            return;
          } else {
            return;
          }
        }
    }

    ik(le param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    protected ik() {
    }

    ik(le param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((ik) this).field_a = param1;
        ((ik) this).field_q = param6;
        ((ik) this).field_l = param11;
        ((ik) this).field_m = param8;
        ((ik) this).field_e = param5;
        ((ik) this).field_n = param9;
        ((ik) this).field_p = param7;
        ((ik) this).field_f = param0;
        ((ik) this).field_d = param3;
        ((ik) this).field_i = param12 ? true : false;
        ((ik) this).field_c = param10;
        ((ik) this).field_o = param4;
        ((ik) this).field_r = param2;
    }

    String c(int param0, w param1) {
        Object var4 = null;
        if (param0 != 349) {
          var4 = null;
          int discarded$2 = ((ik) this).b((w) null, 108, 82);
          return param1.field_u;
        } else {
          return param1.field_u;
        }
    }

    private final int a(byte param0, w param1) {
        if (param0 >= -38) {
            return -66;
        }
        return param1.field_v + -((ik) this).field_d + -((ik) this).field_o;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 250;
        field_s = new int[]{35, 83, 131, 179, 227, 203, 179, 155, 59, 83, 107, 107, 155, 131, 131, 131};
        field_b = new int[]{349, 349, 349, 349, 349, 313, 277, 241, 313, 277, 241, 313, 313, 277, 301, 205};
    }
}
