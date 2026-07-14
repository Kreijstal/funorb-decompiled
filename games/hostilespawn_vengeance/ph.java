/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ph extends ag {
    static String field_y;
    boolean field_D;
    private boolean field_C;
    boolean field_A;
    static String field_z;
    static gb field_F;
    static String field_B;
    private boolean field_E;

    final static jj a(String param0, int param1) {
        if (param1 <= -76) {
          if (ti.field_b != ki.field_f) {
            if (ee.field_b == ki.field_f) {
              if (!param0.equals((Object) (Object) uh.field_g)) {
                nl.field_a = null;
                ki.field_f = ti.field_b;
                uh.field_g = param0;
                return null;
              } else {
                ki.field_f = e.field_q;
                return nl.field_a;
              }
            } else {
              nl.field_a = null;
              ki.field_f = ti.field_b;
              uh.field_g = param0;
              return null;
            }
          } else {
            return null;
          }
        } else {
          field_z = null;
          if (ti.field_b != ki.field_f) {
            if (ee.field_b == ki.field_f) {
              if (!param0.equals((Object) (Object) uh.field_g)) {
                nl.field_a = null;
                ki.field_f = ti.field_b;
                uh.field_g = param0;
                return null;
              } else {
                ki.field_f = e.field_q;
                return nl.field_a;
              }
            } else {
              nl.field_a = null;
              ki.field_f = ti.field_b;
              uh.field_g = param0;
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, ag param4, int param5) {
        if (((ph) this).field_p != null) {
          if (!(((ph) this).field_p instanceof hl)) {
            ((ph) this).field_r = param5;
            return;
          } else {
            ((hl) (Object) ((ph) this).field_p).a(param3, (byte) 127, param0, (ph) this, param2, param1);
            ((ph) this).field_r = param5;
            return;
          }
        } else {
          ((ph) this).field_r = param5;
          return;
        }
    }

    boolean a(byte param0, ag param1) {
        if (((ph) this).field_D) {
          if (((ph) this).field_E) {
            param1.c((byte) -93);
            ((ph) this).field_C = true;
            if (param0 < 0) {
              if (null != ((ph) this).field_p) {
                if (!(((ph) this).field_p instanceof ah)) {
                  return true;
                } else {
                  ((ah) (Object) ((ph) this).field_p).a(((ph) this).field_C, (ag) this, -111);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              ((ph) this).field_C = false;
              if (null != ((ph) this).field_p) {
                if (!(((ph) this).field_p instanceof ah)) {
                  return true;
                } else {
                  ((ah) (Object) ((ph) this).field_p).a(((ph) this).field_C, (ag) this, -111);
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    void a(int param0, boolean param1, int param2, int param3) {
        if (param1) {
          if (((ph) this).field_p != null) {
            if (!(((ph) this).field_p instanceof qk)) {
              return;
            } else {
              ((qk) (Object) ((ph) this).field_p).a(param3, param2, param0, (ph) this, (byte) -118);
              return;
            }
          } else {
            return;
          }
        } else {
          ((ph) this).field_D = true;
          if (((ph) this).field_p == null) {
            return;
          } else {
            L0: {
              if (((ph) this).field_p instanceof qk) {
                ((qk) (Object) ((ph) this).field_p).a(param3, param2, param0, (ph) this, (byte) -118);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    void a(ag param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2 + param2, param3);
        if (-1 != (((ph) this).field_r ^ -1)) {
          if (((ph) this).field_r != ig.field_L) {
            if (((ph) this).b(rb.field_m, j.field_c, 255, param1, param3)) {
              if (ig.field_L == 0) {
                ((ph) this).a(rb.field_m - param1, true, j.field_c - param3, ((ph) this).field_r);
                ((ph) this).a(j.field_c, param1, param3, rb.field_m, param0, 0);
                return;
              } else {
                ((ph) this).a(j.field_c, param1, param3, rb.field_m, param0, 0);
                return;
              }
            } else {
              ((ph) this).a(j.field_c, param1, param3, rb.field_m, param0, 0);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    ph(String param0, mh param1) {
        this(param0, gf.field_e.field_e, param1);
    }

    final static void h(int param0) {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == 1048576) {
                  break L0;
                } else {
                  ph.h(-49);
                  break L0;
                }
              }
              L1: {
                var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
                if (var1_ref == null) {
                  break L1;
                } else {
                  try {
                    var2_ref = Runtime.getRuntime();
                    var4 = null;
                    var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                    ca.field_d = 1 + (int)(var3.longValue() / 1048576L);
                  } catch (java.lang.Throwable decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    return;
                  }
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var2 = decompiledCaughtException;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean g(int param0) {
        if (param0 != -9015) {
            return false;
        }
        return ((ph) this).field_C;
    }

    ph(String param0, nn param1, mh param2) {
        super(param0, param1, param2);
        ((ph) this).field_D = true;
        ((ph) this).field_C = false;
        ((ph) this).field_E = true;
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        Object var6 = null;
        L0: {
          if (!((ph) this).a(param3, param2, false, param1)) {
            break L0;
          } else {
            L1: {
              ((ph) this).a(param2, param1, param3, -112);
              if (((ph) this).field_A) {
                StringBuilder discarded$8 = param3.append(" active");
                break L1;
              } else {
                break L1;
              }
            }
            if (!((ph) this).field_D) {
              StringBuilder discarded$9 = param3.append(" disabled");
              break L0;
            } else {
              if (param0 >= 73) {
                return param3;
              } else {
                var6 = null;
                boolean discarded$10 = ((ph) this).a(79, 19, 55, -17, (byte) -121, (ag) null, 29);
                return param3;
              }
            }
          }
        }
        if (param0 < 73) {
          var6 = null;
          boolean discarded$11 = ((ph) this).a(79, 19, 55, -17, (byte) -121, (ag) null, 29);
          return param3;
        } else {
          return param3;
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        if (((ph) this).field_C) {
          ((ph) this).field_C = false;
          if (((ph) this).field_p != null) {
            if (!(((ph) this).field_p instanceof ah)) {
              var2 = -61 / ((param0 - -27) / 39);
              return;
            } else {
              ((ah) (Object) ((ph) this).field_p).a(((ph) this).field_C, (ag) this, -112);
              var2 = -61 / ((param0 - -27) / 39);
              return;
            }
          } else {
            var2 = -61 / ((param0 - -27) / 39);
            return;
          }
        } else {
          var2 = -61 / ((param0 - -27) / 39);
          return;
        }
    }

    public static void i(int param0) {
        field_F = null;
        field_z = null;
        if (param0 != 84) {
          field_B = null;
          field_B = null;
          field_y = null;
          return;
        } else {
          field_B = null;
          field_y = null;
          return;
        }
    }

    boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
        if (param4 == 110) {
          if (((ph) this).field_D) {
            if (((ph) this).b(param3, param0, param4 ^ 145, param2, param1)) {
              boolean discarded$2 = ((ph) this).a((byte) -125, param5);
              ((ph) this).field_r = param6;
              if (null != ((ph) this).field_p) {
                if (!(((ph) this).field_p instanceof hl)) {
                  return true;
                } else {
                  ((hl) (Object) ((ph) this).field_p).a(param3, param0, param6, param1, 115, (ph) this, param2);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    protected ph() {
        ((ph) this).field_D = true;
        ((ph) this).field_C = false;
        ((ph) this).field_E = true;
        ((ph) this).field_h = gf.field_e.field_d;
    }

    boolean a(int param0, ag param1, int param2, char param3) {
        if (((ph) this).g(-9015)) {
          if (param2 != 84) {
            if (param2 != 83) {
              if (param0 != 274) {
                return true;
              } else {
                return false;
              }
            } else {
              ((ph) this).a(-1, true, -1, 1);
              return true;
            }
          } else {
            ((ph) this).a(-1, true, -1, 1);
            return true;
          }
        } else {
          if (param0 != 274) {
            return true;
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_B = "Get back to the lift before the reactor explodes!";
        field_z = "Charges: ";
    }
}
