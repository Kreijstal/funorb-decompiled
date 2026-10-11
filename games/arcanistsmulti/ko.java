/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko extends pg {
    int field_l;
    static kc field_h;
    int field_i;
    static String field_g;
    static int field_k;
    static dj field_j;

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
              if (param1 >= -56) {
                return;
              }
              param0.getAppletContext().showDocument(nm.a(param0, var2, -31843), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("ko.B(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, kc param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        eg var8 = null;
        ne var10 = null;
        qb var11 = null;
        String var12 = null;
        ne var13 = null;
        qb var14 = null;
        String var15 = null;
        ne var16 = null;
        qb var17 = null;
        String var18 = null;
        ne var19 = null;
        qb var20 = null;
        String var21 = null;
        ne var22 = null;
        qb var23 = null;
        String var24 = null;
        ne var25 = null;
        qb var26 = null;
        String var27 = null;
        ne var28 = null;
        qb var29 = null;
        String var30 = null;
        ne var31 = null;
        qb var32 = null;
        String var33 = null;
        ne var34 = null;
        qb var35 = null;
        String var36 = null;
        ne var37 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        qb var20Lifetime1;
        qb var20Lifetime2;
        qb var20Lifetime3;
        qb var20Lifetime4;
        qb var20Lifetime5;
        qb var20Lifetime6;
        try {
          ArcanistsMulti.a(-26335, (int[]) null, (dn) null, (String) null, 0L, param0, -1, (String) null, param1);
          if (param0 == 0) {
            var10 = eo.field_c;
            var11 = tl.field_a[0];
            var20 = var11;
            var20Lifetime2 = var11;
            var12 = oh.field_q;
            var10.field_l.a((byte) -32, 11, var11, var12);
            var13 = eo.field_c;
            var14 = tl.field_a[1];
            var20Lifetime3 = var14;
            var20Lifetime4 = var14;
            var15 = cj.field_c;
            var13.field_l.a((byte) -32, 12, var14, var15);
            var16 = eo.field_c;
            var17 = tl.field_a[2];
            var20Lifetime5 = var17;
            var20Lifetime6 = var17;
            var18 = jg.field_j;
            var16.field_l.a((byte) -32, 13, var17, var18);
          }
          if (1 == param0) {
            var19 = eo.field_c;
            var20Lifetime1 = tl.field_a[0];
            var21 = ug.field_f;
            var19.field_l.a((byte) -32, 11, var20Lifetime1, var21);
            var22 = eo.field_c;
            var23 = tl.field_a[1];
            var24 = wa.field_Hb;
            var22.field_l.a((byte) -32, 12, var23, var24);
            var25 = eo.field_c;
            var26 = tl.field_a[2];
            var27 = dm.field_J;
            var25.field_l.a((byte) -32, 13, var26, var27);
          }
          if (param0 == 2) {
            var28 = eo.field_c;
            var29 = tl.field_a[0];
            var30 = w.field_Jb;
            var28.field_l.a((byte) -32, 11, var29, var30);
            var31 = eo.field_c;
            var32 = tl.field_a[1];
            var33 = lk.field_l;
            var31.field_l.a((byte) -32, 12, var32, var33);
            var34 = eo.field_c;
            var35 = tl.field_a[2];
            var36 = ol.field_c;
            var34.field_l.a((byte) -32, 13, var35, var36);
          }
          var37 = eo.field_c;
          var4 = param1.field_V;
          var5 = param1.field_nb;
          var6 = param1.field_x;
          var7 = param1.field_I;
          var37.field_l.a(var6, var7, -29466, var5, var4);
          if (param2 > -51) {
            var8 = (eg) null;
            ko.a(99, (byte) -116, 31, (eg) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ko.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_h = null;
        field_g = null;
        if (param0 == 32) {
          return;
        }
        field_j = (dj) null;
    }

    final static ll[] a(int param0, byte param1, int param2, eg param3) {
        RuntimeException var4 = null;
        ll[] stackIn_2_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 94) {
            stackIn_2_0 = (ll[]) null;
            return stackIn_2_0;
          }
          if (fc.a(19, param3, param0, param2)) {
            return fk.c(0);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ko.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        StringBuilder discarded$0 = null;
        int var3;
        int var4;
        String var4_ref_String;
        int var5;
        String var7;
        String var8;
        int var9;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var57;
        String var58;
        String var59;
        String var60;
        String var61;
        String var62;
        Object var63;
        CharSequence var64;
        int var5Lifetime1;
        String var7Lifetime1;
        String var7Lifetime2;
        var63 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 >= -105) {
          return true;
        }
        var3 = 1;
        if (!di.field_j &&
          null == tm.field_d) {
          var3 = 0;
        }
        if (0 == nj.field_c &&
          null != om.field_x) {
          var3 = 0;
        }
        if (nj.field_c == 2 &&
          !wm.c(false)) {
          var3 = 0;
        }
        if (84 == vn.field_d) {
          if (var3 == 0) {
            if (0 == nj.field_c) {
              return true;
            }
            ue.b(10);
            return true;
          }
          if (hi.field_e.length() <= 0) {
            ue.b(10);
          } else {
            var4_ref_String = hi.field_e.toString();
            var7 = var4_ref_String;
            var7Lifetime2 = var4_ref_String;
            if (!p.a(-1, var4_ref_String)) {
              var5 = nj.field_c;
              if (0 == var5 &&
                wi.field_f != null) {
                var5 = 1;
              }
              if (oh.a((byte) 117, var5) != 2) {
                sd.a(-1, var4_ref_String, 82, param1, nj.field_c, so.field_p);
              } else {
                ea.a(param2, 1, true, var5);
                sd.a(-1, var4_ref_String, 82, param1, nj.field_c, so.field_p);
                ue.b(10);
              }
            } else {
              var13 = (String) null;
              var12 = (String) null;
              ao.a(0, (byte) 83, cd.field_q, (String) null, 2, (String) null);
              var15 = (String) null;
              var14 = (String) null;
              ao.a(0, (byte) 73, rg.field_b, (String) null, 2, (String) null);
              ue.b(10);
            }
          }
          return true;
        }
        if (vn.field_d == 85) {
          if (var3 == 0) {
            return true;
          }
          if (hi.field_e.length() <= 0) {
            return true;
          }
          qj.a(hi.field_e.length() - 1, hi.field_e, ' ', false);
          return true;
        }
        var4 = ed.field_Bb;
        if (!bg.a(-256, (char) var4)) {
          return false;
        }
        if (var3 == 0) {
          return true;
        }
        if (hi.field_e.length() >= 80) {
          return true;
        }
        discarded$0 = hi.field_e.append((char) var4);
        var5Lifetime1 = 485;
        var17 = ah.field_b;
        var16 = fg.a(var17, -2);
        var19 = var16;
        if (2 != nj.field_c) {
          var7Lifetime1 = "";
          if (0 != nj.field_c) {
            var57 = var7Lifetime1 + var19 + ": ";
            var5Lifetime1 = var5Lifetime1 - oo.field_x.b(var57);
            if (oo.field_x.b(hi.field_e.toString()) <= var5Lifetime1) {
              return true;
            }
            qj.a(-1 + hi.field_e.length(), hi.field_e, ' ', false);
            return true;
          }
          if (wi.field_f == null &&
            hm.field_c) {
            var7Lifetime1 = "[" + lj.field_p + "] ";
          }
          if (null != wi.field_f) {
            if (!oe.field_a) {
              var60 = "[" + tj.a(-68, new String[]{wi.field_f.field_ic}, ul.field_j) + "] ";
              var61 = var60 + var19 + ": ";
              var5Lifetime1 = var5Lifetime1 - oo.field_x.b(var61);
              if (oo.field_x.b(hi.field_e.toString()) <= var5Lifetime1) {
                return true;
              }
              qj.a(-1 + hi.field_e.length(), hi.field_e, ' ', false);
              return true;
            }
            if (he.field_d == null) {
              var58 = "[" + tj.a(-68, new String[]{wi.field_f.field_ic}, ul.field_j) + "] ";
              var59 = var58 + var19 + ": ";
              var5Lifetime1 = var5Lifetime1 - oo.field_x.b(var59);
              if (oo.field_x.b(hi.field_e.toString()) <= var5Lifetime1) {
                return true;
              }
              qj.a(-1 + hi.field_e.length(), hi.field_e, ' ', false);
              return true;
            }
            var7Lifetime1 = "[" + he.field_d + "] ";
          }
          var62 = var7Lifetime1 + var19 + ": ";
          var5Lifetime1 = var5Lifetime1 - oo.field_x.b(var62);
        } else {
          var64 = (CharSequence) ((Object) so.field_p);
          var18 = tj.a(-45, new String[]{qo.a((byte) 84, var64)}, ge.field_n);
          var8 = tj.a(113, new String[]{var16}, pk.field_f);
          var9 = oo.field_x.b(var18);
          var10 = oo.field_x.b(var8);
          if (var10 >= var9) {
            var5Lifetime1 = var5Lifetime1 - var10;
          } else {
            var5Lifetime1 = var5Lifetime1 - var9;
          }
        }
        if (oo.field_x.b(hi.field_e.toString()) <= var5Lifetime1) {
          return true;
        }
        qj.a(-1 + hi.field_e.length(), hi.field_e, ' ', false);
        return true;
    }

    final static int[] a(int[] param0, int[] param1, boolean param2) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ll var6 = null;
        int[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3 = new int[8];
          var4 = 0;
          if (!param2) {
            var6 = (ll) null;
            ko.a((nf) null, -45, 124, 15, (ll) null, 88);
          }
          while (var4 < 8) {
            var3[var4] = fj.b(param0[var4], param1[var4]);
            var4++;
          }
          stackIn_6_0 = var3;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("ko.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3Lifetime1;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          for (var2_int = 0; param1.length() > var2_int; var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!uh.a((char) var3, (byte) -122) &&
              !e.a(30, (char) var3)) {
              return true;
            }
          }
          var3Lifetime1 = 117 % ((-63 - param0) / 59);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ko.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private ko() throws Throwable {
        throw new Error();
    }

    final static boolean a(nf param0, int param1, int param2, int param3, ll param4, int param5) {
        qb var6 = null;
        RuntimeException var6_ref = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new qb(param3 * 2, 2 * param3);
          var6.a();
          de.i(param3, param3, param3, param5);
          stackIn_1_0 = fk.a(param0, -(param3 * 2) + param1, param4, param2 - param3, (byte) -1, var6);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_4_0 = var6_ref;
          stackIn_4_1 = new StringBuilder().append("ko.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_g = "This password contains repeated characters, and would be easy to guess";
        field_k = 71;
    }
}
