/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends vj {
    int field_u;
    float field_w;
    float field_r;
    qm field_t;
    static mf field_s;
    static String field_v;

    final float b(float param0, int param1) {
        int var4 = 0;
        L0: {
          var4 = HoldTheLine.field_D;
          if (param1 == -7517) {
            break L0;
          } else {
            float discarded$1 = ((gj) this).b(-0.6634728908538818f, -120);
            break L0;
          }
        }
        if (((gj) this).field_w < ((gj) this).field_r) {
          L1: while (true) {
            if (((gj) this).field_w > param0) {
              param0 = (float)((double)param0 + 6.283185307179586);
              continue L1;
            } else {
              L2: while (true) {
                if (((gj) this).field_r >= param0) {
                  return (-((gj) this).field_r + param0) / (((gj) this).field_w - ((gj) this).field_r);
                } else {
                  param0 = (float)((double)param0 - 6.283185307179586);
                  continue L2;
                }
              }
            }
          }
        } else {
          L3: while (true) {
            if (((gj) this).field_w >= param0) {
              L4: while (true) {
                if (((gj) this).field_r <= param0) {
                  return (param0 - ((gj) this).field_r) / (-((gj) this).field_r + ((gj) this).field_w);
                } else {
                  param0 = (float)((double)param0 + 6.283185307179586);
                  continue L4;
                }
              }
            } else {
              param0 = (float)((double)param0 - 6.283185307179586);
              continue L3;
            }
          }
        }
    }

    final vj c(boolean param0) {
        if (param0) {
          return null;
        } else {
          return (vj) (Object) new gj(((gj) this).field_t, ((gj) this).field_u, ((gj) this).field_w, ((gj) this).field_r, ((gj) this).field_k, ((gj) this).field_p, ((gj) this).field_q);
        }
    }

    final qm a(boolean param0, float param1) {
        float var3 = 0.0f;
        if (param0) {
          boolean discarded$1 = ((gj) this).a(0.47763046622276306f, 120);
          var3 = param1 * (((gj) this).field_w - ((gj) this).field_r) + ((gj) this).field_r;
          return new qm((int)((double)((gj) this).field_t.field_h + (double)((gj) this).field_u * Math.cos((double)var3)), (int)((double)((gj) this).field_t.field_f - (double)((gj) this).field_u * Math.sin((double)var3)));
        } else {
          var3 = param1 * (((gj) this).field_w - ((gj) this).field_r) + ((gj) this).field_r;
          return new qm((int)((double)((gj) this).field_t.field_h + (double)((gj) this).field_u * Math.cos((double)var3)), (int)((double)((gj) this).field_t.field_f - (double)((gj) this).field_u * Math.sin((double)var3)));
        }
    }

    final qm a(int param0) {
        if (param0 != 0) {
          qm discarded$1 = ((gj) this).a(false, -0.22441181540489197f);
          return new qm((int)((double)((gj) this).field_t.field_h + (double)((gj) this).field_u * Math.cos((double)((gj) this).field_w)), (int)((double)((gj) this).field_t.field_f - (double)((gj) this).field_u * Math.sin((double)((gj) this).field_w)));
        } else {
          return new qm((int)((double)((gj) this).field_t.field_h + (double)((gj) this).field_u * Math.cos((double)((gj) this).field_w)), (int)((double)((gj) this).field_t.field_f - (double)((gj) this).field_u * Math.sin((double)((gj) this).field_w)));
        }
    }

    final in g(int param0) {
        if (param0 == -1) {
          if (((gj) this).field_w > ((gj) this).field_r) {
            return new in((float)(-Math.sin((double)((gj) this).field_r)), (float)(-Math.cos((double)((gj) this).field_r)));
          } else {
            return new in((float)Math.sin((double)((gj) this).field_r), (float)Math.cos((double)((gj) this).field_r));
          }
        } else {
          float discarded$1 = ((gj) this).f(-99);
          if (((gj) this).field_w > ((gj) this).field_r) {
            return new in((float)(-Math.sin((double)((gj) this).field_r)), (float)(-Math.cos((double)((gj) this).field_r)));
          } else {
            return new in((float)Math.sin((double)((gj) this).field_r), (float)Math.cos((double)((gj) this).field_r));
          }
        }
    }

    public static void d() {
        field_v = null;
        field_s = null;
    }

    final in a(byte param0, float param1) {
        float var3 = 0.0f;
        if (param0 <= 117) {
          field_v = null;
          var3 = ((gj) this).field_r + param1 * (-((gj) this).field_r + ((gj) this).field_w);
          return new in(var3);
        } else {
          var3 = ((gj) this).field_r + param1 * (-((gj) this).field_r + ((gj) this).field_w);
          return new in(var3);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        if (param1 < -5) {
          var3 = pf.a((byte) 35, param2);
          if (var3 == 0) {
            if (param2 == ao.field_b) {
              if (hk.field_d >= param0) {
                return 0;
              } else {
                return 1;
              }
            } else {
              return 0;
            }
          } else {
            return var3;
          }
        } else {
          field_s = null;
          var3 = pf.a((byte) 35, param2);
          if (var3 == 0) {
            if (param2 == ao.field_b) {
              if (hk.field_d >= param0) {
                return 0;
              } else {
                return 1;
              }
            } else {
              return 0;
            }
          } else {
            return var3;
          }
        }
    }

    gj(qm param0, int param1, float param2, float param3, int param4, boolean param5, boolean param6) {
        try {
            ((gj) this).field_q = param6 ? true : false;
            ((gj) this).field_u = param1;
            ((gj) this).field_t = param0;
            ((gj) this).field_r = param2;
            ((gj) this).field_p = param5 ? true : false;
            ((gj) this).field_w = param3;
            ((gj) this).field_k = param4;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "gj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final boolean a(float param0, int param1) {
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var4 = HoldTheLine.field_D;
        if (param1 == 13012) {
          if (((gj) this).field_r > ((gj) this).field_w) {
            L0: while (true) {
              if (param0 > ((gj) this).field_w) {
                param0 = (float)((double)param0 - 6.283185307179586);
                continue L0;
              } else {
                L1: while (true) {
                  if (((gj) this).field_w > param0) {
                    param0 = (float)((double)param0 + 6.283185307179586);
                    continue L1;
                  } else {
                    L2: {
                      if (((gj) this).field_r <= param0) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L2;
                      } else {
                        stackOut_17_0 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        break L2;
                      }
                    }
                    return stackIn_19_0 != 0;
                  }
                }
              }
            }
          } else {
            L3: while (true) {
              if (((gj) this).field_r < param0) {
                param0 = (float)((double)param0 - 6.283185307179586);
                continue L3;
              } else {
                L4: while (true) {
                  if (((gj) this).field_r <= param0) {
                    L5: {
                      if (param0 >= ((gj) this).field_w) {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        break L5;
                      } else {
                        stackOut_7_0 = 1;
                        stackIn_9_0 = stackOut_7_0;
                        break L5;
                      }
                    }
                    return stackIn_9_0 != 0;
                  } else {
                    param0 = (float)((double)param0 + 6.283185307179586);
                    continue L4;
                  }
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    final in a(boolean param0) {
        if (param0) {
            return null;
        }
        if (!(((gj) this).field_r >= ((gj) this).field_w)) {
            return new in((float)(-Math.sin((double)((gj) this).field_w)), (float)(-Math.cos((double)((gj) this).field_w)));
        }
        return new in((float)Math.sin((double)((gj) this).field_w), (float)Math.cos((double)((gj) this).field_w));
    }

    final float f(int param0) {
        if (param0 != 50) {
          int discarded$2 = 0;
          gj.d();
          return Math.abs(((gj) this).field_w - ((gj) this).field_r) * (float)((gj) this).field_u;
        } else {
          return Math.abs(((gj) this).field_w - ((gj) this).field_r) * (float)((gj) this).field_u;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new mf("usename");
        field_v = "Invulnerability";
    }
}
