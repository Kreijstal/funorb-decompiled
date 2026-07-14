/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class et implements ntb {
    int field_a;
    static aba field_c;
    int field_b;

    public final void a(tv param0, int param1) {
        int var4 = 0;
        Object var5 = null;
        et var6 = null;
        var6 = (et) (Object) param0;
        var4 = 0;
        if (param1 >= -19) {
          L0: {
            var5 = null;
            ((et) this).a((faa) null, true);
            if (((et) this).field_a == var6.field_a) {
              break L0;
            } else {
              System.out.println("int value has changed. before=" + var6.field_a + ", now=" + ((et) this).field_a);
              var4 = 1;
              break L0;
            }
          }
          L1: {
            if (((et) this).field_b != var6.field_b) {
              System.out.println("int label has changed. before=" + var6.field_b + ", now=" + ((et) this).field_b);
              var4 = 1;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var4 != 0) {
              System.out.println("This instance of MissionVariable has changed");
              break L2;
            } else {
              break L2;
            }
          }
          return;
        } else {
          L3: {
            if (((et) this).field_a == var6.field_a) {
              break L3;
            } else {
              System.out.println("int value has changed. before=" + var6.field_a + ", now=" + ((et) this).field_a);
              var4 = 1;
              break L3;
            }
          }
          L4: {
            if (((et) this).field_b != var6.field_b) {
              System.out.println("int label has changed. before=" + var6.field_b + ", now=" + ((et) this).field_b);
              var4 = 1;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (var4 != 0) {
              System.out.println("This instance of MissionVariable has changed");
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    final static short[] a(faa param0, int param1, int param2, short[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        var8 = VoidHunters.field_G;
        if (param2 == 24) {
          var4 = param0.i(0, param1);
          if (var4 != 0) {
            if (param3 != null) {
              if (param3.length != var4) {
                L0: {
                  param3 = new short[var4];
                  var5 = param0.i(param2 + -24, 4);
                  var6 = (short)param0.i(0, 16);
                  if (0 < var5) {
                    var7 = 0;
                    L1: while (true) {
                      if (var4 <= var7) {
                        break L0;
                      } else {
                        param3[var7] = (short)(var6 + param0.i(0, var5));
                        var7++;
                        continue L1;
                      }
                    }
                  } else {
                    var7 = 0;
                    L2: while (true) {
                      if (var4 <= var7) {
                        break L0;
                      } else {
                        param3[var7] = (short)var6;
                        var7++;
                        continue L2;
                      }
                    }
                  }
                }
                return param3;
              } else {
                L3: {
                  var5 = param0.i(param2 + -24, 4);
                  var6 = (short)param0.i(0, 16);
                  if (0 < var5) {
                    var7 = 0;
                    L4: while (true) {
                      if (var4 <= var7) {
                        break L3;
                      } else {
                        param3[var7] = (short)(var6 + param0.i(0, var5));
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (var4 <= var7) {
                        break L3;
                      } else {
                        param3[var7] = (short)var6;
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                return param3;
              }
            } else {
              L6: {
                param3 = new short[var4];
                var5 = param0.i(param2 + -24, 4);
                var6 = (short)param0.i(0, 16);
                if (0 < var5) {
                  var7 = 0;
                  L7: while (true) {
                    if (var4 <= var7) {
                      break L6;
                    } else {
                      param3[var7] = (short)(var6 + param0.i(0, var5));
                      var7++;
                      continue L7;
                    }
                  }
                } else {
                  var7 = 0;
                  L8: while (true) {
                    if (var4 <= var7) {
                      break L6;
                    } else {
                      param3[var7] = (short)var6;
                      var7++;
                      continue L8;
                    }
                  }
                }
              }
              return param3;
            }
          } else {
            return null;
          }
        } else {
          var9 = null;
          short[] discarded$1 = et.a((faa) null, 91, -12, (short[]) null);
          var4 = param0.i(0, param1);
          if (var4 != 0) {
            L9: {
              if (param3 == null) {
                param3 = new short[var4];
                break L9;
              } else {
                if (param3.length != var4) {
                  param3 = new short[var4];
                  break L9;
                } else {
                  L10: {
                    var5 = param0.i(param2 + -24, 4);
                    var6 = (short)param0.i(0, 16);
                    if (0 < var5) {
                      var7 = 0;
                      L11: while (true) {
                        if (var4 <= var7) {
                          break L10;
                        } else {
                          param3[var7] = (short)(var6 + param0.i(0, var5));
                          var7++;
                          continue L11;
                        }
                      }
                    } else {
                      var7 = 0;
                      L12: while (true) {
                        if (var4 <= var7) {
                          break L10;
                        } else {
                          param3[var7] = (short)var6;
                          var7++;
                          continue L12;
                        }
                      }
                    }
                  }
                  return param3;
                }
              }
            }
            var5 = param0.i(param2 + -24, 4);
            var6 = (short)param0.i(0, 16);
            if (0 >= var5) {
              var7 = 0;
              L13: while (true) {
                if (var4 > var7) {
                  param3[var7] = (short)var6;
                  var7++;
                  continue L13;
                } else {
                  return param3;
                }
              }
            } else {
              var7 = 0;
              L14: while (true) {
                if (var4 <= var7) {
                  return param3;
                } else {
                  param3[var7] = (short)(var6 + param0.i(0, var5));
                  var7++;
                  continue L14;
                }
              }
            }
          } else {
            return null;
          }
        }
    }

    public static void a(byte param0) {
        int var1 = 109 % ((param0 - 66) / 57);
        field_c = null;
    }

    public final void b(faa param0, int param1) {
        param0.a(-632, ((et) this).field_a, 32);
        param0.a(-632, ((et) this).field_b, 32);
        if (param1 > -109) {
            Object var4 = null;
            et.a((asb) null, (asb) null, -60, false);
        }
    }

    public final void b(byte param0, tv param1) {
        Object var4 = null;
        et var6 = null;
        et var7 = null;
        var6 = (et) (Object) param1;
        var7 = var6;
        if (param0 < 54) {
          var4 = null;
          ((et) this).b((faa) null, 104);
          var7.field_a = ((et) this).field_a;
          var7.field_b = ((et) this).field_b;
          return;
        } else {
          var7.field_a = ((et) this).field_a;
          var7.field_b = ((et) this).field_b;
          return;
        }
    }

    final static void a(asb param0, asb param1, int param2, boolean param3) {
        qu.a(qc.field_q, 0, cwa.field_c, (no) (Object) ef.field_y, mla.field_q, pva.field_d, iga.field_o, param3, vlb.field_a, gjb.field_p, asb.field_a, cab.field_o);
        pmb.field_o = wjb.a(param0, true, "lobby", "chatfilter");
        fqb.field_o[2] = gpa.field_f;
        fqb.field_o[0] = iv.field_p;
        fqb.field_o[1] = pp.field_q;
        bj.a((byte) -35, param1, (no) (Object) rh.field_o);
        if (param2 != 2874) {
            et.a((byte) -66);
        }
    }

    public final void a(faa param0, boolean param1) {
        ((et) this).field_a = param0.i(0, 32);
        ((et) this).field_b = param0.i(0, 32);
        if (param1) {
            ((et) this).field_b = -94;
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3 = 0;
        et var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var3 = -51 % ((22 - param0) / 59);
        var4 = (et) (Object) param1;
        if (var4.field_a == var4.field_a) {
          if (var4.field_b != var4.field_b) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new aba();
    }
}
