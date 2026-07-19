/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class daa {
    static String field_f;
    static lqa field_d;
    private ff field_a;
    static String field_c;
    w field_b;
    private boolean field_e;

    final void a(byte param0, int param1, int param2) {
        fla discarded$1 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param0 < -13) {
          var4 = this.a(0, param2);
          if (0 != (var4 ^ -1)) {
            return;
          } else {
            this.field_a.field_y[param2].a(param1, (byte) 37);
            if (null == this.field_b) {
              if (this.field_a.a(-112)) {
                this.field_e = true;
                var5 = 0;
                L0: while (true) {
                  stackOut_28_0 = var5;
                  stackOut_28_1 = this.field_a.field_H.length;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  L1: while (true) {
                    if (stackIn_29_0 < stackIn_29_1) {
                      if (var7 == 0) {
                        var6 = 0;
                        L2: while (true) {
                          if (var6 >= this.field_a.field_H.length) {
                            var5++;
                            continue L0;
                          } else {
                            stackOut_35_0 = var5 ^ -1;
                            stackOut_35_1 = var6 ^ -1;
                            stackIn_29_0 = stackOut_35_0;
                            stackIn_29_1 = stackOut_35_1;
                            stackIn_36_0 = stackOut_35_0;
                            stackIn_36_1 = stackOut_35_1;
                            if (var7 != 0) {
                              continue L1;
                            } else {
                              L3: {
                                L4: {
                                  if (stackIn_36_0 == stackIn_36_1) {
                                    break L4;
                                  } else {
                                    this.field_a.field_D.a(var5, this.field_a.field_y[var6].b(71), true);
                                    if (var7 == 0) {
                                      break L3;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                this.field_a.field_D.a(var5, (byte) -52, this.field_a.field_y[var5].b(80));
                                break L3;
                              }
                              var6++;
                              continue L2;
                            }
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              discarded$1 = this.field_b.a(new fm(64, 0, 0, 0), -58);
              if (this.field_a.a(-112)) {
                this.field_e = true;
                var5 = 0;
                L5: while (true) {
                  stackOut_9_0 = var5;
                  stackOut_9_1 = this.field_a.field_H.length;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  L6: while (true) {
                    if (stackIn_10_0 < stackIn_10_1) {
                      if (var7 == 0) {
                        var6 = 0;
                        L7: while (true) {
                          if (var6 >= this.field_a.field_H.length) {
                            var5++;
                            continue L5;
                          } else {
                            stackOut_17_0 = var5 ^ -1;
                            stackOut_17_1 = var6 ^ -1;
                            stackIn_10_0 = stackOut_17_0;
                            stackIn_10_1 = stackOut_17_1;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            if (var7 != 0) {
                              continue L6;
                            } else {
                              L8: {
                                L9: {
                                  if (stackIn_18_0 == stackIn_18_1) {
                                    break L9;
                                  } else {
                                    this.field_a.field_D.a(var5, this.field_a.field_y[var6].b(71), true);
                                    if (var7 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                this.field_a.field_D.a(var5, (byte) -52, this.field_a.field_y[var5].b(80));
                                break L8;
                              }
                              var6++;
                              continue L7;
                            }
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final int a(int param0, int param1) {
        if (param0 != 0) {
          field_f = (String) null;
          return this.field_a.field_y[param1].b(100);
        } else {
          return this.field_a.field_y[param1].b(100);
        }
    }

    final void a(int param0) {
        if (this.field_e) {
          return;
        } else {
          if (param0 != 32221) {
            return;
          } else {
            L0: {
              if (this.field_b != null) {
                this.field_b.a(84, false);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    daa(ff param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "daa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_c = null;
        field_d = null;
        if (param0 != -12224) {
            field_f = (String) null;
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        return this.field_e;
    }

    static {
        field_c = "Email: ";
        field_f = "Use wits and quick timing to navigate each chamber of the temple. Earn points by grabbing treasure and escaping quickly.";
    }
}
