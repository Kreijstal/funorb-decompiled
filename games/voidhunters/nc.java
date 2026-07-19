/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    Object field_b;
    boolean field_a;

    public final String toString() {
        if (!(!this.field_a)) {
            return sna.a(this.field_b, (byte) 107) + "{" + this.field_b + "}";
        }
        if (!(this.field_b != null)) {
            return "null";
        }
        return this.field_b.toString();
    }

    final static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        osa.field_e = sga.field_p;
    }

    private final long c(int param0) {
        if (this.field_b instanceof Long) {
          return ((Long) (this.field_b)).longValue();
        } else {
          if (!(this.field_b instanceof Integer)) {
            if (this.field_b instanceof Short) {
              return ((Short) (this.field_b)).longValue();
            } else {
              if (!(this.field_b instanceof Byte)) {
                if (!(this.field_b instanceof Double)) {
                  if (param0 == 0) {
                    if (this.field_b instanceof Float) {
                      return ((Float) (this.field_b)).longValue();
                    } else {
                      throw new ClassCastException();
                    }
                  } else {
                    return 104L;
                  }
                } else {
                  return ((Double) (this.field_b)).longValue();
                }
              } else {
                return ((Byte) (this.field_b)).longValue();
              }
            }
          } else {
            return ((Integer) (this.field_b)).longValue();
          }
        }
    }

    nc(int param0) {
        this.field_b = new Integer(param0);
        this.field_a = true;
    }

    final boolean a(boolean param0) {
        if (param0) {
            this.field_b = (Object) null;
            return ((Boolean) (this.field_b)).booleanValue();
        }
        return ((Boolean) (this.field_b)).booleanValue();
    }

    final int a(int param0) {
        if (param0 >= 5) {
          if (this.field_b instanceof Integer) {
            return ((Integer) (this.field_b)).intValue();
          } else {
            return (int)this.c(0);
          }
        } else {
          nc.b(-117);
          if (this.field_b instanceof Integer) {
            return ((Integer) (this.field_b)).intValue();
          } else {
            return (int)this.c(0);
          }
        }
    }

    nc(long param0) {
        this.field_b = new Long(param0);
        this.field_a = true;
    }

    nc(boolean param0) {
        this.field_b = new Boolean(param0);
        this.field_a = true;
    }

    final static void a(byte param0) {
        int var1 = -53 % ((-32 - param0) / 53);
        hh.field_o = 0;
        if (!(null != ug.field_o)) {
            ug.field_o = new Object[]{};
        }
        ls.field_q = true;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 <= -79) {
          if (ob.field_j <= param3 - param4) {
            if (param3 - -param4 <= mt.field_o) {
              if (-param4 + param1 >= lua.field_c) {
                if (hab.field_i < param4 + param1) {
                  ffb.a(param4, (byte) -89, param1, param2, param3);
                  return;
                } else {
                  wlb.a(param2, param3, param1, param4, 2);
                  return;
                }
              } else {
                ffb.a(param4, (byte) -89, param1, param2, param3);
                return;
              }
            } else {
              ffb.a(param4, (byte) -89, param1, param2, param3);
              return;
            }
          } else {
            ffb.a(param4, (byte) -89, param1, param2, param3);
            return;
          }
        } else {
          nc.b(-58);
          if (ob.field_j <= param3 - param4) {
            if (param3 - -param4 <= mt.field_o) {
              if (-param4 + param1 >= lua.field_c) {
                if (hab.field_i < param4 + param1) {
                  ffb.a(param4, (byte) -89, param1, param2, param3);
                  return;
                } else {
                  wlb.a(param2, param3, param1, param4, 2);
                  return;
                }
              } else {
                ffb.a(param4, (byte) -89, param1, param2, param3);
                return;
              }
            } else {
              ffb.a(param4, (byte) -89, param1, param2, param3);
              return;
            }
          } else {
            ffb.a(param4, (byte) -89, param1, param2, param3);
            return;
          }
        }
    }

    nc(float param0) {
        this.field_b = new Float(param0);
        this.field_a = true;
    }

    nc(double param0) {
        this.field_b = new Double(param0);
        this.field_a = true;
    }

    final float d(int param0) {
        if (this.field_b instanceof Double) {
          return ((Double) (this.field_b)).floatValue();
        } else {
          if (this.field_b instanceof Float) {
            return ((Float) (this.field_b)).floatValue();
          } else {
            if (param0 != 0) {
              return (float)this.c(0);
            } else {
              return (float)this.c(0);
            }
          }
        }
    }

    nc(char param0) {
        this.field_b = new Character(param0);
        this.field_a = true;
    }

    nc(Object param0) {
        try {
            this.field_b = param0;
            this.field_a = false;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "nc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
