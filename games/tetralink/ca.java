/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

abstract class ca {
    int field_e;
    static Random field_i;
    String field_a;
    static String field_h;
    static String field_b;
    static int field_c;
    static int[] field_f;
    static long field_g;
    static String field_d;

    final static boolean c() {
        if (fn.field_R < 10) {
            return false;
        }
        if (bh.field_r) {
            return false;
        }
        return !r.d(0) ? true : false;
    }

    public static void d(int param0) {
        field_i = null;
        field_b = null;
        field_h = null;
        field_d = null;
        if (param0 != 0) {
            return;
        }
        field_f = null;
    }

    final static void b(int param0) {
        int var1 = nn.f((byte) -102);
        int discarded$0 = 32768;
        int var2 = ed.h();
        nm.field_o.a(ab.field_Q - fl.field_b, ja.field_j + -ng.field_D, (byte) -21, (ng.field_D << 1) + var1, var2 + (fl.field_b << 1));
        if (param0 >= -2) {
            ca.a(false, (byte) 121);
            int discarded$1 = 1;
            na.c();
            return;
        }
        int discarded$2 = 1;
        na.c();
    }

    final static void a(float param0, float param1, int param2) {
        if (cl.field_g == 2) {
            return;
        }
        rn.field_d = rn.field_d + param0;
        if (!(cl.field_g != 1)) {
            cl.field_g = 0;
        }
        if (!(rn.field_d >= 64.0f)) {
            rn.field_d = 64.0f;
        }
        if (rn.field_d > 440.0f) {
            rn.field_d = 440.0f;
            dj.field_h = dj.field_h + param1;
            ti.field_g[0] = (double)rn.field_d * Math.sin((double)dj.field_h);
            ti.field_g[2] = (double)rn.field_d * Math.cos((double)dj.field_h);
            eo.a(param2 ^ 2505);
            ah.field_a = dh.field_e;
            if (param2 == -2452) {
                return;
            }
            field_i = null;
            return;
        }
        dj.field_h = dj.field_h + param1;
        ti.field_g[0] = (double)rn.field_d * Math.sin((double)dj.field_h);
        ti.field_g[2] = (double)rn.field_d * Math.cos((double)dj.field_h);
        eo.a(param2 ^ 2505);
        ah.field_a = dh.field_e;
        if (param2 != -2452) {
            field_i = null;
            return;
        }
    }

    final java.net.Socket a(int param0) throws IOException {
        if (param0 != -1) {
            return null;
        }
        return new java.net.Socket(((ca) this).field_a, ((ca) this).field_e);
    }

    abstract java.net.Socket a(byte param0) throws IOException;

