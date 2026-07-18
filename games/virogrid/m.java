/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    private uf field_l;
    bi field_j;
    int field_e;
    int field_k;
    static mg[] field_f;
    static int[] field_i;
    byte[][] field_d;
    static byte[] field_a;
    private int field_b;
    static int field_m;
    int field_c;
    boolean[][] field_h;
    p field_g;

    final void a(int param0) {
        int var2 = 0;
        fb var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        byte[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        byte[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        byte[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        byte[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        byte[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        var2 = 2 % ((-69 - param0) / 55);
        var3 = (fb) (Object) ((m) this).field_g.a((byte) -87);
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              L2: {
                var4 = var3.field_j;
                if (var4 != 0) {
                  if (1 != var4) {
                    if (var4 == 2) {
                      L3: {
                        var3.field_n = var3.field_n - 3;
                        var3.field_h = var3.field_h - 40;
                        if (var3.field_n >= 0) {
                          break L3;
                        } else {
                          if (var3.field_h >= 0) {
                            break L3;
                          } else {
                            L4: {
                              pe discarded$1 = vm.a((byte) 30, td.field_d[sh.a(4712, 5)]);
                              stackOut_14_0 = ((m) this).field_d[var3.field_g];
                              stackOut_14_1 = var3.field_k;
                              stackIn_16_0 = stackOut_14_0;
                              stackIn_16_1 = stackOut_14_1;
                              stackIn_15_0 = stackOut_14_0;
                              stackIn_15_1 = stackOut_14_1;
                              if (!var3.field_q) {
                                stackOut_16_0 = (byte[]) (Object) stackIn_16_0;
                                stackOut_16_1 = stackIn_16_1;
                                stackOut_16_2 = 1;
                                stackIn_17_0 = stackOut_16_0;
                                stackIn_17_1 = stackOut_16_1;
                                stackIn_17_2 = stackOut_16_2;
                                break L4;
                              } else {
                                stackOut_15_0 = (byte[]) (Object) stackIn_15_0;
                                stackOut_15_1 = stackIn_15_1;
                                stackOut_15_2 = 0;
                                stackIn_17_0 = stackOut_15_0;
                                stackIn_17_1 = stackOut_15_1;
                                stackIn_17_2 = stackOut_15_2;
                                break L4;
                              }
                            }
                            stackIn_17_0[stackIn_17_1] = (byte)stackIn_17_2;
                            var3.a(false);
                            break L3;
                          }
                        }
                      }
                      L5: {
                        if (var3.field_n < 0) {
                          var3.field_n = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      if (0 > var3.field_h) {
                        var3.field_h = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    var3.field_n = var3.field_n + 4;
                    if (var3.field_n <= 28) {
                      break L2;
                    } else {
                      var3.field_n = 28;
                      var3.field_j = 2;
                      break L2;
                    }
                  }
                } else {
                  var3.field_h = var3.field_h + 40;
                  if (var3.field_h <= 240) {
                    break L2;
                  } else {
                    var3.field_h = 240;
                    var3.field_j = 1;
                    break L2;
                  }
                }
              }
              L6: {
                if (!((m) this).field_l.field_g) {
                  break L6;
                } else {
                  if (var3.field_j < 1) {
                    break L1;
                  } else {
                    break L6;
                  }
                }
              }
              var3 = (fb) (Object) ((m) this).field_g.a(16213);
              continue L0;
            }
          }
          return;
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param2 < -108) {
            break L0;
          } else {
            ((m) this).a(false, -57);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((m) this).field_j) {
              break L2;
            } else {
              if (param0 != ((m) this).field_j.field_a) {
                break L2;
              } else {
                if (((m) this).field_j.field_b != param1) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static ka a() {
        ka var2 = new ka();
        tf.field_a.a((l) (Object) var2, (byte) -50);
        fn.a(4, true);
        return var2;
    }

    final static int b(boolean param0) {
        ql.field_q.b((byte) -116);
        if (!ji.field_e.d(-57)) {
            return dk.b((byte) 108);
        }
        return 0;
    }

    public static void b() {
        field_a = null;
        field_i = null;
        field_f = null;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        for (var2 = 0; ((m) this).field_d.length > var2; var2++) {
            for (var3 = 0; var3 < ((m) this).field_d[0].length; var3++) {
                ((m) this).field_d[var2][var3] = ((m) this).field_l.field_C[var2][var3];
            }
        }
        ((m) this).field_j = null;
        ((m) this).field_g.a(param0);
        ((m) this).field_l.a(((m) this).field_h, ((m) this).field_l.field_A, (byte) 14);
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        int stackOut_47_3 = 0;
        L0: {
          var9 = Virogrid.field_F ? 1 : 0;
          if (-1 >= ((m) this).field_l.field_m) {
            break L0;
          } else {
            if (-1 < ((m) this).field_l.field_w) {
              L1: {
                stackOut_3_0 = this;
                stackOut_3_1 = ((m) this).field_l.field_w;
                stackOut_3_2 = ((m) this).field_l.field_m;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                if (((m) this).field_l.field_C[((m) this).field_l.field_m][((m) this).field_l.field_w] != 0) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = stackIn_5_2;
                  stackOut_5_3 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  stackIn_6_3 = stackOut_5_3;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = stackIn_4_2;
                  stackOut_4_3 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  stackIn_6_3 = stackOut_4_3;
                  break L1;
                }
              }
              L2: {
                int discarded$4 = 16238;
                if (this.a(stackIn_6_1, stackIn_6_2, stackIn_6_3 == 0)) {
                  this.a(((m) this).field_l.field_m, (byte) 99, ((m) this).field_l.field_w);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var3 = -1 + ((m) this).field_l.field_m;
                if (var3 >= 0) {
                  break L3;
                } else {
                  var3 = 0;
                  break L3;
                }
              }
              L4: {
                var4 = ((m) this).field_l.field_m - -1;
                if (var4 >= ((m) this).field_l.field_C.length) {
                  var4 = ((m) this).field_l.field_C.length - 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                var5 = ((m) this).field_l.field_w + 1;
                if (((m) this).field_l.field_C[0].length <= var5) {
                  var5 = ((m) this).field_l.field_C[0].length + -1;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var6 = ((m) this).field_l.field_w - 1;
                if (var6 >= 0) {
                  break L6;
                } else {
                  var6 = 0;
                  break L6;
                }
              }
              var7 = var3;
              L7: while (true) {
                if (var7 > var4) {
                  break L0;
                } else {
                  var8 = var6;
                  L8: while (true) {
                    if (var8 > var5) {
                      var7++;
                      continue L7;
                    } else {
                      if (1 - ((m) this).field_l.field_C[((m) this).field_l.field_m][((m) this).field_l.field_w] == ((m) this).field_d[var7][var8]) {
                        L9: {
                          stackOut_25_0 = this;
                          stackOut_25_1 = var8;
                          stackOut_25_2 = var7;
                          stackIn_27_0 = stackOut_25_0;
                          stackIn_27_1 = stackOut_25_1;
                          stackIn_27_2 = stackOut_25_2;
                          stackIn_26_0 = stackOut_25_0;
                          stackIn_26_1 = stackOut_25_1;
                          stackIn_26_2 = stackOut_25_2;
                          if (((m) this).field_l.field_C[var7][var8] != 0) {
                            stackOut_27_0 = this;
                            stackOut_27_1 = stackIn_27_1;
                            stackOut_27_2 = stackIn_27_2;
                            stackOut_27_3 = 0;
                            stackIn_28_0 = stackOut_27_0;
                            stackIn_28_1 = stackOut_27_1;
                            stackIn_28_2 = stackOut_27_2;
                            stackIn_28_3 = stackOut_27_3;
                            break L9;
                          } else {
                            stackOut_26_0 = this;
                            stackOut_26_1 = stackIn_26_1;
                            stackOut_26_2 = stackIn_26_2;
                            stackOut_26_3 = 1;
                            stackIn_28_0 = stackOut_26_0;
                            stackIn_28_1 = stackOut_26_1;
                            stackIn_28_2 = stackOut_26_2;
                            stackIn_28_3 = stackOut_26_3;
                            break L9;
                          }
                        }
                        int discarded$5 = 16238;
                        if (this.a(stackIn_28_1, stackIn_28_2, stackIn_28_3 == 0)) {
                          this.a(var7, (byte) -119, var8);
                          var8++;
                          continue L8;
                        } else {
                          var8++;
                          continue L8;
                        }
                      } else {
                        var8++;
                        continue L8;
                      }
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        L10: {
          if (param1 == 31626) {
            break L10;
          } else {
            boolean discarded$6 = this.a(49, 29, 84);
            break L10;
          }
        }
        var3 = 0;
        L11: while (true) {
          if (var3 >= ((m) this).field_d.length) {
            L12: {
              if (param0) {
                ((m) this).field_l.a((byte) -78);
                break L12;
              } else {
                break L12;
              }
            }
            ((m) this).field_l.a(((m) this).field_h, -((m) this).field_l.field_A + 1, (byte) 14);
            return;
          } else {
            var4 = 0;
            L13: while (true) {
              if (((m) this).field_d[0].length <= var4) {
                var3++;
                continue L11;
              } else {
                var5 = ((m) this).field_d[var3][var4] ^ ((m) this).field_l.field_C[var3][var4];
                if (var5 != 0) {
                  if (((m) this).field_l.field_C[var3][var4] == -1) {
                    ((m) this).field_d[var3][var4] = ((m) this).field_l.field_C[var3][var4];
                    var4++;
                    continue L13;
                  } else {
                    if (0 != var5) {
                      L14: {
                        stackOut_46_0 = this;
                        stackOut_46_1 = var4;
                        stackOut_46_2 = var3;
                        stackIn_48_0 = stackOut_46_0;
                        stackIn_48_1 = stackOut_46_1;
                        stackIn_48_2 = stackOut_46_2;
                        stackIn_47_0 = stackOut_46_0;
                        stackIn_47_1 = stackOut_46_1;
                        stackIn_47_2 = stackOut_46_2;
                        if (((m) this).field_l.field_C[var3][var4] != 0) {
                          stackOut_48_0 = this;
                          stackOut_48_1 = stackIn_48_1;
                          stackOut_48_2 = stackIn_48_2;
                          stackOut_48_3 = 0;
                          stackIn_49_0 = stackOut_48_0;
                          stackIn_49_1 = stackOut_48_1;
                          stackIn_49_2 = stackOut_48_2;
                          stackIn_49_3 = stackOut_48_3;
                          break L14;
                        } else {
                          stackOut_47_0 = this;
                          stackOut_47_1 = stackIn_47_1;
                          stackOut_47_2 = stackIn_47_2;
                          stackOut_47_3 = 1;
                          stackIn_49_0 = stackOut_47_0;
                          stackIn_49_1 = stackOut_47_1;
                          stackIn_49_2 = stackOut_47_2;
                          stackIn_49_3 = stackOut_47_3;
                          break L14;
                        }
                      }
                      int discarded$7 = 16238;
                      if (this.a(stackIn_49_1, stackIn_49_2, stackIn_49_3 == 0)) {
                        this.a(var3, (byte) -116, var4);
                        var4++;
                        continue L13;
                      } else {
                        var4++;
                        continue L13;
                      }
                    } else {
                      var4++;
                      continue L13;
                    }
                  }
                } else {
                  var4++;
                  continue L13;
                }
              }
            }
          }
        }
    }

    private final boolean a(int param0, int param1, boolean param2) {
        int var6 = Virogrid.field_F ? 1 : 0;
        fb var5 = (fb) (Object) ((m) this).field_g.a((byte) -68);
        while (var5 != null) {
            if (param2 == var5.field_q) {
                if (param0 == var5.field_k) {
                    if (var5.field_g == param1) {
                        return true;
                    }
                }
            }
            var5 = (fb) (Object) ((m) this).field_g.a(16213);
        }
        return false;
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Virogrid.field_F ? 1 : 0;
          var4 = -48 % ((param1 - -36) / 54);
          if (((m) this).field_l.field_C[param0][param2] == 0) {
            L1: {
              if (((m) this).field_b != 0) {
                break L1;
              } else {
                if (this.a(param2, param0, -124)) {
                  ((m) this).field_g.a((l) (Object) new fb(((m) this).field_j, true), (byte) -100);
                  ((m) this).field_j = null;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            ((m) this).field_g.a((l) (Object) new fb(param2, param0, true), (byte) -41);
            pe discarded$11 = vm.a((byte) 30, tk.field_c[sh.a(4712, 5)]);
            break L0;
          } else {
            if (((m) this).field_l.field_C[param0][param2] == 1) {
              L2: {
                if (((m) this).field_b != 1) {
                  break L2;
                } else {
                  if (this.a(param2, param0, -111)) {
                    ((m) this).field_g.a((l) (Object) new fb(((m) this).field_j, false), (byte) -75);
                    ((m) this).field_j = null;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              ((m) this).field_g.a((l) (Object) new fb(param2, param0, false), (byte) -51);
              pe discarded$12 = vm.a((byte) 30, tk.field_c[sh.a(4712, 5)]);
              break L0;
            } else {
              break L0;
            }
          }
        }
    }

    m(uf param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        ((m) this).field_k = -1;
        ((m) this).field_c = -1;
        try {
            ((m) this).field_b = param1;
            ((m) this).field_l = param0;
            ((m) this).field_g = new p();
            ((m) this).field_d = new byte[((m) this).field_l.field_C.length][((m) this).field_l.field_C[0].length];
            for (var3_int = 0; var3_int < ((m) this).field_d.length; var3_int++) {
                for (var4 = 0; ((m) this).field_d[0].length > var4; var4++) {
                    ((m) this).field_d[var3_int][var4] = ((m) this).field_l.field_C[var3_int][var4];
                }
            }
            ((m) this).field_h = new boolean[((m) this).field_d.length][((m) this).field_d[0].length];
            ((m) this).field_e = -1;
            ((m) this).field_l.a(((m) this).field_h, ((m) this).field_l.field_A, (byte) 14);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "m.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[4];
        field_a = new byte[]{(byte) 2, (byte) 1};
    }
}
