declare @data int;

exec SP_Alta_Refrendo 'Saul', 'Hernandez', 'Pérez', '4771112784', 'hgf4758', @data output;

select @data;

select * from tbl_refrendo