    final static void a(boolean param0, byte param1) {
        int var3 = 0;
        var3 = TetraLink.field_J;
        if (param0) {
          lg.field_S = false;
          if (param0) {
            if (0 >= qd.field_ab) {
              if (ng.field_t <= 0) {
                if (am.field_f > 0) {
                  am.field_f = am.field_f - 1;
                  if (param1 == 16) {
                    return;
                  } else {
                    ca.b(-74);
                    return;
                  }
                } else {
                  if (param1 == 16) {
                    return;
                  } else {
                    ca.b(-74);
                    return;
                  }
                }
              } else {
                ng.field_t = ng.field_t - 1;
                if (param1 == 16) {
                  return;
                } else {
                  ca.b(-74);
                  return;
                }
              }
            } else {
              qd.field_ab = qd.field_ab - 1;
              if (param1 == 16) {
                return;
              } else {
                ca.b(-74);
                return;
              }
            }
          } else {
            if (qb.field_N == null) {
              if (qe.field_a != null) {
                if (qd.field_ab <= 0) {
                  if (am.field_f <= 0) {
                    if (ma.field_f > ng.field_t) {
                      L0: {
                        if (ng.field_t == 0) {
                          int discarded$6 = -128;
                          ic.a(true);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                      ng.field_t = ng.field_t + 1;
                      if (param1 == 16) {
                        return;
                      } else {
                        ca.b(-74);
                        return;
                      }
                    } else {
                      if (param1 != 16) {
                        ca.b(-74);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    am.field_f = am.field_f - 1;
                    if (param1 == 16) {
                      return;
                    } else {
                      ca.b(-74);
                      return;
                    }
                  }
                } else {
                  qd.field_ab = qd.field_ab - 1;
                  if (param1 == 16) {
                    return;
                  } else {
                    ca.b(-74);
                    return;
                  }
                }
              } else {
                lg.field_S = false;
                if (ng.field_t > 0) {
                  ng.field_t = ng.field_t - 1;
                  if (param1 == 16) {
                    return;
                  } else {
                    ca.b(-74);
                    return;
                  }
                } else {
                  if (am.field_f > 0) {
                    am.field_f = am.field_f - 1;
                    if (param1 == 16) {
                      return;
                    } else {
                      ca.b(-74);
                      return;
                    }
                  } else {
                    if (~qd.field_ab > ~ma.field_f) {
                      if (0 == qd.field_ab) {
                        pd.b(false);
                        qd.field_ab = qd.field_ab + 1;
                        if (param1 == 16) {
                          return;
                        } else {
                          ca.b(-74);
                          return;
                        }
                      } else {
                        qd.field_ab = qd.field_ab + 1;
                        if (param1 == 16) {
                          return;
                        } else {
                          ca.b(-74);
                          return;
                        }
                      }
                    } else {
                      if (param1 == 16) {
                        return;
                      } else {
                        ca.b(-74);
                        return;
                      }
                    }
                  }
                }
              }
            } else {
              if (qd.field_ab > 0) {
                qd.field_ab = qd.field_ab - 1;
                if (param1 == 16) {
                  return;
                } else {
                  ca.b(-74);
                  return;
                }
              } else {
                if (ng.field_t <= 0) {
                  if (am.field_f < ma.field_f) {
                    L1: {
                      if (am.field_f == 0) {
                        int discarded$7 = -128;
                        ic.a(false);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    am.field_f = am.field_f + 1;
                    if (param1 == 16) {
                      return;
                    } else {
                      ca.b(-74);
                      return;
                    }
                  } else {
                    if (param1 == 16) {
                      return;
                    } else {
                      ca.b(-74);
                      return;
                    }
                  }
                } else {
                  ng.field_t = ng.field_t - 1;
                  if (param1 == 16) {
                    return;
                  } else {
                    ca.b(-74);
                    return;
                  }
                }
              }
            }
          }
        } else {
          if (qb.field_N == null) {
            lg.field_S = false;
            if (param0) {
              if (0 >= qd.field_ab) {
                if (ng.field_t <= 0) {
                  if (am.field_f > 0) {
                    am.field_f = am.field_f - 1;
                    if (param1 == 16) {
                      return;
                    } else {
                      ca.b(-74);
                      return;
                    }
                  } else {
                    if (param1 == 16) {
                      return;
                    } else {
                      ca.b(-74);
                      return;
                    }
                  }
                } else {
                  ng.field_t = ng.field_t - 1;
                  if (param1 == 16) {
                    return;
                  } else {
                    ca.b(-74);
                    return;
                  }
                }
              } else {
                qd.field_ab = qd.field_ab - 1;
                if (param1 == 16) {
                  return;
                } else {
                  ca.b(-74);
                  return;
                }
              }
            } else {
              if (qb.field_N == null) {
                if (qe.field_a != null) {
                  if (qd.field_ab <= 0) {
                    if (am.field_f <= 0) {
                      if (ma.field_f > ng.field_t) {
                        L2: {
                          if (ng.field_t == 0) {
                            int discarded$8 = -128;
                            ic.a(true);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        ng.field_t = ng.field_t + 1;
                        if (param1 == 16) {
                          return;
                        } else {
                          ca.b(-74);
                          return;
                        }
                      } else {
                        if (param1 != 16) {
                          ca.b(-74);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      am.field_f = am.field_f - 1;
                      if (param1 == 16) {
                        return;
                      } else {
                        ca.b(-74);
                        return;
                      }
                    }
                  } else {
                    qd.field_ab = qd.field_ab - 1;
                    if (param1 == 16) {
                      return;
                    } else {
                      ca.b(-74);
                      return;
                    }
                  }
                } else {
                  lg.field_S = false;
                  if (ng.field_t > 0) {
                    ng.field_t = ng.field_t - 1;
                    if (param1 == 16) {
                      return;
                    } else {
                      ca.b(-74);
                      return;
                    }
                  } else {
                    if (am.field_f > 0) {
                      am.field_f = am.field_f - 1;
                      if (param1 == 16) {
                        return;
                      } else {
                        ca.b(-74);
                        return;
                      }
                    } else {
                      if (~qd.field_ab > ~ma.field_f) {
                        if (0 == qd.field_ab) {
                          pd.b(false);
                          qd.field_ab = qd.field_ab + 1;
                          if (param1 == 16) {
                            return;
                          } else {
                            ca.b(-74);
                            return;
                          }
                        } else {
                          qd.field_ab = qd.field_ab + 1;
                          if (param1 == 16) {
                            return;
                          } else {
                            ca.b(-74);
                            return;
                          }
                        }
                      } else {
                        if (param1 == 16) {
                          return;
                        } else {
                          ca.b(-74);
                          return;
                        }
                      }
                    }
                  }
                }
              } else {
                if (qd.field_ab > 0) {
                  qd.field_ab = qd.field_ab - 1;
                  if (param1 == 16) {
                    return;
                  } else {
                    ca.b(-74);
                    return;
                  }
                } else {
                  if (ng.field_t <= 0) {
                    if (am.field_f < ma.field_f) {
                      L3: {
                        if (am.field_f == 0) {
                          int discarded$9 = -128;
                          ic.a(false);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      am.field_f = am.field_f + 1;
                      if (param1 == 16) {
                        return;
                      } else {
                        ca.b(-74);
                        return;
                      }
                    } else {
                      if (param1 == 16) {
                        return;
                      } else {
                        ca.b(-74);
                        return;
                      }
                    }
                  } else {
                    ng.field_t = ng.field_t - 1;
                    if (param1 == 16) {
                      return;
                    } else {
                      ca.b(-74);
                      return;
                    }
                  }
                }
              }
            }
          } else {
            if (param0) {
              if (0 >= qd.field_ab) {
                if (ng.field_t <= 0) {
                  if (am.field_f > 0) {
                    am.field_f = am.field_f - 1;
                    if (param1 == 16) {
                      return;
                    } else {
                      ca.b(-74);
                      return;
                    }
                  } else {
                    if (param1 == 16) {
                      return;
                    } else {
                      ca.b(-74);
                      return;
                    }
                  }
                } else {
                  ng.field_t = ng.field_t - 1;
                  if (param1 == 16) {
                    return;
                  } else {
                    ca.b(-74);
                    return;
                  }
                }
              } else {
                qd.field_ab = qd.field_ab - 1;
                if (param1 == 16) {
                  return;
                } else {
                  ca.b(-74);
                  return;
                }
              }
            } else {
              if (qb.field_N == null) {
                if (qe.field_a != null) {
                  if (qd.field_ab <= 0) {
                    if (am.field_f <= 0) {
                      if (ma.field_f > ng.field_t) {
                        L4: {
                          if (ng.field_t == 0) {
                            int discarded$10 = -128;
                            ic.a(true);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        ng.field_t = ng.field_t + 1;
                        if (param1 == 16) {
                          return;
                        } else {
                          ca.b(-74);
                          return;
                        }
                      } else {
                        if (param1 != 16) {
                          ca.b(-74);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      am.field_f = am.field_f - 1;
                      if (param1 == 16) {
                        return;
                      } else {
                        ca.b(-74);
                        return;
                      }
                    }
                  } else {
                    qd.field_ab = qd.field_ab - 1;
                    if (param1 == 16) {
                      return;
                    } else {
                      ca.b(-74);
                      return;
                    }
                  }
                } else {
                  lg.field_S = false;
                  if (ng.field_t > 0) {
                    ng.field_t = ng.field_t - 1;
                    if (param1 == 16) {
                      return;
                    } else {
                      ca.b(-74);
                      return;
                    }
                  } else {
                    if (am.field_f > 0) {
                      am.field_f = am.field_f - 1;
                      if (param1 == 16) {
                        return;
                      } else {
                        ca.b(-74);
                        return;
                      }
                    } else {
                      if (~qd.field_ab > ~ma.field_f) {
                        if (0 == qd.field_ab) {
                          pd.b(false);
                          qd.field_ab = qd.field_ab + 1;
                          if (param1 == 16) {
                            return;
                          } else {
                            ca.b(-74);
                            return;
                          }
                        } else {
                          qd.field_ab = qd.field_ab + 1;
                          if (param1 == 16) {
                            return;
                          } else {
                            ca.b(-74);
                            return;
                          }
                        }
                      } else {
                        if (param1 == 16) {
                          return;
                        } else {
                          ca.b(-74);
                          return;
                        }
                      }
                    }
                  }
                }
              } else {
                if (qd.field_ab > 0) {
                  qd.field_ab = qd.field_ab - 1;
                  if (param1 == 16) {
                    return;
                  } else {
                    ca.b(-74);
                    return;
                  }
                } else {
                  if (ng.field_t <= 0) {
                    if (am.field_f < ma.field_f) {
                      L5: {
                        if (am.field_f == 0) {
                          int discarded$11 = -128;
                          ic.a(false);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      am.field_f = am.field_f + 1;
                      if (param1 == 16) {
                        return;
                      } else {
                        ca.b(-74);
                        return;
                      }
                    } else {
                      if (param1 == 16) {
                        return;
                      } else {
                        ca.b(-74);
                        return;
                      }
                    }
                  } else {
                    ng.field_t = ng.field_t - 1;
                    if (param1 == 16) {
                      return;
                    } else {
                      ca.b(-74);
                      return;
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new Random();
        field_h = "Shortcut Reference";
        field_b = "Decline invitation to <%0>'s game";
        field_f = new int[4];
        field_d = "(1 player wants to join)";
    }
}
