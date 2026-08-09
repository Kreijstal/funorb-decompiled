/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static aba field_c;
    private mkb field_a;
    private mkb field_d;
    private vca field_b;

    final void a(boolean param0) {
        this.field_a.a(-108);
        if (param0) {
            je.b((byte) -55);
        }
    }

    final static boolean a(byte param0, CharSequence param1, boolean param2) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param1.length();
                if (-2 < (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (12 < var3_int) {
                    break L1;
                  } else {
                    L2: {
                      var4 = jwa.a(false, param1);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if ((var4.length() ^ -1) > -2) {
                          break L2;
                        } else {
                          if (fg.a(var4.charAt(0), 104)) {
                            stackIn_19_0 = 0;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            if (!fg.a(var4.charAt(var4.length() - 1), 26)) {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (param1.length() <= var6) {
                                  if (0 < var5) {
                                    stackIn_34_0 = 0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  } else {
                                    L4: {
                                      if (param0 == -31) {
                                        break L4;
                                      } else {
                                        je.a((byte) 82);
                                        break L4;
                                      }
                                    }
                                    stackIn_38_0 = 1;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  }
                                } else {
                                  L5: {
                                    var7 = param1.charAt(var6);
                                    if (!fg.a((char) var7, 46)) {
                                      var5 = 0;
                                      break L5;
                                    } else {
                                      var5++;
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if (-3 < (var5 ^ -1)) {
                                      break L6;
                                    } else {
                                      if (!param2) {
                                        stackIn_29_0 = 0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L3;
                                }
                              }
                            } else {
                              return false;
                            }
                          }
                        }
                      }
                    }
                    stackIn_14_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_9_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var3);

            stackIn_41_1 = new StringBuilder().append("je.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L7;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_29_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_34_0 != 0;
                  } else {
                    return stackIn_38_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 != 117) {
            je.b((byte) -3);
        }
    }

    final static void a(byte param0) {
        lsa var1 = (lsa) ((Object) vfa.field_p.d(0));
        if (param0 <= 108) {
            je.b((byte) -96);
        }
        if (var1 == null) {
            ifb.l(-116);
            return;
        }
        faa var2 = qga.field_b;
        var2.h(62);
        var2.h(90);
        var2.h(60);
        var2.h(93);
        var1.b(-3846);
    }

    final void a(int param0, pf param1) {
        try {
            this.field_a.a(param0, 786336, 97);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "je.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    je(pf param0) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4_int = 0;
        jaclib.memory.Stream var4 = null;
        int var5 = 0;
        jaclib.memory.Buffer var7 = null;
        jaclib.memory.Stream var8 = null;
        jaclib.memory.Buffer var9 = null;
        try {
          L0: {
            L1: {
              param0.a(10, new qma[]{new qma(new pb[]{pb.field_k, pb.field_d, pb.field_l}), new qma(pb.field_g)});
              this.field_a = param0.a(true, 3);
              this.field_d = param0.a(false, 3);
              this.field_d.a(12, 393168, 119);
              this.field_b = param0.a((byte) -19, false);
              this.field_b.a(25427, 49146);
              var7 = this.field_b.a((byte) -30, true);
              if (var7 == null) {
                break L1;
              } else {
                L2: {
                  var8 = param0.a(var7, false);
                  if (jaclib.memory.Stream.a()) {
                    var4_int = 0;
                    L3: while (true) {
                      if (-8192 >= (var4_int ^ -1)) {
                        break L2;
                      } else {
                        var5 = var4_int * 4;
                        var8.b(var5);
                        var8.b(var5 - -1);
                        var8.b(var5 + 2);
                        var8.b(var5 + 2);
                        var8.b(3 + var5);
                        var8.b(var5);
                        var4_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var4_int = 0;
                    L4: while (true) {
                      if (8191 <= var4_int) {
                        break L2;
                      } else {
                        var5 = 4 * var4_int;
                        var8.a(var5);
                        var8.a(var5 - -1);
                        var8.a(var5 + 2);
                        var8.a(2 + var5);
                        var8.a(var5 + 3);
                        var8.a(var5);
                        var4_int++;
                        continue L4;
                      }
                    }
                  }
                }
                var8.b();
                this.field_b.b(-93);
                break L1;
              }
            }
            L5: {
              var9 = this.field_d.a(true, (byte) 41);
              if (var9 == null) {
                break L5;
              } else {
                L6: {
                  var4 = param0.a(var9, false);
                  if (jaclib.memory.Stream.a()) {
                    var5 = 0;
                    L7: while (true) {
                      if (-8192 >= (var5 ^ -1)) {
                        break L6;
                      } else {
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var5++;
                        continue L7;
                      }
                    }
                  } else {
                    var5 = 0;
                    L8: while (true) {
                      if (var5 >= 8191) {
                        break L6;
                      } else {
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var5++;
                        continue L8;
                      }
                    }
                  }
                }
                var4.b();
                this.field_d.b(-20836);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2);

            stackIn_22_1 = new StringBuilder().append("je.<init>(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L9;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    static {
        field_c = new aba();
    }
}
