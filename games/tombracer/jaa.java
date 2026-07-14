/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jaa implements noa {
    private int field_g;
    private int field_c;
    private int field_d;
    private int field_h;
    static apa field_b;
    private boolean field_e;
    private int field_f;
    static String field_a;

    final int a(int param0) {
        int var2 = 0;
        Object var3 = null;
        if (param0 != -43946608) {
          L0: {
            var3 = null;
            ((jaa) this).a(8, (kh) null);
            var2 = ((jaa) this).field_d | (((jaa) this).field_g << -43946608 | ((jaa) this).field_f << -1416970584);
            if (((jaa) this).field_e) {
              var2 = ((jaa) this).field_h << -458627816 | var2;
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            var2 = ((jaa) this).field_d | (((jaa) this).field_g << -43946608 | ((jaa) this).field_f << -1416970584);
            if (((jaa) this).field_e) {
              var2 = ((jaa) this).field_h << -458627816 | var2;
              break L1;
            } else {
              break L1;
            }
          }
          return var2;
        }
    }

    private final void a(int param0, int param1, kh param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = 1 << 8 + -((jaa) this).field_c;
        var5 = -1 + var4;
        ((jaa) this).field_g = var4 * param2.b((byte) 44, ((jaa) this).field_c);
        if (0 >= ((jaa) this).field_g) {
          ((jaa) this).field_f = var4 * param2.b((byte) 44, ((jaa) this).field_c);
          if ((((jaa) this).field_f ^ -1) >= -1) {
            L0: {
              ((jaa) this).field_d = param2.b((byte) 44, ((jaa) this).field_c) * var4;
              if (0 < ((jaa) this).field_d) {
                ((jaa) this).field_d = ((jaa) this).field_d + var5;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (((jaa) this).field_e) {
                ((jaa) this).field_h = param2.b((byte) 44, ((jaa) this).field_c) * var4;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 != 8) {
              L2: {
                field_b = null;
                if (0 < ((jaa) this).field_h) {
                  ((jaa) this).field_h = ((jaa) this).field_h + var5;
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              L3: {
                if (0 < ((jaa) this).field_h) {
                  ((jaa) this).field_h = ((jaa) this).field_h + var5;
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          } else {
            L4: {
              ((jaa) this).field_f = ((jaa) this).field_f + var5;
              ((jaa) this).field_d = param2.b((byte) 44, ((jaa) this).field_c) * var4;
              if (0 < ((jaa) this).field_d) {
                ((jaa) this).field_d = ((jaa) this).field_d + var5;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (((jaa) this).field_e) {
                ((jaa) this).field_h = param2.b((byte) 44, ((jaa) this).field_c) * var4;
                break L5;
              } else {
                break L5;
              }
            }
            if (param0 != 8) {
              L6: {
                field_b = null;
                if (0 < ((jaa) this).field_h) {
                  ((jaa) this).field_h = ((jaa) this).field_h + var5;
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            } else {
              L7: {
                if (0 < ((jaa) this).field_h) {
                  ((jaa) this).field_h = ((jaa) this).field_h + var5;
                  break L7;
                } else {
                  break L7;
                }
              }
              return;
            }
          }
        } else {
          ((jaa) this).field_g = ((jaa) this).field_g + var5;
          ((jaa) this).field_f = var4 * param2.b((byte) 44, ((jaa) this).field_c);
          if ((((jaa) this).field_f ^ -1) < -1) {
            L8: {
              ((jaa) this).field_f = ((jaa) this).field_f + var5;
              ((jaa) this).field_d = param2.b((byte) 44, ((jaa) this).field_c) * var4;
              if (0 < ((jaa) this).field_d) {
                ((jaa) this).field_d = ((jaa) this).field_d + var5;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (((jaa) this).field_e) {
                ((jaa) this).field_h = param2.b((byte) 44, ((jaa) this).field_c) * var4;
                break L9;
              } else {
                break L9;
              }
            }
            if (param0 == 8) {
              L10: {
                if (0 < ((jaa) this).field_h) {
                  ((jaa) this).field_h = ((jaa) this).field_h + var5;
                  break L10;
                } else {
                  break L10;
                }
              }
              return;
            } else {
              L11: {
                field_b = null;
                if (0 < ((jaa) this).field_h) {
                  ((jaa) this).field_h = ((jaa) this).field_h + var5;
                  break L11;
                } else {
                  break L11;
                }
              }
              return;
            }
          } else {
            L12: {
              ((jaa) this).field_d = param2.b((byte) 44, ((jaa) this).field_c) * var4;
              if (0 < ((jaa) this).field_d) {
                ((jaa) this).field_d = ((jaa) this).field_d + var5;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (((jaa) this).field_e) {
                ((jaa) this).field_h = param2.b((byte) 44, ((jaa) this).field_c) * var4;
                break L13;
              } else {
                break L13;
              }
            }
            if (param0 != 8) {
              L14: {
                field_b = null;
                if (0 < ((jaa) this).field_h) {
                  ((jaa) this).field_h = ((jaa) this).field_h + var5;
                  break L14;
                } else {
                  break L14;
                }
              }
              return;
            } else {
              L15: {
                if (0 < ((jaa) this).field_h) {
                  ((jaa) this).field_h = ((jaa) this).field_h + var5;
                  break L15;
                } else {
                  break L15;
                }
              }
              return;
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final void a(boolean param0, int param1) {
        ((jaa) this).field_g = param1 >> -1531094160 ^ 255;
        ((jaa) this).field_d = 255 ^ param1;
        ((jaa) this).field_h = param1 >> -84083560 ^ 255;
        if (param0) {
          return;
        } else {
          ((jaa) this).field_f = (65398 ^ param1) >> -672233560;
          return;
        }
    }

    jaa(boolean param0, int param1) {
        ((jaa) this).field_c = param1;
        ((jaa) this).field_e = param0 ? true : false;
    }

    final void a(int param0, kh param1) {
        int var3 = 1 << -((jaa) this).field_c + 8;
        int var4 = var3 + -1;
        param1.a((byte) -128, iia.d(param0, -var4 + ((jaa) this).field_g, param0 ^ 2) / var3, ((jaa) this).field_c);
        param1.a((byte) 61, iia.d(0, -var4 + ((jaa) this).field_f, 2) / var3, ((jaa) this).field_c);
        param1.a((byte) -128, iia.d(0, -var4 + ((jaa) this).field_d, 2) / var3, ((jaa) this).field_c);
        if (!(!((jaa) this).field_e)) {
            param1.a((byte) -127, iia.d(0, ((jaa) this).field_h - var4, 2) / var3, ((jaa) this).field_c);
        }
    }

    final static String a(byte param0, byte[] param1) {
        if (param0 <= 24) {
            return null;
        }
        return nia.a(param1, 0, param1.length, 255);
    }

    jaa(boolean param0, int param1, int param2, kh param3) {
        ((jaa) this).field_e = param0 ? true : false;
        ((jaa) this).field_c = param1;
        this.a(8, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Send private message";
    }
}
