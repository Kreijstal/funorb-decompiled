/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    private fm field_a;
    static vg field_d;
    static boolean field_g;
    private le field_h;
    static String field_c;
    private fm field_b;
    static int field_e;
    static int field_f;

    final static int a(int param0) {
        if (param0 > -103) {
            return 88;
        }
        return ia.field_i;
    }

    final qe a(int param0, boolean param1) {
        fm stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        fm stackIn_8_0;
        int stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        fm stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        fm stackIn_12_0;
        int stackIn_12_1;
        int stackIn_12_2;
        int stackIn_12_3;
        fm stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        fm stackIn_30_0;
        int stackIn_30_1;
        int stackIn_30_2;
        int stackIn_30_3;
        fm stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        fm stackIn_34_0;
        int stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_3;
        qe var3;
        byte[] var4;
        qe var5;
        qe var6;
        if (!param1) {
          var3 = (qe) (this.field_h.a((long)param0, 0));
          if (var3 != null) {
            return var3;
          } else {
            L0: {
              if (32768 > param0) {
                L1: {
                  stackIn_33_0 = this.field_a;

                  stackIn_33_1 = 0;

                  stackIn_33_2 = param0;

                  if (param1) {
                    stackIn_34_0 = (fm) ((Object) stackIn_33_0);
                    stackIn_34_1 = stackIn_33_1;
                    stackIn_34_2 = stackIn_33_2;
                    stackIn_34_3 = 0;
                    break L1;
                  } else {
                    stackIn_34_0 = (fm) ((Object) stackIn_33_0);
                    stackIn_34_1 = stackIn_33_1;
                    stackIn_34_2 = stackIn_33_2;
                    stackIn_34_3 = 1;
                    break L1;
                  }
                }
                var4 = ((fm) (Object) stackIn_34_0).a(stackIn_34_1, stackIn_34_2, stackIn_34_3 != 0);
                break L0;
              } else {
                L2: {
                  stackIn_29_0 = this.field_b;

                  stackIn_29_1 = 0;

                  stackIn_29_2 = 32767 & param0;

                  if (param1) {
                    stackIn_30_0 = (fm) ((Object) stackIn_29_0);
                    stackIn_30_1 = stackIn_29_1;
                    stackIn_30_2 = stackIn_29_2;
                    stackIn_30_3 = 0;
                    break L2;
                  } else {
                    stackIn_30_0 = (fm) ((Object) stackIn_29_0);
                    stackIn_30_1 = stackIn_29_1;
                    stackIn_30_2 = stackIn_29_2;
                    stackIn_30_3 = 1;
                    break L2;
                  }
                }
                var4 = ((fm) (Object) stackIn_30_0).a(stackIn_30_1, stackIn_30_2, stackIn_30_3 != 0);
                break L0;
              }
            }
            var6 = new qe();
            if (var4 != null) {
              L3: {
                var6.a(false, new we(var4));
                if ((param0 ^ -1) <= -32769) {
                  var6.a((byte) 92);
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_h.a((long)param0, var6, (byte) 109);
              return var6;
            } else {
              L4: {
                if ((param0 ^ -1) <= -32769) {
                  var6.a((byte) 92);
                  break L4;
                } else {
                  break L4;
                }
              }
              this.field_h.a((long)param0, var6, (byte) 109);
              return var6;
            }
          }
        } else {
          field_e = 75;
          var3 = (qe) (this.field_h.a((long)param0, 0));
          if (var3 != null) {
            return var3;
          } else {
            L5: {
              if (32768 > param0) {
                L6: {
                  stackIn_11_0 = this.field_a;

                  stackIn_11_1 = 0;

                  stackIn_11_2 = param0;

                  if (param1) {
                    stackIn_12_0 = (fm) ((Object) stackIn_11_0);
                    stackIn_12_1 = stackIn_11_1;
                    stackIn_12_2 = stackIn_11_2;
                    stackIn_12_3 = 0;
                    break L6;
                  } else {
                    stackIn_12_0 = (fm) ((Object) stackIn_11_0);
                    stackIn_12_1 = stackIn_11_1;
                    stackIn_12_2 = stackIn_11_2;
                    stackIn_12_3 = 1;
                    break L6;
                  }
                }
                var4 = ((fm) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_12_2, stackIn_12_3 != 0);
                break L5;
              } else {
                L7: {
                  stackIn_7_0 = this.field_b;

                  stackIn_7_1 = 0;

                  stackIn_7_2 = 32767 & param0;

                  if (param1) {
                    stackIn_8_0 = (fm) ((Object) stackIn_7_0);
                    stackIn_8_1 = stackIn_7_1;
                    stackIn_8_2 = stackIn_7_2;
                    stackIn_8_3 = 0;
                    break L7;
                  } else {
                    stackIn_8_0 = (fm) ((Object) stackIn_7_0);
                    stackIn_8_1 = stackIn_7_1;
                    stackIn_8_2 = stackIn_7_2;
                    stackIn_8_3 = 1;
                    break L7;
                  }
                }
                var4 = ((fm) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3 != 0);
                break L5;
              }
            }
            var5 = new qe();
            var3 = var5;
            if (var4 != null) {
              L8: {
                var5.a(false, new we(var4));
                if ((param0 ^ -1) <= -32769) {
                  var5.a((byte) 92);
                  break L8;
                } else {
                  break L8;
                }
              }
              this.field_h.a((long)param0, var5, (byte) 109);
              return var5;
            } else {
              L9: {
                if ((param0 ^ -1) <= -32769) {
                  var5.a((byte) 92);
                  break L9;
                } else {
                  break L9;
                }
              }
              this.field_h.a((long)param0, var5, (byte) 109);
              return var5;
            }
          }
        }
    }

    final static void a(int param0, uj param1) {
        uj var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (param0 <= -12) {
              param1.c(2779);
              var2 = (uj) ((Object) i.field_n.c(1504642273));
              L1: while (true) {
                L2: {
                  if (var2 == null) {
                    break L2;
                  } else {
                    if (!var2.a(param1, (byte) -82)) {
                      break L2;
                    } else {
                      var2 = (uj) ((Object) i.field_n.f(1504642273));
                      continue L1;
                    }
                  }
                }
                if (var2 != null) {
                  stackIn_10_0 = 126;
                  jj.a((byte) stackIn_10_0, var2, param1);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  i.field_n.a(22125, param1);
                  return;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2_ref);

            stackIn_14_1 = new StringBuilder().append("il.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_d = null;
        if (param0 != -17194) {
            field_c = (String) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    il(int param0, fm param1, fm param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_h = new le(64);
        try {
          L0: {
            L1: {
              this.field_a = param1;
              this.field_b = param2;
              if (this.field_a == null) {
                break L1;
              } else {
                this.field_a.b(0, (byte) 63);
                break L1;
              }
            }
            if (this.field_b == null) {
              break L0;
            } else {
              this.field_b.b(0, (byte) 24);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("il.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    static {
        field_g = false;
        field_c = "Similar rating";
        field_e = -1;
    }
}
