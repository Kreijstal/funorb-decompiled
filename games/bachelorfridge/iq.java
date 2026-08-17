/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iq extends lw {
    static kia field_m;
    static kv field_l;

    iq() {
        super(true, new String[]{su.field_e, n.field_d, ur.field_f, ld.field_m, uu.field_zb, wf.field_v}, kr.field_xb);
        try {
            this.field_c = new int[][]{new int[]{160, 390}, new int[]{160, 390}, new int[]{160, 350}, new int[]{160, 390}, new int[]{160, 380}, new int[]{160, 400}};
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "iq.<init>()");
        }
    }

    public static void d(byte param0) {
        field_m = null;
        if (param0 > -92) {
            return;
        }
        try {
            field_l = null;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "iq.A(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (2 != this.field_e) {
                break L1;
              } else {
                vg.a(sia.field_j, 8640, 22997, 48000, 4096, 1120, 4096, sia.field_j.field_o << 1725058147, sia.field_j.field_n << 123028291);
                break L1;
              }
            }
            if (param0 > 103) {
              break L0;
            } else {
              iq.d((byte) 72);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "iq.D(" + param0 + ')');
        }
    }

    final void a(int param0, byte param1) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 == 73) {
                break L1;
              } else {
                iq.d((byte) -86);
                break L1;
              }
            }
            L2: {
              if ((param0 ^ -1) != -39) {
                break L2;
              } else {
                if ((this.field_e ^ -1) == -6) {
                  break L2;
                } else {
                  if (0 == this.field_e) {
                    this.b(param1 + -72);
                    this.c(param1 + -2);
                    return;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L3: {
              if ((param0 ^ -1) != -22) {
                break L3;
              } else {
                if ((this.field_e ^ -1) == -6) {
                  break L3;
                } else {
                  if (this.field_e == 1) {
                    this.b(1);
                    this.c(param1 ^ 42);
                    cm.field_v = true;
                    return;
                  } else {
                    break L3;
                  }
                }
              }
            }
            L4: {
              if (param0 != 22) {
                break L4;
              } else {
                if (5 == this.field_e) {
                  this.b(1);
                  this.b((byte) 112);
                  if (this.c((byte) 95)) {
                    fla.b(23621);
                    return;
                  } else {
                    return;
                  }
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (-23 != (param0 ^ -1)) {
                break L5;
              } else {
                if (5 == this.field_e) {
                  break L5;
                } else {
                  if (-3 == (this.field_e ^ -1)) {
                    this.b(1);
                    this.b((byte) 112);
                    cm.field_v = false;
                    return;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (param0 != 23) {
                break L6;
              } else {
                if (this.field_e == 5) {
                  break L6;
                } else {
                  this.c(param1 + 49);
                  return;
                }
              }
            }
            L7: {
              if (20 != param0) {
                break L7;
              } else {
                if ((this.field_e ^ -1) == -3) {
                  break L7;
                } else {
                  if (5 == this.field_e) {
                    break L7;
                  } else {
                    if (this.field_e == 3) {
                      this.b(1);
                      return;
                    } else {
                      break L7;
                    }
                  }
                }
              }
            }
            L8: {
              if (param0 != 24) {
                break L8;
              } else {
                if (this.field_e == 2) {
                  break L8;
                } else {
                  if (5 == this.field_e) {
                    break L8;
                  } else {
                    this.b(1);
                    this.c(114);
                    return;
                  }
                }
              }
            }
            L9: {
              if ((param0 ^ -1) != -26) {
                break L9;
              } else {
                if (-5 != (this.field_e ^ -1)) {
                  break L9;
                } else {
                  if (5 != this.field_e) {
                    this.b(1);
                    this.c(param1 + 27);
                    cm.field_v = true;
                    return;
                  } else {
                    break L9;
                  }
                }
              }
            }
            L10: {
              if (-35 != (param0 ^ -1)) {
                break L10;
              } else {
                if (-6 != (this.field_e ^ -1)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  this.b((byte) 112);
                  if (!this.c((byte) 95)) {
                    break L10;
                  } else {
                    fla.b(23621);
                    return;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "iq.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
