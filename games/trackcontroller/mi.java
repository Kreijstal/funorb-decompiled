/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mi extends el {
    private eh field_S;
    private qj field_P;
    private int field_Q;
    private String field_R;

    final static int a(int param0, int param1) {
        if (param0 != 2048) {
            return -107;
        }
        param1 = param1 & 8191;
        if (4096 > param1) {
            return (param1 ^ -1) <= -2049 ? -ta.field_b[param1 - 2048] : ta.field_b[2048 + -param1];
        }
        return -6145 >= (param1 ^ -1) ? ta.field_b[-6144 + param1] : -ta.field_b[6144 - param1];
    }

    final static void k(int param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              var3 = TrackController.field_F ? 1 : 0;
              if (rj.field_d != null) {
                rj.field_d.c((byte) 101);
                break L0;
              } else {
                break L0;
              }
            }
            if (param0 == 10228) {
              L1: {
                if (rb.field_a != null) {
                  rb.field_a.a(83);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (null != sd.field_c) {
                  try {
                    L3: {
                      sd.field_c.d(0);
                      break L3;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      iOException = (IOException) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  break L2;
                } else {
                  break L2;
                }
              }
              L5: {
                if (kh.field_e == null) {
                  break L5;
                } else {
                  var1 = 0;
                  L6: while (true) {
                    if (var1 >= kh.field_e.length) {
                      break L5;
                    } else {
                      if (null != kh.field_e[var1]) {
                        try {
                          L7: {
                            kh.field_e[var1].d(0);
                            var1++;
                            break L7;
                          }
                        } catch (java.io.IOException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L8: {
                            var2 = (IOException) (Object) decompiledCaughtException;
                            var1++;
                            break L8;
                          }
                        }
                        continue L6;
                      } else {
                        var1++;
                        continue L6;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        ud var6 = null;
        dl var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qj var14 = null;
        qj var15 = null;
        qj var16 = null;
        var13 = TrackController.field_F ? 1 : 0;
        if (param3 == 29221) {
          L0: {
            L1: {
              L2: {
                L3: {
                  var6 = ((mi) this).field_S.a((byte) -61);
                  if (lh.field_x == var6) {
                    break L3;
                  } else {
                    if (var6 == tk.field_t) {
                      break L3;
                    } else {
                      var5 = ((mi) this).field_S.c(param3 ^ 19471);
                      if (var5 == null) {
                        var5 = ((mi) this).field_R;
                        break L2;
                      } else {
                        if (!var5.equals((Object) (Object) ((mi) this).field_s)) {
                          break L1;
                        } else {
                          break L0;
                        }
                      }
                    }
                  }
                }
                var5 = bf.field_d;
                break L2;
              }
              if (!var5.equals((Object) (Object) ((mi) this).field_s)) {
                break L1;
              } else {
                break L0;
              }
            }
            ((mi) this).field_s = var5;
            ((mi) this).b(true);
            break L0;
          }
          L4: {
            L5: {
              super.a(param0, param1, param2, param3 ^ 0);
              var6 = ((mi) this).field_S.a((byte) -5);
              var8 = (dl) (Object) ((mi) this).field_y;
              var9 = param1 + ((mi) this).field_p;
              var10 = var8.a((al) this, param3 ^ -29188, param2) - -(var8.a((byte) 124, (al) this).a(12323) >> 1705814337);
              if (var6 == lh.field_x) {
                break L5;
              } else {
                if (var6 != tk.field_t) {
                  if (ef.field_b == var6) {
                    var16 = TrackController.field_D[2];
                    var16.a(var9, var10 - (var16.field_q >> 1622060385), 256);
                    break L4;
                  } else {
                    if (TrackController.field_G == var6) {
                      var15 = TrackController.field_D[1];
                      var15.a(var9, -(var15.field_q >> -2053846399) + var10, 256);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L6: {
              L7: {
                var14 = TrackController.field_D[0];
                var11 = var14.field_s << -2114628991;
                var12 = var14.field_v << 334497185;
                if (null == ((mi) this).field_P) {
                  break L7;
                } else {
                  if (var11 > ((mi) this).field_P.field_t) {
                    break L7;
                  } else {
                    if (var12 <= ((mi) this).field_P.field_q) {
                      mb.a((byte) 126, ((mi) this).field_P);
                      ll.a();
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              ((mi) this).field_P = new qj(var11, var12);
              mb.a((byte) -110, ((mi) this).field_P);
              break L6;
            }
            var14.a(112, 144, var14.field_s << 1363577220, var14.field_v << 527421796, -((mi) this).field_Q << -1784963862, 4096);
            ch.m(57);
            ((mi) this).field_P.a(-(var14.field_s >> -1530072255) + var9, var10 + -var14.field_v, 256);
            break L4;
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte param2, al param3) {
        ((mi) this).field_Q = ((mi) this).field_Q + 1;
        super.a(param0, param1, param2, param3);
    }

    final boolean a(byte param0, al param1) {
        if (param0 >= -104) {
            Object var4 = null;
            ((mi) this).a(66, -39, (byte) 109, (al) null);
        }
        return false;
    }

    final String e(int param0) {
        if (param0 == 0) {
            return null;
        }
        ((mi) this).field_R = null;
        return null;
    }

    mi(eh param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (t) (Object) jc.a((byte) 97));
        ((mi) this).field_S = param0;
        ((mi) this).field_R = param1;
        ((mi) this).a(param5, -3050, param3, param4, param2);
    }

    static {
    }
}
