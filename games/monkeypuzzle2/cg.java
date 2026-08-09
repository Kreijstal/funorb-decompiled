/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    private int field_j;
    private int field_i;
    static kg field_c;
    private ug[] field_e;
    private ug field_f;
    static cj field_a;
    static int field_g;
    static int[] field_d;
    static int field_h;
    private ug field_b;

    public static void b(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 >= -107) {
            field_g = 123;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static void a(boolean param0) {
        if (ok.a(param0)) {
            return;
        }
        if (!(null != fj.field_E)) {
            fj.field_E = je.a(4, -128);
        }
    }

    final static boolean a(String param0, byte param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 30) {
                break L1;
              } else {
                cg.b((byte) -92);
                break L1;
              }
            }
            try {
              L2: {
                if (!md.field_f.startsWith("win")) {
                  stackIn_6_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L2;
                } else {
                  L3: {
                    if (param0.startsWith("http://")) {
                      break L3;
                    } else {
                      if (param0.startsWith("https://")) {
                        break L3;
                      } else {
                        stackIn_10_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L2;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (param0.length() <= var3) {
                          break L6;
                        } else {
                          stackIn_20_0 = 0;

                          if (var4 != 0) {
                            break L5;
                          } else {
                            if (stackIn_20_0 == (var2.indexOf((int) param0.charAt(var3)) ^ -1)) {
                              stackIn_17_0 = 0;
                              decompiledRegionSelector0 = 3;
                              break L2;
                            } else {
                              var3++;
                              if (var4 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                      stackIn_20_0 = 1;
                      break L5;
                    }
                    decompiledRegionSelector0 = 2;
                    break L2;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_22_0 = 0;
              return stackIn_22_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L7: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2_ref2);

            stackIn_25_1 = new StringBuilder().append("cg.C(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_20_0 != 0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
        }
    }

    final ug a(byte param0, long param1) {
        ug var4;
        ug var5;
        int var6;
        Object stackIn_7_0 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 >= 111) {
          var4 = this.field_e[(int)(param1 & (long)(-1 + this.field_j))];
          this.field_b = var4.field_d;
          L0: while (true) {
            if (this.field_b != var4) {
              stackIn_7_0 = this;

              if (var6 == 0) {
                if ((((cg) (this)).field_b.field_a ^ -1L) != (param1 ^ -1L)) {
                  this.field_b = this.field_b.field_d;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    this.field_b = null;
                    return null;
                  }
                } else {
                  var5 = this.field_b;
                  this.field_b = this.field_b.field_d;
                  return var5;
                }
              } else {
                ((cg) (this)).field_b = null;
                return null;
              }
            } else {
              this.field_b = null;
              return null;
            }
          }
        } else {
          return (ug) null;
        }
    }

    final void a(ug param0, long param1, byte param2) {
        ug var5 = null;
        try {
            if (null != param0.field_c) {
                param0.c(-19822);
            }
            var5 = this.field_e[(int)(param1 & (long)(-1 + this.field_j))];
            if (param2 != -36) {
                this.a((byte) -88);
            }
            param0.field_d = var5;
            param0.field_c = var5.field_c;
            param0.field_c.field_d = param0;
            param0.field_a = param1;
            param0.field_d.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "cg.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final ug a(int param0) {
        this.field_i = param0;
        return this.a((byte) -55);
    }

    final ug a(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        ug var4;
        ug var5;
        ug var6;
        ug var9;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (0 < this.field_i) {
          if (this.field_e[-1 + this.field_i] == this.field_f) {
            L0: while (true) {
              L1: {
                if (this.field_i >= this.field_j) {
                  break L1;
                } else {
                  fieldTemp$2 = this.field_i;
                  this.field_i = this.field_i + 1;
                  var4 = this.field_e[fieldTemp$2].field_d;
                  var6 = var4;
                  if (var3 == 0) {
                    if (var4 != this.field_e[-1 + this.field_i]) {
                      this.field_f = var6.field_d;
                      return var6;
                    } else {
                      if (var3 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (param0 == -55) {
                return null;
              } else {
                field_d = (int[]) null;
                return null;
              }
            }
          } else {
            var9 = this.field_f;
            this.field_f = var9.field_d;
            return var9;
          }
        } else {
          L2: while (true) {
            L3: {
              if (this.field_i >= this.field_j) {
                break L3;
              } else {
                fieldTemp$3 = this.field_i;
                this.field_i = this.field_i + 1;
                var4 = this.field_e[fieldTemp$3].field_d;
                var5 = var4;
                if (var3 == 0) {
                  if (var4 != this.field_e[-1 + this.field_i]) {
                    this.field_f = var5.field_d;
                    return var5;
                  } else {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  return null;
                }
              }
            }
            if (param0 == -55) {
              return null;
            } else {
              field_d = (int[]) null;
              return null;
            }
          }
        }
    }

    cg(int param0) {
        ug dupTemp$0 = null;
        ug var3 = null;
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        this.field_i = 0;
        this.field_j = param0;
        this.field_e = new ug[param0];
        int var2 = 0;
        do {
            if (var2 >= param0) {
                return;
            }
            dupTemp$0 = new ug();
            var3 = dupTemp$0;
            this.field_e[var2] = dupTemp$0;
            var3.field_c = var3;
            var3.field_d = var3;
            var2++;
            if (var4 != 0) {
                return;
            }
        } while (var4 == 0);
    }

    static {
        field_c = new kg();
        field_d = new int[4];
    }
}
