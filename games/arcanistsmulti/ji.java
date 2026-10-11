/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_e;
    static boolean field_d;
    static String field_j;
    static wk field_b;
    static int field_g;
    static String field_a;
    static String field_l;
    static String field_f;
    static qb[] field_h;
    static String field_k;
    static qb[] field_c;
    static String field_i;

    public static void a(int param0) {
        if (param0 != -733) {
          return;
        }
        field_f = null;
        field_l = null;
        field_k = null;
        field_a = null;
        field_h = null;
        field_i = null;
        field_c = null;
        field_b = null;
        field_j = null;
        field_e = null;
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != ch.field_a) {
            hg.field_b = 0;
            var2_int = param0.getKeyCode();
            if (0 <= var2_int &&
              var2_int < sb.field_h.length) {
              var2_int = sb.field_h[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (0 <= ub.field_b &&
              var2_int >= 0) {
              dk.field_d[ub.field_b] = ~var2_int;
              ub.field_b = 127 & ub.field_b + 1;
              if (ub.field_b == go.field_g) {
                ub.field_b = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("ji.keyReleased(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (null != ch.field_a) {
            hg.field_b = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < sb.field_h.length) {
              var2_int = sb.field_h[var2_int];
              if ((128 & var2_int) != 0) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (ub.field_b >= 0 &&
              var2_int >= 0) {
              dk.field_d[ub.field_b] = var2_int;
              ub.field_b = 127 & ub.field_b + 1;
              if (ub.field_b == go.field_g) {
                ub.field_b = -1;
              }
            }
            if (var2_int >= 0) {
              var3 = 1 + pi.field_a & 127;
              if (var3 != vk.field_u) {
                v.field_p[pi.field_a] = var2_int;
                qa.field_i[pi.field_a] = (char)0;
                pi.field_a = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if ((10 & var3Lifetime1) != 0 ||
              var2_int == 85 ||
              var2_int == 10) {
              param0.consume();
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("ji.keyPressed(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1) {
        if (param1 != -101) {
          field_e = (String) null;
        }
        if (tc.field_A != null) {
          tc.field_A.a(param0, true);
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(int param0, boolean param1, int param2, boolean param3) {
        int var5;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param2 == -1) {
          ed.a(param1, (byte) 106);
        } else {
          if (-2 == param2 &&
            bi.field_I > 3) {
            sc.a(2, an.field_j, an.field_f);
            de.d(bi.field_I - 3, 0, 646, an.field_j, 0);
          } else {
            if (-2 == param2) {
              de.b();
            } else {
              if (param3) {
                ed.a(false, (byte) 81);
                de.b(0, 0, an.field_f, an.field_j);
              }
              tl.field_f[param2].e((byte) -45);
            }
          }
        }
        if (param0 != -2) {
          field_a = (String) null;
        }
    }

    final static int a(int param0, byte[] param1, int param2, byte param3, CharSequence param4, int param5) {
        int var7 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var6_int = param5 - param0;
          for (var7 = 0; var7 < var6_int; var7++) {
            {
              var8 = param4.charAt(var7 + param0);
              if ((var8 <= 0 ||
                128 <= var8) && (var8 < 160 ||
                255 < var8)) {
                switch (var8) {
                  case 8364:
                    param1[param2 + var7] = (byte)-128;
                    break;
                  case 8218:
                    param1[param2 + var7] = (byte)-126;
                    break;
                  case 402:
                    param1[var7 + param2] = (byte)-125;
                    break;
                  case 8222:
                    param1[param2 + var7] = (byte)-124;
                    break;
                  case 8230:
                    param1[param2 + var7] = (byte)-123;
                    break;
                  case 8224:
                    param1[var7 + param2] = (byte)-122;
                    break;
                  case 8225:
                    param1[var7 + param2] = (byte)-121;
                    break;
                  case 710:
                    param1[param2 + var7] = (byte)-120;
                    break;
                  case 8240:
                    param1[param2 + var7] = (byte)-119;
                    break;
                  case 352:
                    param1[var7 + param2] = (byte)-118;
                    break;
                  case 8249:
                    param1[param2 + var7] = (byte)-117;
                    break;
                  case 338:
                    param1[param2 + var7] = (byte)-116;
                    break;
                  case 381:
                    param1[param2 + var7] = (byte)-114;
                    break;
                  case 8216:
                    param1[var7 + param2] = (byte)-111;
                    break;
                  case 8217:
                    param1[var7 + param2] = (byte)-110;
                    break;
                  case 8220:
                    param1[param2 + var7] = (byte)-109;
                    break;
                  case 8221:
                    param1[param2 + var7] = (byte)-108;
                    break;
                  case 8226:
                    param1[var7 + param2] = (byte)-107;
                    break;
                  case 8211:
                    param1[param2 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param1[var7 + param2] = (byte)-105;
                    break;
                  case 732:
                    param1[param2 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param1[param2 + var7] = (byte)-103;
                    break;
                  case 353:
                    param1[var7 + param2] = (byte)-102;
                    break;
                  case 8250:
                    param1[param2 + var7] = (byte)-101;
                    break;
                  case 339:
                    param1[param2 + var7] = (byte)-100;
                    break;
                  case 382:
                    param1[param2 + var7] = (byte)-98;
                    break;
                  default:
                    param1[var7 + param2] = (byte)63;
                    break;
                  case 376:
                    param1[param2 + var7] = (byte)-97;
                    break;
                }
              } else {
                param1[param2 + var7] = (byte)var8;
              }
            }
          }
          if (param3 != 89) {
            field_i = (String) null;
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("ji.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param5).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (ch.field_a != null) {
            ub.field_b = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ji.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != ch.field_a) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 && var2_int != 65535 &&
              hf.a((char) var2_int, (byte) 123)) {
              var3 = 1 + pi.field_a & 127;
              if (var3 != vk.field_u) {
                v.field_p[pi.field_a] = -1;
                qa.field_i[pi.field_a] = (char)var2_int;
                pi.field_a = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ji.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Send private message";
        field_k = "All players have left <%0>'s game.";
        field_d = false;
        field_l = "Spell Selection";
        field_f = "Suggested names: ";
        field_a = "This game option has not yet been unlocked for use.";
        field_i = "Passwords must be between 5 and 20 characters long";
    }
}
