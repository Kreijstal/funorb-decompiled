/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static String field_c;
    static int field_a;
    static int field_b;

    final static qj a(fa param0, fa param1, byte param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        qj stackIn_5_0 = null;
        qj stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!vh.a(param4, param3, param1, true)) {
            stackIn_2_0 = null;
            return (qj) (stackIn_2_0);
          }
          if (param2 > 12) {
            stackIn_7_0 = sb.a(false, param0.b(param4, -95, param3));
            return stackIn_7_0;
          }
          stackIn_5_0 = (qj) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("nl.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0, String param1, java.applet.Applet param2) {
        try {
          int var3_int = 0;
          java.net.URL var4 = null;
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          RuntimeException var3_ref = null;
          try {
            try {
              var3_int = -19 / ((param0 + 28) / 32);
              var4 = new java.net.URL(param2.getCodeBase(), param1);
              var4 = bb.a((byte) 119, var4, param2);
              m.a(param2, true, var4.toString(), 0);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              var3.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = var3_ref;
            stackIn_6_1 = new StringBuilder().append("nl.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
            if (param2 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        l.d(0, 74, 640, 406, 0, 192);
        if (param0 >= 72) {
          rf.field_B[bk.d(23196)].a(0, 0, 102);
          l.e(0, 74, 640, 406, 16777215);
          aa.field_j.b(120, 76);
          if (ef.field_j >= 120 &&
            jb.field_b >= 76 &&
            220 >= ef.field_j) {
            if (jb.field_b > 104) {
              if (!rf.field_B[7].field_d) {
                return;
              }
              wh.field_e.b(20, 76);
              if (ef.field_j >= 20 &&
                jb.field_b >= 76 &&
                120 >= ef.field_j &&
                jb.field_b <= 104) {
                l.d(20, 76, 100, 28, 16777215, 128);
              }
              qh.field_b.b(520, 76);
              if (ef.field_j < 520) {
                return;
              }
              if (jb.field_b < 76) {
                return;
              }
              if (ef.field_j > 620) {
                return;
              }
              if (jb.field_b > 104) {
                return;
              }
              if (ef.field_j < 0) {
                return;
              }
              l.d(520, 76, 100, 28, 16777215, 128);
              return;
            }
            l.d(120, 76, 100, 28, 16777215, 128);
          }
          if (!rf.field_B[7].field_d) {
            return;
          }
          wh.field_e.b(20, 76);
          if (ef.field_j >= 20 &&
            jb.field_b >= 76 &&
            120 >= ef.field_j) {
            if (jb.field_b > 104) {
              qh.field_b.b(520, 76);
              if (ef.field_j < 520) {
                return;
              }
              if (jb.field_b < 76) {
                return;
              }
              if (ef.field_j > 620) {
                return;
              }
              if (jb.field_b > 104) {
                return;
              }
              if (ef.field_j < 0) {
                return;
              }
              l.d(520, 76, 100, 28, 16777215, 128);
              return;
            }
            l.d(20, 76, 100, 28, 16777215, 128);
          }
          qh.field_b.b(520, 76);
          if (ef.field_j >= 520 &&
            jb.field_b >= 76 &&
            ef.field_j <= 620 &&
            jb.field_b <= 104 &&
            ef.field_j >= 0) {
            l.d(520, 76, 100, 28, 16777215, 128);
            return;
          }
          return;
        }
        nl.a(105);
        rf.field_B[bk.d(23196)].a(0, 0, 102);
        l.e(0, 74, 640, 406, 16777215);
        aa.field_j.b(120, 76);
        if (ef.field_j < 120) {
          if (rf.field_B[7].field_d) {
            wh.field_e.b(20, 76);
            if (ef.field_j >= 20 &&
              jb.field_b >= 76 &&
              120 >= ef.field_j &&
              jb.field_b <= 104) {
              l.d(20, 76, 100, 28, 16777215, 128);
            }
            qh.field_b.b(520, 76);
            if (ef.field_j >= 520 &&
              jb.field_b >= 76 &&
              ef.field_j <= 620 &&
              jb.field_b <= 104 &&
              ef.field_j >= 0) {
              l.d(520, 76, 100, 28, 16777215, 128);
            }
          }
          return;
        }
        if (jb.field_b < 76) {
          if (rf.field_B[7].field_d) {
            wh.field_e.b(20, 76);
            if (ef.field_j >= 20 &&
              jb.field_b >= 76 &&
              120 >= ef.field_j &&
              jb.field_b <= 104) {
              l.d(20, 76, 100, 28, 16777215, 128);
            }
            qh.field_b.b(520, 76);
            if (ef.field_j >= 520 &&
              jb.field_b >= 76 &&
              ef.field_j <= 620 &&
              jb.field_b <= 104 &&
              ef.field_j >= 0) {
              l.d(520, 76, 100, 28, 16777215, 128);
            }
          }
          return;
        }
        if (220 >= ef.field_j) {
          if (jb.field_b > 104) {
            if (rf.field_B[7].field_d) {
              wh.field_e.b(20, 76);
              if (ef.field_j >= 20 &&
                jb.field_b >= 76 &&
                120 >= ef.field_j &&
                jb.field_b <= 104) {
                l.d(20, 76, 100, 28, 16777215, 128);
              }
              qh.field_b.b(520, 76);
              if (ef.field_j >= 520 &&
                jb.field_b >= 76 &&
                ef.field_j <= 620 &&
                jb.field_b <= 104 &&
                ef.field_j >= 0) {
                l.d(520, 76, 100, 28, 16777215, 128);
              }
            }
            return;
          }
          l.d(120, 76, 100, 28, 16777215, 128);
        }
        if (!rf.field_B[7].field_d) {
          return;
        }
        wh.field_e.b(20, 76);
        if (ef.field_j >= 20 &&
          jb.field_b >= 76 &&
          120 >= ef.field_j) {
          if (jb.field_b > 104) {
            qh.field_b.b(520, 76);
            if (ef.field_j >= 520 &&
              jb.field_b >= 76 &&
              ef.field_j <= 620 &&
              jb.field_b <= 104 &&
              ef.field_j >= 0) {
              l.d(520, 76, 100, 28, 16777215, 128);
            }
            return;
          }
          l.d(20, 76, 100, 28, 16777215, 128);
        }
        qh.field_b.b(520, 76);
        if (ef.field_j < 520) {
          return;
        }
        if (jb.field_b < 76) {
          return;
        }
        if (ef.field_j > 620) {
          return;
        }
        if (jb.field_b > 104) {
          return;
        }
        if (ef.field_j < 0) {
          return;
        }
        l.d(520, 76, 100, 28, 16777215, 128);
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_c = (String) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_b = 0;
        field_c = "Click on one of the highlighted missions on the map";
    }
}
