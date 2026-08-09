/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    int field_b;
    static ad field_e;
    int field_f;
    static volatile boolean field_a;
    int field_d;
    static String field_c;

    final static boolean a(boolean param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (!param0) {
          if (!ed.c(true)) {
            if ((pb.field_G ^ -1) >= -1) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          ve.a(false);
          if (ed.c(true)) {
            return true;
          } else {
            L0: {
              if ((pb.field_G ^ -1) < -1) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        this.field_d = param1;
        this.field_f = param3;
        this.field_b = param0;
        if (param2 >= 72) {
            return;
        }
        field_e = (ad) null;
    }

    final void b(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = DungeonAssault.field_K;
        if (param0) {
          L0: while (true) {
            if (((Math.abs(this.field_d) | Math.abs(this.field_f) | Math.abs(this.field_b)) & -65536) == 0) {
              var2 = this.c(false) >> 931920705;
              var3 = 15;
              L1: while (true) {
                if (65536 > var2) {
                  this.field_d = (this.field_d << var3) / var2;
                  this.field_f = (this.field_f << var3) / var2;
                  this.field_b = (this.field_b << var3) / var2;
                  var4 = this.c(false);
                  if (var4 >= 64512) {
                    if (66560 < var4) {
                      throw new RuntimeException();
                    } else {
                      return;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  var3--;
                  var2 = var2 >> 1;
                  continue L1;
                }
              }
            } else {
              this.field_f = this.field_f >> 1;
              this.field_d = this.field_d >> 1;
              this.field_b = this.field_b >> 1;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 >= -92) {
            ve.a(42);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static String a(int param0, long param1, int param2, int param3, boolean param4) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var6;
        int var7;
        int var8;
        StringBuilder var9;
        int var10;
        int var11;
        int var12;
        L0: {
          var12 = DungeonAssault.field_K;
          var6 = 44;
          var7 = 46;
          if (param3 == 0) {
            var7 = 44;
            var6 = 46;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (-3 != (param3 ^ -1)) {
            break L1;
          } else {
            var7 = 160;
            break L1;
          }
        }
        L2: {
          var8 = 0;
          if (param1 < 0L) {
            param1 = -param1;
            var8 = 1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var9 = new StringBuilder(26);
          if (param0 > 0) {
            var10 = 0;
            L4: while (true) {
              if (param0 <= var10) {
                discarded$0 = var9.append((char) var6);
                break L3;
              } else {
                var11 = (int)param1;
                param1 = param1 / 10L;
                discarded$1 = var9.append((char)(-(10 * (int)param1) + (var11 + 48)));
                var10++;
                continue L4;
              }
            }
          } else {
            break L3;
          }
        }
        var10 = 0;
        L5: while (true) {
          var11 = (int)param1;
          param1 = param1 / 10L;
          discarded$2 = var9.append((char)(48 - (-var11 - -(10 * (int)param1))));
          if ((param1 ^ -1L) != -1L) {
            if (param4) {
              var10++;
              if (0 != var10 % 3) {
                continue L5;
              } else {
                discarded$3 = var9.append((char) var7);
                continue L5;
              }
            } else {
              continue L5;
            }
          } else {
            if (param2 != -17311) {
              L6: {
                field_a = true;
                if (var8 != 0) {
                  discarded$4 = var9.append('-');
                  break L6;
                } else {
                  break L6;
                }
              }
              return var9.reverse().toString();
            } else {
              L7: {
                if (var8 != 0) {
                  discarded$5 = var9.append('-');
                  break L7;
                } else {
                  break L7;
                }
              }
              return var9.reverse().toString();
            }
          }
        }
    }

    private final int c(boolean param0) {
        int var2;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        if (!param0) {
          var2 = (this.field_b >> -2089464094) * (this.field_b >> -118145502) + (this.field_f >> -1225268702) * (this.field_f >> -799567614) + (this.field_d >> -1084721886) * (this.field_d >> -2147109758);
          if (var2 < 0) {
            throw new RuntimeException();
          } else {
            L0: {
              if (param0) {
                stackIn_12_0 = 0;
                break L0;
              } else {
                stackIn_12_0 = 1;
                break L0;
              }
            }
            return ug.a(stackIn_12_0 != 0, var2) << -1156140638;
          }
        } else {
          this.a(56, -92, 125, -12);
          var2 = (this.field_b >> -2089464094) * (this.field_b >> -118145502) + (this.field_f >> -1225268702) * (this.field_f >> -799567614) + (this.field_d >> -1084721886) * (this.field_d >> -2147109758);
          if (var2 < 0) {
            throw new RuntimeException();
          } else {
            L1: {
              if (param0) {
                stackIn_5_0 = 0;
                break L1;
              } else {
                stackIn_5_0 = 1;
                break L1;
              }
            }
            return ug.a(stackIn_5_0 != 0, var2) << -1156140638;
          }
        }
    }

    ve(int param0, int param1, int param2) {
        this.a(param2, param0, 124, param1);
    }

    static {
        field_e = new ad(11, 0, 1, 2);
        field_a = false;
        field_c = "Please log in as a subscribing member to access this feature.";
    }
}
