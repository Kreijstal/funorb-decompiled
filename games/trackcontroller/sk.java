/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    float field_i;
    private int field_f;
    private int field_c;
    static String field_g;
    static boolean field_b;
    static String field_h;
    private sg[] field_d;
    String field_a;
    private int field_e;
    static kk field_j;

    final boolean a(boolean param0) {
        int var3 = 0;
        sg var5 = null;
        sg var6 = null;
        var3 = TrackController.field_F ? 1 : 0;
        if (!param0) {
          sk.a((byte) 43);
          L0: while (true) {
            if (((sk) this).field_f < ((sk) this).field_c) {
              var6 = ((sk) this).field_d[((sk) this).field_f];
              if (!var6.field_c.c(113)) {
                this.a(-1, 0, var6);
                return false;
              } else {
                L1: {
                  if (var6.field_h < 0) {
                    break L1;
                  } else {
                    if (!var6.field_c.a((byte) -40, var6.field_h)) {
                      this.a(-1, var6.field_c.a(var6.field_h, -24214), var6);
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (null == var6.field_f) {
                    break L2;
                  } else {
                    if (!var6.field_c.b(var6.field_f, (byte) -3)) {
                      this.a(-1, var6.field_c.a(var6.field_f, 0), var6);
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 >= (var6.field_h ^ -1)) {
                    break L3;
                  } else {
                    if (null != var6.field_f) {
                      break L3;
                    } else {
                      if (null == var6.field_b) {
                        break L3;
                      } else {
                        if (!var6.field_c.a((byte) 48)) {
                          this.a(-1, var6.field_c.a(true), var6);
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                ((sk) this).field_f = ((sk) this).field_f + 1;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (((sk) this).field_f < ((sk) this).field_c) {
              var5 = ((sk) this).field_d[((sk) this).field_f];
              if (!var5.field_c.c(113)) {
                this.a(-1, 0, var5);
                return false;
              } else {
                L5: {
                  if (var5.field_h < 0) {
                    break L5;
                  } else {
                    if (!var5.field_c.a((byte) -40, var5.field_h)) {
                      this.a(-1, var5.field_c.a(var5.field_h, -24214), var5);
                      return false;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (null == var5.field_f) {
                    break L6;
                  } else {
                    if (!var5.field_c.b(var5.field_f, (byte) -3)) {
                      this.a(-1, var5.field_c.a(var5.field_f, 0), var5);
                      return false;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (-1 >= (var5.field_h ^ -1)) {
                    break L7;
                  } else {
                    if (null != var5.field_f) {
                      break L7;
                    } else {
                      if (null == var5.field_b) {
                        break L7;
                      } else {
                        if (!var5.field_c.a((byte) 48)) {
                          this.a(-1, var5.field_c.a(true), var5);
                          return false;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                ((sk) this).field_f = ((sk) this).field_f + 1;
                continue L4;
              }
            } else {
              return true;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_j = null;
        field_h = null;
        if (param0 <= 99) {
            field_g = null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    private final void a(int param0, int param1, sg param2) {
        float var4 = 0.0f;
        var4 = (float)(1 + ((sk) this).field_f) + (float)param1 / 100.0f;
        if (param0 != (param1 ^ -1)) {
          ((sk) this).field_a = param2.field_b + " - " + param1 + "%";
          ((sk) this).field_i = var4 * (float)((sk) this).field_e / (float)(1 + ((sk) this).field_c);
          return;
        } else {
          ((sk) this).field_a = param2.field_g;
          ((sk) this).field_i = var4 * (float)((sk) this).field_e / (float)(1 + ((sk) this).field_c);
          return;
        }
    }

    final static boolean a(int param0, kk param1, int param2, int param3) {
        byte[] var4 = null;
        Object var5 = null;
        byte[] var6 = null;
        var6 = param1.a(param3, param0, (byte) -117);
        var4 = var6;
        if (param2 == 1) {
          if (var6 == null) {
            return false;
          } else {
            ve.a((byte) -28, var6);
            return true;
          }
        } else {
          var5 = null;
          boolean discarded$6 = sk.a(-44, (kk) null, 17, 118);
          if (var6 == null) {
            return false;
          } else {
            ve.a((byte) -28, var6);
            return true;
          }
        }
    }

    private sk() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_g = "Finish the exhibit with the blocks at the top.";
    }
}
