/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    Object field_b;
    boolean field_a;

    public final String toString() {
        if (!(!((nc) this).field_a)) {
            return sna.a(((nc) this).field_b, (byte) 107) + "{" + ((nc) this).field_b + "}";
        }
        if (!(((nc) this).field_b != null)) {
            return "null";
        }
        return ((nc) this).field_b.toString();
    }

    final static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        osa.field_e = sga.field_p;
    }

    private final long c(int param0) {
        if (((nc) this).field_b instanceof Long) {
          return ((Long) ((nc) this).field_b).longValue();
        } else {
          if (!(((nc) this).field_b instanceof Integer)) {
            if (((nc) this).field_b instanceof Short) {
              return ((Short) ((nc) this).field_b).longValue();
            } else {
              if (!(((nc) this).field_b instanceof Byte)) {
                if (!(((nc) this).field_b instanceof Double)) {
                  if (param0 == 0) {
                    if (((nc) this).field_b instanceof Float) {
                      return ((Float) ((nc) this).field_b).longValue();
                    } else {
                      throw new ClassCastException();
                    }
                  } else {
                    return 104L;
                  }
                } else {
                  return ((Double) ((nc) this).field_b).longValue();
                }
              } else {
                return ((Byte) ((nc) this).field_b).longValue();
              }
            }
          } else {
            return ((Integer) ((nc) this).field_b).longValue();
          }
        }
    }

    nc(int param0) {
        ((nc) this).field_b = (Object) (Object) new Integer(param0);
        ((nc) this).field_a = true;
    }

    final boolean a(boolean param0) {
        if (param0) {
            ((nc) this).field_b = null;
            return ((Boolean) ((nc) this).field_b).booleanValue();
        }
        return ((Boolean) ((nc) this).field_b).booleanValue();
    }

    final int a(int param0) {
        if (param0 >= 5) {
          if (((nc) this).field_b instanceof Integer) {
            return ((Integer) ((nc) this).field_b).intValue();
          } else {
            return (int)this.c(0);
          }
        } else {
          nc.b(-117);
          if (((nc) this).field_b instanceof Integer) {
            return ((Integer) ((nc) this).field_b).intValue();
          } else {
            return (int)this.c(0);
          }
        }
    }

    nc(long param0) {
        ((nc) this).field_b = (Object) (Object) new Long(param0);
        ((nc) this).field_a = true;
    }

    nc(boolean param0) {
        ((nc) this).field_b = (Object) (Object) new Boolean(param0);
        ((nc) this).field_a = true;
    }

    final static void a() {
        int var1 = 0;
        hh.field_o = 0;
        if (!(null != ug.field_o)) {
            ug.field_o = new Object[]{};
        }
        ls.field_q = true;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
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

    nc(float param0) {
        ((nc) this).field_b = (Object) (Object) new Float(param0);
        ((nc) this).field_a = true;
    }

    nc(double param0) {
        ((nc) this).field_b = (Object) (Object) new Double(param0);
        ((nc) this).field_a = true;
    }

    final float d(int param0) {
        if (((nc) this).field_b instanceof Double) {
          return ((Double) ((nc) this).field_b).floatValue();
        } else {
          if (((nc) this).field_b instanceof Float) {
            return ((Float) ((nc) this).field_b).floatValue();
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
        ((nc) this).field_b = (Object) (Object) new Character(param0);
        ((nc) this).field_a = true;
    }

    nc(Object param0) {
        try {
            ((nc) this).field_b = param0;
            ((nc) this).field_a = false;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "nc.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
