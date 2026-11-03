/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends IntrusiveNode {
    static String field_k;
    static boolean field_i;
    int[] field_h;
    static String field_j;
    static String field_f;
    int field_g;

    final static int b(int param0, int param1) {
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        vh.field_Gb = null;
        vo.field_o = null;
        la.field_d = 0;
        int var2 = qe.field_f;
        qe.field_f = FullscreenFocusCanvas.field_b;
        FullscreenFocusCanvas.field_b = var2;
        if (param1 != 5) {
          PlatformTaskDispatcher var4 = (PlatformTaskDispatcher) null;
          u.a(-78, (PlatformTaskDispatcher) null, 25, -28, -35, -43);
          if (param0 == 51) {
            i.field_a.field_p = 2;
            i.field_a.field_n = i.field_a.field_n + 1;
            if (i.field_a.field_n < 2) {
              if (i.field_a.field_n >= 2 &&
                param0 == 50) {
                return 5;
              }
              if (4 > i.field_a.field_n) {
                return -1;
              }
              return 1;
            }
            if (param0 == 51) {
              return 2;
            }
            if (i.field_a.field_n < 2) {
              if (4 > i.field_a.field_n) {
                return -1;
              }
              return 1;
            }
            if (param0 == 50) {
              return 5;
            }
            if (4 > i.field_a.field_n) {
              return -1;
            }
            return 1;
          }
          if (param0 == 50) {
            i.field_a.field_p = 5;
            i.field_a.field_n = i.field_a.field_n + 1;
            if (i.field_a.field_n < 2) {
              if (i.field_a.field_n >= 2 &&
                param0 == 50) {
                return 5;
              }
              if (4 > i.field_a.field_n) {
                return -1;
              }
              return 1;
            }
            if (param0 == 51) {
              return 2;
            }
            if (i.field_a.field_n < 2) {
              if (4 > i.field_a.field_n) {
                return -1;
              }
              return 1;
            }
            if (param0 == 50) {
              return 5;
            }
            if (4 > i.field_a.field_n) {
              return -1;
            }
            return 1;
          }
          i.field_a.field_p = 1;
          i.field_a.field_n = i.field_a.field_n + 1;
          if (i.field_a.field_n < 2) {
            if (i.field_a.field_n < 2) {
              if (4 <= i.field_a.field_n) {
                return 1;
              }
              return -1;
            }
            if (param0 != 50) {
              if (4 <= i.field_a.field_n) {
                return 1;
              }
              return -1;
            }
            return 5;
          }
          if (param0 == 51) {
            return 2;
          }
          if (i.field_a.field_n < 2) {
            if (4 <= i.field_a.field_n) {
              return 1;
            }
            return -1;
          }
          if (param0 == 50) {
            return 5;
          }
          if (4 <= i.field_a.field_n) {
            return 1;
          }
          return -1;
        }
        if (param0 == 51) {
          i.field_a.field_p = 2;
          i.field_a.field_n = i.field_a.field_n + 1;
          if (i.field_a.field_n >= 2) {
            if (param0 != 51) {
              if (i.field_a.field_n < 2) {
                if (4 <= i.field_a.field_n) {
                  return 1;
                }
                return -1;
              }
              if (param0 != 50) {
                if (4 <= i.field_a.field_n) {
                  return 1;
                }
                return -1;
              }
              return 5;
            }
            return 2;
          }
          if (i.field_a.field_n >= 2 &&
            param0 == 50) {
            return 5;
          }
          if (4 <= i.field_a.field_n) {
            return 1;
          }
          return -1;
        }
        if (param0 == 50) {
          i.field_a.field_p = 5;
          i.field_a.field_n = i.field_a.field_n + 1;
          if (i.field_a.field_n >= 2) {
            if (param0 != 51) {
              if (i.field_a.field_n >= 2 &&
                param0 == 50) {
                return 5;
              }
              if (4 <= i.field_a.field_n) {
                return 1;
              }
              return -1;
            }
            return 2;
          }
          if (i.field_a.field_n >= 2 &&
            param0 == 50) {
            return 5;
          }
          if (4 <= i.field_a.field_n) {
            return 1;
          }
          return -1;
        }
        i.field_a.field_p = 1;
        i.field_a.field_n = i.field_a.field_n + 1;
        if (i.field_a.field_n >= 2) {
          if (param0 != 51) {
            if (i.field_a.field_n >= 2 &&
              param0 == 50) {
              return 5;
            }
            if (4 <= i.field_a.field_n) {
              return 1;
            }
            return -1;
          }
          return 2;
        }
        if (i.field_a.field_n >= 2 &&
          param0 == 50) {
          return 5;
        }
        if (4 <= i.field_a.field_n) {
          return 1;
        }
        return -1;
    }

    final static Sprite[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 21242) {
          return (Sprite[]) null;
        }
        return DualLinkNode.a(param3, param4, 1, 3, (byte) 127, param2, param1, 1, 1);
    }

    final static ResourceArchive a(int param0, int param1) {
        if (param0 == 5) {
          return wm.a(param1, 1, true, false, 19, false);
        }
        field_k = (String) null;
        return wm.a(param1, 1, true, false, 19, false);
    }

    public static void a(int param0) {
        field_k = null;
        field_f = null;
        if (param0 != -7406) {
          field_k = (String) null;
          field_j = null;
          return;
        }
        field_j = null;
    }

    final static int a(byte param0) {
        int stackIn_10_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var1_int = 0;
          var2 = 0;
          while (ba.c(-1)) {
            NetworkGameClient.field_B.d(99);
            if (NetworkGameClient.field_B.c(-85)) {
              var1_int = 1;
            }
            if (InfectionEvent.field_p != 13) {
              continue;
            }
            var2 = 1;
          }
          NetworkGameClient.field_B.a(iq.a(bo.field_d, -1, MouseInputHandler.field_g), 76, iq.a(ka.field_t, -1, vb.field_f));
          if (param0 > -50) {
            stackIn_10_0 = 119;
            return stackIn_10_0;
          }
          if (NetworkGameClient.field_B.c(-85)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            NetworkGameClient.field_B.field_d >= 0) {
            var3 = v.field_b[NetworkGameClient.field_B.field_d];
            if (2 == var3 ||
              5 == var3) {
              SimEntity.i(81);
            }
          } else {
            if (var2 != 0 &&
              2 != ho.field_q) {
              SimEntity.i(126);
            }
          }
          if (var3 == 0 &&
            ho.field_q == 2) {
            var4 = bl.a((byte) 118) - UnitStateEvent.field_s;
            var6 = (int)((-var4 + 10999L) / 1000L);
            if (var6 <= 0) {
              eb.a(false, true, 5);
              var3 = 2;
            }
          }
          stackIn_30_0 = var3;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "u.C(" + param0 + ')');
        }
    }

    final static FullscreenFocusCanvas a(int param0, PlatformTaskDispatcher param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        FullscreenFocusCanvas var7 = null;
        java.awt.Frame var8 = null;
        FullscreenFocusCanvas stackIn_2_0 = null;
        FullscreenFocusCanvas stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = m.a(param5, param1, param4, param3, param2, 88);
          var6 = var8;
          if (param0 != 10386) {
            stackIn_2_0 = (FullscreenFocusCanvas) null;
            return stackIn_2_0;
          }
          if (var8 == null) {
            return null;
          }
          var7 = new FullscreenFocusCanvas();
          var7.field_i = var8;
          var7.field_i.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param5, param2);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_7_0 = var7;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_10_0 = var6_ref;
          stackIn_10_1 = new StringBuilder().append("u.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private u() throws Throwable {
        throw new Error();
    }

    static {
        field_k = "(1 player wants to join)";
        field_j = "Rematch?";
        field_f = "Invalid name";
    }
}
