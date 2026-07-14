/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hf extends wj {
    boolean field_z;
    private boolean field_C;
    private boolean field_y;
    boolean field_B;

    void a(int param0, int param1, wj param2, int param3) {
        this.a(param0, param1, param2, param3);
        if (-1 != (((hf) this).field_u ^ -1)) {
          if (((hf) this).field_u != fia.field_t) {
            if (!((hf) this).a(gd.field_m, mk.field_p, 0, param0, param1)) {
              ((hf) this).a(param0, mk.field_p, (byte) -101, param2, gd.field_m, param1);
              return;
            } else {
              if (fia.field_t == 0) {
                ((hf) this).a(-param0 + mk.field_p, ((hf) this).field_u, false, -param1 + gd.field_m);
                ((hf) this).a(param0, mk.field_p, (byte) -101, param2, gd.field_m, param1);
                return;
              } else {
                ((hf) this).a(param0, mk.field_p, (byte) -101, param2, gd.field_m, param1);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte param2, wj param3, int param4, int param5) {
        L0: {
          if (null == ((hf) this).field_k) {
            break L0;
          } else {
            if (((hf) this).field_k instanceof uia) {
              ((uia) (Object) ((hf) this).field_k).a(param5, param0, param2 + -10256, (hf) this, param4, param1);
              break L0;
            } else {
              if (param2 == -101) {
                ((hf) this).field_u = 0;
                return;
              } else {
                ((hf) this).field_C = true;
                ((hf) this).field_u = 0;
                return;
              }
            }
          }
        }
        if (param2 != -101) {
          ((hf) this).field_C = true;
          ((hf) this).field_u = 0;
          return;
        } else {
          ((hf) this).field_u = 0;
          return;
        }
    }

    final void f(int param0) {
        if (param0 == 31) {
          if (((hf) this).field_C) {
            ((hf) this).field_C = false;
            if (null != ((hf) this).field_k) {
              if (!(((hf) this).field_k instanceof caa)) {
                return;
              } else {
                ((caa) (Object) ((hf) this).field_k).a(((hf) this).field_C, param0 + 6171, (wj) this);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((hf) this).field_y = true;
          if (((hf) this).field_C) {
            ((hf) this).field_C = false;
            if (null == ((hf) this).field_k) {
              return;
            } else {
              L0: {
                if (((hf) this).field_k instanceof caa) {
                  ((caa) (Object) ((hf) this).field_k).a(((hf) this).field_C, param0 + 6171, (wj) this);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        if (param1 == -7375) {
          if (((hf) this).field_z) {
            if (((hf) this).a(param6, param0, param1 ^ -7375, param2, param4)) {
              boolean discarded$2 = ((hf) this).a(param5, param1 ^ 7328);
              ((hf) this).field_u = param3;
              if (((hf) this).field_k != null) {
                if (!(((hf) this).field_k instanceof uia)) {
                  return true;
                } else {
                  ((uia) (Object) ((hf) this).field_k).a(param3, param6, (hf) this, param4, param2, param0, true);
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
          ((hf) this).field_z = true;
          if (((hf) this).field_z) {
            if (((hf) this).a(param6, param0, param1 ^ -7375, param2, param4)) {
              boolean discarded$3 = ((hf) this).a(param5, param1 ^ 7328);
              ((hf) this).field_u = param3;
              if (((hf) this).field_k != null) {
                if (!(((hf) this).field_k instanceof uia)) {
                  return true;
                } else {
                  ((uia) (Object) ((hf) this).field_k).a(param3, param6, (hf) this, param4, param2, param0, true);
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
        }
    }

    hf(String param0, qda param1, pl param2) {
        super(param0, param1, param2);
        ((hf) this).field_C = false;
        ((hf) this).field_z = true;
        ((hf) this).field_y = true;
    }

    void a(int param0, int param1, boolean param2, int param3) {
        if (!param2) {
          if (((hf) this).field_k != null) {
            if (!(((hf) this).field_k instanceof lja)) {
              return;
            } else {
              ((lja) (Object) ((hf) this).field_k).a(param1, (hf) this, param0, (byte) 91, param3);
              return;
            }
          } else {
            return;
          }
        } else {
          ((hf) this).field_C = false;
          if (((hf) this).field_k == null) {
            return;
          } else {
            L0: {
              if (((hf) this).field_k instanceof lja) {
                ((lja) (Object) ((hf) this).field_k).a(param1, (hf) this, param0, (byte) 91, param3);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    boolean a(wj param0, int param1) {
        if (param1 <= -78) {
          L0: {
            if (!((hf) this).field_z) {
              break L0;
            } else {
              if (!((hf) this).field_y) {
                break L0;
              } else {
                param0.f(31);
                ((hf) this).field_C = true;
                if (((hf) this).field_k != null) {
                  if (((hf) this).field_k instanceof caa) {
                    ((caa) (Object) ((hf) this).field_k).a(((hf) this).field_C, 6202, (wj) this);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              }
            }
          }
          return false;
        } else {
          ((hf) this).field_y = true;
          if (((hf) this).field_z) {
            if (((hf) this).field_y) {
              param0.f(31);
              ((hf) this).field_C = true;
              if (((hf) this).field_k != null) {
                if (!(((hf) this).field_k instanceof caa)) {
                  return true;
                } else {
                  ((caa) (Object) ((hf) this).field_k).a(((hf) this).field_C, 6202, (wj) this);
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
        }
    }

    final boolean e(int param0) {
        if (param0 != 1023) {
            return true;
        }
        return ((hf) this).field_C;
    }

    boolean a(int param0, int param1, char param2, wj param3) {
        Object var6 = null;
        if (((hf) this).e(1023)) {
          if (84 != param1) {
            if (83 != param1) {
              if (param0 != 10) {
                var6 = null;
                boolean discarded$4 = ((hf) this).b(-23, -63, 65, 37, -115, (wj) null, 80);
                return false;
              } else {
                return false;
              }
            } else {
              ((hf) this).a(-1, 1, false, -1);
              return true;
            }
          } else {
            ((hf) this).a(-1, 1, false, -1);
            return true;
          }
        } else {
          if (param0 != 10) {
            var6 = null;
            boolean discarded$5 = ((hf) this).b(-23, -63, 65, 37, -115, (wj) null, 80);
            return false;
          } else {
            return false;
          }
        }
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        Object var6 = null;
        if (((hf) this).a(param0, param1, param3, (byte) 110)) {
          L0: {
            ((hf) this).a(9, param0, param3, param1);
            if (((hf) this).field_B) {
              StringBuilder discarded$8 = param3.append(" active");
              break L0;
            } else {
              break L0;
            }
          }
          if (!((hf) this).field_z) {
            StringBuilder discarded$9 = param3.append(" disabled");
            if (param2 <= 20) {
              var6 = null;
              ((hf) this).a(90, -123, (wj) null, 76);
              return param3;
            } else {
              return param3;
            }
          } else {
            if (param2 <= 20) {
              var6 = null;
              ((hf) this).a(90, -123, (wj) null, 76);
              return param3;
            } else {
              return param3;
            }
          }
        } else {
          if (param2 <= 20) {
            var6 = null;
            ((hf) this).a(90, -123, (wj) null, 76);
            return param3;
          } else {
            return param3;
          }
        }
    }

    hf(String param0, pl param1) {
        this(param0, fda.field_i.field_r, param1);
    }

    protected hf() {
        ((hf) this).field_C = false;
        ((hf) this).field_z = true;
        ((hf) this).field_y = true;
        ((hf) this).field_f = fda.field_i.field_j;
    }

    static {
    }
}
